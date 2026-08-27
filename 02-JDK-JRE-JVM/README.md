# 2. JDK, JRE & JVM + Java Setup

## 1. JVM – Java Virtual Machine

**JVM** is the runtime environment that executes Java bytecode.

Think of it like this:

```text
Your Java Program
      ↓
   javac compiler
      ↓
   Bytecode (.class)
      ↓
      JVM
      ↓
Program runs on your computer
```

The JVM is platform-specific, but Java bytecode is designed to be portable.

## 2. JRE – Java Runtime Environment

**JRE = JVM + Java runtime libraries and supporting files** needed to run Java applications.

If you only need to run a Java application, the runtime environment is what matters.

## 3. JDK – Java Development Kit

**JDK = tools for developing Java applications + runtime components.**

It includes tools such as:

- `javac` – Java compiler
- `java` – launches a Java application
- `javadoc` – generates documentation
- Other development and diagnostic tools

### Easy way to remember

```text
JDK → Develop + Run Java programs
JRE → Run Java programs
JVM → Execute Java bytecode
```

## ☕ Install Java

Install a current **JDK** from a trusted OpenJDK distribution or Oracle JDK distribution. After installation, open a terminal/Command Prompt and verify:

```bash
java -version
javac -version
```

Both commands should report a Java version.

## First Java Program

Create a file named `HelloJava.java`:

```java
public class HelloJava {

    public static void main(String[] args) {

        // System.out.println() prints text on the console.
        System.out.println("Hello, Java!");
    }
}
```

Compile:

```bash
javac HelloJava.java
```

Run:

```bash
java HelloJava
```

Output:

```text
Hello, Java!
```

## Important: Java file name and public class

If a class is declared `public`, the file name must match the class name.

```java
public class Student {
    // File should be Student.java
}
```

## 🔍 What does `main()` mean?

```java
public static void main(String[] args)
```

- `public` → JVM can access the method.
- `static` → JVM can call it without creating an object.
- `void` → method does not return a value.
- `main` → standard entry point for a Java application.
- `String[] args` → receives command-line arguments.

## 📝 Practice

1. What is JVM?
2. What is the difference between JDK, JRE and JVM?
3. What does `javac` do?
4. What does `java HelloJava` do?
5. Why should a public class name match its file name?
