# Gradle Projects

This folder holds two Gradle projects:

| Folder | Type | Purpose |
|---|---|---|
| `gradle-sample/` | Plain Java Gradle project | Learn Gradle and core Java builds |
| `spring-boot-gradle-app/` | Spring Boot Gradle project | Build web applications and REST APIs |

## What are they?

**Gradle** is a build tool. It downloads dependencies, compiles code, runs tests and packages the application.

**A plain Gradle project** is a Java application built with Gradle, with no framework.

**Spring Boot** is a Java framework for building applications with little configuration. A Spring Boot Gradle project uses Gradle as the build tool and adds Spring Boot on top. Its `build.gradle` contains the `org.springframework.boot` plugin.

## Comparison

| | Plain Gradle | Spring Boot with Gradle |
|---|---|---|
| Created by | `gradle init` | Spring Initializr |
| Framework | None | Spring Boot |
| Build file | `app/build.gradle` | `build.gradle` |
| Source code | `app/src/main/java` | `src/main/java` |
| Configuration | `app/src/main/resources` | `src/main/resources/application.properties` |
| Web server | None | Embedded Tomcat (with the web dependency) |
| Run command | `.\gradlew run` | `.\gradlew bootRun` |

## Use cases

**Plain Gradle project**

- Learning how Gradle works
- Core Java and DSA practice
- Command-line tools
- Libraries shared between projects

**Spring Boot project**

- REST APIs
- Web applications
- Microservices
- Applications that need a database, security or scheduled jobs

## Prerequisites

- JDK 21 (`java -version`)
- Gradle (`gradle -v`), needed only to run `gradle init`. On Windows, install it from an Administrator terminal with `choco install gradle`.

The commands below are for PowerShell.

## Create a plain Gradle project

`gradle init` generates files in the current folder, so start in a new, empty one:

```powershell
cd C:\java-dsa\03Gradle
mkdir my-gradle-app
cd my-gradle-app
gradle init
```

Suggested answers:

| Prompt | Answer |
|---|---|
| Type of build | Application |
| Implementation language | Java |
| Target Java version | 21 |
| Project name | your project name |
| Application structure | Single application project |
| Build script DSL | Groovy |
| Test framework | JUnit Jupiter |
| Use new APIs and behavior | no |

## Create a Spring Boot Gradle project

`gradle init` cannot create a Spring Boot project. Use Spring Initializr in one of these ways. Artifact IDs should be lowercase, with hyphens between words, such as `spring-boot-demo`.

### Option 1: VS Code

1. Install the **Spring Boot Extension Pack** and **Gradle for Java** extensions.
2. Press `Ctrl+Shift+P` and run **Spring Initializr: Create a Gradle Project**.
3. Choose a stable Spring Boot version, Java, Jar packaging and Java 21.
4. Enter the group ID (`com.example`) and the artifact ID.
5. Add the **Spring Web** and **Spring Boot DevTools** dependencies.
6. Select `C:\java-dsa\03Gradle` as the destination folder.

### Option 2: Terminal

```powershell
cd C:\java-dsa\03Gradle
curl.exe -f https://start.spring.io/starter.zip -d type=gradle-project -d language=java -d javaVersion=21 -d groupId=com.example -d artifactId=spring-boot-demo -d name=spring-boot-demo -d packageName=com.example.demo -d baseDir=spring-boot-demo -d "dependencies=web,devtools" -o demo.zip
tar -xf demo.zip
Remove-Item demo.zip
```

### Option 3: Spring Tools for Eclipse

1. Select **File > New > Spring Starter Project**.
2. Set **Type** to Gradle, choose Java 21 and add the dependencies.
3. To open an existing project instead, select **File > Import > Gradle > Existing Gradle Project**.

## Run the projects

Plain Gradle project:

```powershell
cd C:\java-dsa\03Gradle\gradle-sample
.\gradlew run
```

Spring Boot project:

```powershell
cd C:\java-dsa\03Gradle\spring-boot-gradle-app
.\gradlew bootRun
```

The Spring Boot application starts at <http://localhost:8080>. It returns a 404 error page until you add a controller.

## Walkthrough: `spring-boot-gradle-app`

These are the steps used to add a web endpoint to this project and run it.

### 1. Create the project

Create it with Spring Initializr (see [Create a Spring Boot Gradle project](#create-a-spring-boot-gradle-project)), using Java 21, the artifact ID `spring-boot-gradle-app` and the **Spring Web** dependency.

Java package names cannot contain hyphens, so the base package is `com.example.spring_boot_gradle_app`.

### 2. Create the controller folder

Create a `Webapp` folder **inside** the folder that holds the main class:

```powershell
cd C:\java-dsa\03Gradle\spring-boot-gradle-app
mkdir src\main\java\com\example\spring_boot_gradle_app\Webapp
```

The result is:

```
src/main/java/com/example/spring_boot_gradle_app/
├── SpringBootGradleAppApplication.java
└── Webapp/
    └── EXcontroller.java
```

Spring Boot scans only the main class package and its subpackages. A `Webapp` folder placed beside `spring_boot_gradle_app` is not scanned, and the endpoint returns 404.

### 3. Add the controller

Create `EXcontroller.java` in the `Webapp` folder:

```java
package com.example.spring_boot_gradle_app.Webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EXcontroller {

	@GetMapping("/")
	public String getInfo() {
		return "Gradle app";
	}

}
```

### 4. Build the jar

Run this from the project root, not from `build\libs`:

```powershell
cd C:\java-dsa\03Gradle\spring-boot-gradle-app
.\gradlew bootJar
```

The jar is written to `build\libs`:

| File | Use |
|---|---|
| `spring-boot-gradle-app-0.0.1-SNAPSHOT.jar` | Runnable application, including dependencies |
| `spring-boot-gradle-app-0.0.1-SNAPSHOT-plain.jar` | Project classes only, not runnable. It appears after `.\gradlew build` |

### 5. Run the application

From the project root:

```powershell
java -jar build\libs\spring-boot-gradle-app-0.0.1-SNAPSHOT.jar --server.port=8081
```

Open <http://localhost:8081/>. The page shows `Gradle app`. Press `Ctrl+C` to stop the server.

`--server.port=8081` is needed only when port 8080 is already in use. To set the port permanently, add `server.port=8081` to `src/main/resources/application.properties` and rebuild.

After changing the code, stop the server, build again and run again.

### Troubleshooting

| Message | Cause | Fix |
|---|---|---|
| `Task '...jar' not found` | `gradle` runs tasks, not jar files | Run the jar with `java -jar` |
| `Project directory ... is not part of the build` | Gradle was run inside `build\libs` | Go to the project root |
| `Unable to access jarfile build\libs\...` | The command was run inside `build\libs`, so the path is doubled | Go to the project root, or use only the file name |
| `Port 8080 was already in use` | Another process uses the port | Add `--server.port=8081` |
| 404 on `/` | The controller is outside the scanned package | Move it under `spring_boot_gradle_app` |

## Common commands

Run these inside a project folder.

| Command | Action |
|---|---|
| `.\gradlew build` | Compile, test and package |
| `.\gradlew test` | Run tests |
| `.\gradlew clean` | Delete build output |
| `.\gradlew tasks` | List available tasks |
| `.\gradlew dependencies` | Show the dependency tree (use `.\gradlew app:dependencies` in `gradle-sample`) |

Use `.\gradlew` (the Gradle wrapper) instead of `gradle` inside a project. The wrapper runs the Gradle version chosen for that project.
