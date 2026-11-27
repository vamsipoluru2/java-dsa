# java-dsa

My Java learning repository: core Java, data structures and algorithms (DSA), and the Maven and Gradle build tools.

## The idea behind this repository

I build my Java skills in layers, each one supporting the next:

1. **Learn the language** (`01core_java/`): syntax, object-oriented programming, collections, streams and multithreading.
2. **Solve problems** (`java-learn/`): use the language for DSA, moving from basic patterns to harder data structures.
3. **Build projects** (`02Maven/`, `03Gradle/`): manage dependencies, build applications and start with Spring Boot.

In short: language first, problem solving next, real applications after that.

## Folder overview

| Folder | Contents |
|---|---|
| [`01core_java/`](01core_java/) | Core Java topics, one project per topic |
| [`02Maven/`](02Maven/) | Maven practice projects |
| [`03Gradle/`](03Gradle/) | Gradle practice projects ([guide](03Gradle/README.md)) |
| [`java-learn/`](java-learn/) | DSA practice |

## `01core_java/`

Each folder keeps its source code in `src/`.

| Area | Folders | Topics |
|---|---|---|
| Basics | `01MyFirstProject` to `05Loops` | First program, variables, operators, control statements, loops |
| Methods and OOP | `06Methods_constructors` to `10Polymorphism` | Methods, constructors, `static`, encapsulation, inheritance, "has-a" relationships, polymorphism |
| Language features | `11Arrays` to `15Interface` | Arrays, packages, strings, abstract classes, interfaces |
| Exceptions and I/O | `16a` to `16d` | Exception handling, text files, properties files, I/O streams |
| Concurrency and classes | `17a`, `17b` | Multithreading, POJO and JavaBean classes |
| Collections | `18a`, `18b` | Collection framework |
| Advanced | `19Innerclass_GC` to `25Genericss` | Inner classes, garbage collection, varargs, lambda expressions, default methods and Java 8/11 features, enums, generics |
| Streams | `26_javastream` | Java Stream API, method references, `Optional` |

`09c_HasARelationship`, `20VarArgs` and `21a_LamdaExp` have no source files yet. Varargs and lambda examples are in `21b_Lamdaexps`.

## `02Maven/`

| Folder | Description |
|---|---|
| `MavenDemoApp` | Simple Maven Java application |
| `maven` | Maven Java project with a test |
| `maven-web-app` | Maven web application with a JSP page |
| `vamsi` | Calculator class with a test |
| `SpringbootMavenApp` | Spring Boot application built with Maven |

## `03Gradle/`

| Folder | Description |
|---|---|
| `gradle-sample` | Plain Java project built with Gradle |
| `spring-boot-gradle-app` | Spring Boot application with a REST endpoint |

Setup and run steps are in the [Gradle guide](03Gradle/README.md).

## `java-learn/`

### `Striver_dsa/`

| Folder | Topics |
|---|---|
| `day01_begining` | Patterns, recursion |
| `day02_sorting` | Selection, bubble, insertion, merge and quick sort |
| `day03_arrays` | Easy, medium and hard array problems |
| `day04_hashing` | Hashing and subarray problems |
| `day05_BinarySearch` | Binary search: basic, medium, hard and 2D arrays |
| `day06_LInked_List` | Linked lists: basic, easy and medium |

### `kunal_java/`

| Folder | Topics |
|---|---|
| `day00_leetcodesolve` | LeetCode solutions |
| `day01_intro`, `day02_begining` | Introduction, switch statements, functions, basic problems |
| `day03_arrays` | Arrays and `ArrayList` |
| `day04_linearsearch` | Linear search |
| `day05_binarysearch`, `day06_2Dbinarysearch` | Binary search in 1D and 2D arrays |
| `day07_sorting` | Sorting, including cyclic sort |
| `day08_strings` | Strings and `StringBuilder` |
| `day09_recurssion` | Recursion and backtracking |
| `day10_mathsforDSA`, `day11_mathsfordsa2` | Bit manipulation, primes, square roots |
| `day12_oops` | Object-oriented programming, generics, collections, enums |
| `day13_linkedlist` | Linked lists |
| `day14_stack_ques` | Stacks and queues |
| `day15_trees` | Binary trees |

## Running a file

For a single-file program (JDK 11 or later):

```powershell
java path\to\File.java
```

Programs that use several files or packages must be compiled with `javac` first. For Maven projects, use `mvn`. For Gradle projects, use `.\gradlew`.
