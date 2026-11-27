package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}


// # Maven cheat sheet: JAR vs WAR (PowerShell)

// ## 1. Create JAR project (plain Java app)
// ```powershell
// cd C:\java-dsa
// mvn archetype:generate "-DgroupId=com.example" "-DartifactId=foldername" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"
// cd my-jar
// mvn clean package
// java -cp target\my-jar-1.0-SNAPSHOT.jar com.example.App
// ```
// Output: `target\my-jar-1.0-SNAPSHOT.jar`

// ## 2. Create WAR project (web app)
// ```powershell
// cd C:\java-dsa
// mvn archetype:generate "-DgroupId=com.example" "-DartifactId=my-war" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"
// cd my-war
// mvn clean package
// ```
// Output: `target\my-war.war`. Deploy: copy to `Tomcat\webapps\`, open `http://localhost:8080/my-war/`.


// Only `artifactId`, `groupId` and `archetypeArtifactId` change per project.

// ## 4. Rules
// - PowerShell: quote every `-D...` arg. Dots split unquoted args.
// - Run generate from the parent folder (`C:\java-dsa`), never inside another project. Folder must not exist yet.
// - `artifactId` = new folder. Pick a new name each time.
// - Build always from the folder holding `pom.xml`.

// ## 5. Packaging in `pom.xml`
// - Quickstart: no `<packaging>` tag, default is `jar`.
// - Webapp: `<packaging>war</packaging>`.
// - Convert JAR project to WAR: add `<packaging>war</packaging>`, add `src/main/webapp/`, add `<failOnMissingWebXml>false</failOnMissingWebXml>` to `<properties>`.

// ## 6. Java version (`pom.xml` properties)
// ```xml
// <maven.compiler.source>21</maven.compiler.source>
// <maven.compiler.target>21</maven.compiler.target>
// ```
// Quickstart default is 17 (works on JDK 21). Webapp archetype default is old (1.7 or 1.8). Change it to 17 or 21 if the build errors with "source option 7/8 is no longer supported".

// ## 7. Common build commands
// - `mvn clean`: delete `target\`
// - `mvn compile`: compile only
// - `mvn test`: complie+run tests
// - `mvn package`: build JAR or WAR into `target\` (compile +test+pkg)
// - `mvn clean package`: clean then build (use this) delete the existingn JAR/WAR and rebuild
// - `mvn clean package -DskipTests`: build, skip tests

// ## 8. WAR deploy notes
// - Tomcat 9 = `javax.servlet`. Tomcat 10+ = `jakarta.servlet`.
// - WAR name = URL path. `my-war.war` gives `/my-war/`.

// I can also save this as `maven-notes.md` in the repo if you want.