# 14. Exception Handling in Java

> **Goal:** A fresher should be able to start this folder from zero, understand why exceptions happen, handle them correctly, and write clean Java programs.

## What is an Exception?

An **exception** is an unexpected problem that occurs while a program is running and interrupts the normal flow of the program.

### Real-life example

Socho ATM se ₹10,000 withdraw karna hai, lekin account balance ₹2,000 hai. ATM ko program band nahi kar dena chahiye. Usse user ko proper message dena chahiye: **"Insufficient balance"**.

Java mein exception handling ka kaam bhi similar hai: error ko gracefully handle karna aur program ko unnecessarily crash hone se bachana.

---

## Learning Order

1. `01-Exception-Basics.java` — What is an exception and why handling is needed
2. `02-Try-Catch.java` — Basic `try-catch`
3. `03-Multiple-Catch.java` — Multiple `catch` blocks
4. `04-Finally.java` — `finally` block
5. `05-Checked-vs-Unchecked.java` — Checked and unchecked exceptions
6. `06-Throw.java` — Manually creating an exception with `throw`
7. `07-Throws.java` — Declaring an exception with `throws`
8. `08-Custom-Exception.java` — Creating your own exception
9. `09-Nested-Try-and-Try-With-Resources.java` — Advanced but beginner-friendly patterns
10. `10-Common-Exceptions.java` — Common exceptions every fresher should know
11. `11-Mini-Bank-Project.java` — Practical mini project
12. `12-Practice-Questions.md` — Exercises for practice and interviews

---

## Exception Hierarchy — Simple View

```text
Throwable
├── Error
│   └── Serious JVM/system problems
│
└── Exception
    ├── RuntimeException (Unchecked)
    │   ├── ArithmeticException
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── NumberFormatException
    │
    └── Other Exceptions (Checked)
        ├── IOException
        └── SQLException
```

### Important

- **Checked exception:** Compiler forces you to handle or declare it.
- **Unchecked exception:** Usually programming/logic mistakes detected at runtime.
- `Error` is generally not something application code should try to recover from.

---

## The 5 Important Keywords

| Keyword | Simple meaning |
|---|---|
| `try` | Risky code yahan likhte hain |
| `catch` | Exception aaye to usko handle karta hai |
| `finally` | Cleanup code; normally execute hota hai whether exception occurs or not |
| `throw` | Hum khud exception throw karte hain |
| `throws` | Method declare karta hai ki exception caller ko handle karna padega |

---

## Golden Rule for Freshers

**Exception ko hide mat karo.** Meaningful message do, correct exception type use karo, aur cleanup ke liye `finally` ya try-with-resources use karo.

```java
try {
    // risky code
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### `e` kya hai?

`e` exception object ka reference variable hai. Iske through hum exception ki information dekh sakte hain:

```java
System.out.println(e.getMessage());
System.out.println(e.getClass().getName());
e.printStackTrace();
```

---

## Recommended Practice

Har example ko pehle **without exception handling** run karo, phir exception handling add karke difference dekho. Code ko khud type karo; sirf copy-paste mat karo.
