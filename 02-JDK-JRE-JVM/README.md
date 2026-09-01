# 2. JDK, JRE & JVM + Java Setup

This module explains **how Java programs are developed, compiled, loaded and executed**.

---

## 1. JVM — Java Virtual Machine

The **JVM (Java Virtual Machine)** is the runtime engine that executes Java **bytecode**.

### Simple flow

```text
Java Source Code (.java)
        ↓
   javac compiler
        ↓
Java Bytecode (.class)
        ↓
       JVM
        ↓
Machine-level execution
        ↓
      Output
```

### Important point about portability

Java source code is compiled into bytecode. The **same bytecode can run on different operating systems when a compatible JVM is available**.

The JVM implementation itself is platform-specific.

For example:

```text
Windows JVM  → runs Java bytecode on Windows
Linux JVM    → runs Java bytecode on Linux
macOS JVM    → runs Java bytecode on macOS
```

### What does the JVM do?

At a high level, the JVM:

- Loads `.class` files.
- Verifies bytecode for safety constraints.
- Manages runtime memory.
- Executes bytecode.
- Uses techniques such as **JIT (Just-In-Time) compilation** to improve performance.
- Performs automatic memory management through **Garbage Collection**.

> **Trainer note:** Do not say “JVM converts Java source code directly into machine code.” `javac` first produces bytecode; the JVM then executes/compiles that bytecode at runtime.

---

## 2. JRE — Java Runtime Environment

Conceptually:

```text
JRE = JVM + Java runtime libraries + supporting runtime components
```

The JRE represents the environment required to **run** Java applications.

### Important modern Java note

In older Java distributions, the JRE was commonly provided as a separate downloadable package. With modern JDK releases (Java 9+), Oracle/OpenJDK distributions generally provide the **JDK rather than a separate JRE download**.

So for learning, remember the conceptual relationship, but for modern development you normally install a **JDK**.

---

## 3. JDK — Java Development Kit

The **JDK** is the complete development kit used to create Java applications.

Conceptually:

```text
JDK
├── Development tools
│   ├── javac
│   ├── javadoc
│   └── other tools
└── Runtime components
    └── JVM + Java libraries
```

Important tools include:

| Tool | Purpose |
|---|---|
| `javac` | Compiles `.java` source code into bytecode |
| `java` | Launches a Java application |
| `javadoc` | Generates API documentation from source comments |
| `jar` | Creates and manages JAR files |
| `jshell` | Interactive Java REPL |

---

## 4. JDK vs JRE vs JVM

| Component | Main purpose | Key idea |
|---|---|---|
| **JDK** | Develop + run | Tools + runtime |
| **JRE** | Run | Runtime environment (conceptual term in modern Java) |
| **JVM** | Execute bytecode | Actual virtual machine |

### Easy memory trick

```text
JDK → Develop
JRE → Run
JVM → Execute
```

Or:

> **JDK contains the tools you need to develop Java applications. The JVM is the engine that executes Java bytecode.**

---

## 5. Compile vs Run

These are two different operations.

### Compile

```bash
javac HelloJava.java
```

This produces:

```text
HelloJava.class
```

### Run

```bash
java HelloJava
```

Notice that we normally write the **class name**, not `HelloJava.class`:

```bash
java HelloJava      ✓
java HelloJava.class  ✗
```

---

## 6. Install Java

Install a current **JDK** from a trusted OpenJDK distribution or Oracle JDK distribution.

After installation, verify the commands in Command Prompt/Terminal:

```bash
java -version
javac -version
```

Both should report a Java version.

### If `javac` is not recognized

Common causes include:

- JDK is not installed.
- The JDK `bin` directory is not available through `PATH`.
- The terminal was opened before the environment variable was updated.

---

## 7. First Java Program

Create a file named `HelloJava.java`:

```java
public class HelloJava {

    public static void main(String[] args) {
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

---

## 8. What Actually Happens?

Let's follow the complete journey:

```text
1. Developer writes HelloJava.java
             ↓
2. javac compiles the source code
             ↓
3. HelloJava.class is created
             ↓
4. JVM loads the class
             ↓
5. JVM verifies and prepares the class
             ↓
6. JVM finds main() and starts execution
             ↓
7. Bytecode is interpreted/JIT-compiled as appropriate
             ↓
8. Program produces output
```

This is the foundation for understanding **Write Once, Run Anywhere**.

---

## 9. Class File and Public Class Rule

If a top-level class is declared `public`, the source file name must match the public class name.

```java
public class Student {
}
```

The file should be:

```text
Student.java
```

This would cause a compilation error:

```text
WrongName.java
public class Student { }
```

---

## 10. Understanding `main()`

```java
public static void main(String[] args)
```

| Part | Meaning |
|---|---|
| `public` | Makes the method accessible to the launcher |
| `static` | Allows the method to be invoked without creating an object |
| `void` | Method returns no value |
| `main` | Conventional entry-point method name for a Java application |
| `String[] args` | Receives command-line arguments |

Example:

```bash
java HelloJava Rahul Java
```

The arguments are available through `args`.

---

## 11. JIT Compiler — Basic Introduction

**JIT = Just-In-Time compiler.**

A JVM can identify frequently executed bytecode and compile suitable parts into native machine code at runtime to improve performance.

For now, remember:

```text
javac → Java source → bytecode
JVM/JIT → bytecode → efficient runtime execution
```

---

## 12. JVM Memory — Basic Introduction

You do not need deep memory knowledge at this stage, but know these terms:

- **Heap** — commonly used for objects and arrays.
- **Stack** — used for method call frames and local execution state for each thread.
- **Method area / class metadata** — runtime information about classes and related structures.

Detailed memory management will be covered later.

---

## ⚠️ Common Beginner Mistakes

### Mistake 1: Confusing JDK and JVM

❌ “JVM is used to write Java programs.”

✅ JDK provides development tools; JVM executes bytecode.

### Mistake 2: Running with `.class`

❌ `java HelloJava.class`

✅ `java HelloJava`

### Mistake 3: Thinking Java source runs directly everywhere

Java source is compiled into bytecode first. A compatible JVM is needed to execute that bytecode.

### Mistake 4: Saying JRE is always a separately installed product

For modern Java, install a JDK. JRE is still useful as a **conceptual model** for understanding Java's runtime environment.

---

## 📝 Practice Questions

### Basic

1. What is JVM?
2. What is JDK?
3. What is JRE?
4. What does `javac` do?
5. What does `java HelloJava` do?

### Understanding

6. Why is Java called platform-independent at the bytecode level?
7. Why is the JVM platform-specific?
8. What is the difference between compiling and running a program?
9. Why does a public class name need to match the file name?
10. What is the role of JIT?

### Interview / Trainer Check

11. Explain JDK, JRE and JVM in 30 seconds.
12. Explain the complete flow from `.java` to program output.
13. Is JRE still normally downloaded separately with modern JDK distributions?
14. What is the difference between `javac HelloJava.java` and `java HelloJava`?
15. Does JVM directly compile `.java` source code?

---

## 🎯 Module Completion Checklist

- [ ] I can explain JDK, JRE and JVM.
- [ ] I understand source code vs bytecode.
- [ ] I can compile a Java program using `javac`.
- [ ] I can run a Java program using `java`.
- [ ] I understand the role of the JVM and JIT.
- [ ] I can explain why Java is portable across platforms.
- [ ] I understand the `main()` method.
- [ ] I can troubleshoot basic Java setup problems.
