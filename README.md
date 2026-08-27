# ☕ Java Training – Beginner to Advanced

A **complete, beginner-friendly Java learning course** with simple theory, separate runnable examples, comments, and practice questions.

> **Important:** OOP projects are kept separate from this Java Basics course. This repository focuses on learning Java step-by-step before moving into projects.

## 📚 Java Basics Roadmap

1. **Java History** – origin, Oak, Java release, WORA
2. **JDK, JRE & JVM** – setup and Java execution flow
3. **Data Types & Variables** – primitive/reference types, casting, `final`
4. **Operators** – arithmetic, relational, logical, assignment, unary, ternary
5. **Control Flow** – `if`, `if-else`, nested `if`, `else-if`, `switch-case`
6. **Loops** – `for`, `while`, `do-while`, nested loops, `break`, `continue`
7. **Methods** – parameters, return values, `void`, calling methods, overloading

## 📁 Proper Java Packages

Every Java example uses a clear package name. There is **no default package**.

```text
com.history
com.jvm
com.datatypes
com.operators
com.controlflow
com.loop
com.method
```

This makes the examples easier to import into an IDE and understand as a real Java project.

## 🗂️ Repository Structure

```text
Java_Training/
│
├── 01-Java-History/
│   └── README.md
│
├── 02-JDK-JRE-JVM/
│   └── README.md
│
├── 03-Data-Types/
│   ├── README.md
│   └── DataTypesExample.java       # package com.datatypes
│
├── 04-Operators/
│   └── README.md
│
├── 05-Control-Flow/
│   ├── README.md
│   ├── IfElseExample.java          # package com.controlflow
│   ├── NestedIfExample.java        # package com.controlflow
│   ├── IfElseIfExample.java        # package com.controlflow
│   └── SwitchCaseExample.java      # package com.controlflow
│
├── 06-Loops/
│   ├── README.md
│   ├── ForLoopExample.java         # package com.loop
│   ├── WhileLoopExample.java       # package com.loop
│   └── DoWhileLoopExample.java     # package com.loop
│
└── 07-Methods/
    ├── README.md
    └── MethodExample.java          # package com.method
```

## ▶️ Running a Packaged Example

For example, if your source file begins with:

```java
package com.loop;
```

compile from the project root using:

```bash
javac -d . 06-Loops/ForLoopExample.java
```

Then run:

```bash
java com.loop.ForLoopExample
```

For an IDE such as IntelliJ IDEA or Eclipse, import the repository as a Java project and mark the source root appropriately.

## 🧠 Recommended Learning Method

For every topic:

1. Read the README.
2. Understand the concept in simple language.
3. Open the separate `.java` example.
4. Read the comments line by line.
5. Run the program yourself.
6. Change the values and predict the output.
7. Complete the practice questions.

## 🚀 Next Stage

After Java Basics, create a **separate OOP/Projects section or repository** for:

- Class & Object
- Constructor
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interface
- Banking/OOP project
- Other practical projects

This keeps the beginner course clean and prevents project code from confusing someone who is still learning Java fundamentals.

## ⭐ Learning Philosophy

**Understand → Code → Run → Experiment → Practice → Build**
