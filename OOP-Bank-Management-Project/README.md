# 🏦 OOP Bank Management Project

A **simple Java project for beginners** to understand Object-Oriented Programming (OOP) using one real-world example: a **Bank Account**.

Instead of learning OOP concepts separately, this project shows how all the concepts work **together in one small project**.

---

## 🎯 What Will You Learn?

This project covers:

| OOP Concept | Used In Project | Simple Meaning |
|---|---|---|
| **Class** | `BankAccount` | Blueprint/design of an object |
| **Object** | `new SavingsAccount()` | Real instance of a class |
| **Constructor** | `BankAccount(...)` | Initializes an object |
| **this** | `this.accountHolder` | Refers to current object |
| **Encapsulation** | `private balance` | Protects data |
| **Inheritance** | `extends BankAccount` | Reuses parent functionality |
| **super** | `super(name, balance)` | Calls parent constructor/method |
| **Method Overloading** | `deposit()` | Same method name, different parameters |
| **Method Overriding** | `calculateInterest()` | Child provides its own behavior |
| **Polymorphism** | `BankAccount a = new SavingsAccount()` | One reference, different behavior |
| **Abstraction** | `abstract BankAccount` | Hides unnecessary implementation |
| **Interface** | `Transaction` | Defines a contract |

---

# 🏗️ Project Structure

```text
OOP-Bank-Management-Project/
│
├── BankAccount.java       # Parent abstract class
├── SavingsAccount.java    # Child class
├── Transaction.java       # Interface
├── Main.java              # Program execution
└── README.md              # Project explanation
```

---

# 🧩 How the Project Works

The basic relationship is:

```text
                  BankAccount
                 (Abstract Class)
                       │
                       │ extends
                       ▼
                SavingsAccount
                       │
                       │ implements
                       ▼
                  Transaction
                   (Interface)
```

`Main.java` creates the account object and tests the functionality.

---

# 1️⃣ Class

A **class is a blueprint** for creating objects.

```java
class BankAccount {
    String accountHolder;
    double balance;
}
```

Think of a class like a **bank account form/design**. It tells us what an account should contain.

---

# 2️⃣ Object

An **object is a real instance of a class**.

```java
BankAccount account = new SavingsAccount("Rahul", 10000);
```

Here:

- `BankAccount` → reference type
- `account` → reference variable
- `new SavingsAccount(...)` → creates the object

Real-world example:

```text
Class  → BankAccount
Object → Rahul's Bank Account
```

---

# 3️⃣ Constructor

A constructor is used to **initialize an object** when it is created.

```java
BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
}
```

When we write:

```java
new SavingsAccount("Rahul", 10000);
```

the constructor initializes the account with Rahul's name and ₹10,000 balance.

---

# 4️⃣ `this` Keyword

```java
this.accountHolder = accountHolder;
```

Here:

- `this.accountHolder` → variable belonging to the current object
- `accountHolder` → constructor parameter

Simple meaning:

> `this` means **the current object**.

---

# 🔐 5️⃣ Encapsulation

Encapsulation means **protecting data and providing controlled access to it**.

The balance is private:

```java
private double balance;
```

We don't allow outside code to directly change it.

Instead, we use methods:

```java
deposit(1000);
withdraw(500);
```

So the bank can control whether an operation is valid.

### Real-world example

You cannot normally go inside the bank's database and directly change your balance. You perform an operation such as deposit or withdrawal.

---

# 👨‍👦 6️⃣ Inheritance

Inheritance allows a child class to **reuse properties and methods of a parent class**.

```java
class SavingsAccount extends BankAccount {
}
```

Meaning:

```text
BankAccount
     ↓
SavingsAccount
```

A Savings Account is a type of Bank Account, so it can reuse common bank-account functionality.

---

# 🔼 7️⃣ `super` Keyword

The child constructor uses:

```java
super(name, balance);
```

`super()` calls the **parent class constructor**.

```text
SavingsAccount constructor
          ↓
       super()
          ↓
BankAccount constructor
```

---

# 🔄 8️⃣ Method Overloading

Method overloading means having **multiple methods with the same name but different parameters**.

Example:

```java
deposit(1000);

deposit(1000, "UPI");
```

Both are called `deposit()`, but their parameter lists are different.

This is called **Compile-time Polymorphism**.

---

# 🔁 9️⃣ Method Overriding

Method overriding happens when a child class provides its **own implementation** of a parent method.

```java
@Override
void calculateInterest() {
    System.out.println("Savings Account Interest = 5%");
}
```

The child class decides how interest should be calculated.

---

# 🎭 🔟 Polymorphism

Polymorphism means **one thing can have different forms/behaviors**.

This project demonstrates two types:

### Compile-time Polymorphism

Method overloading:

```java
deposit(1000);
deposit(1000, "UPI");
```

### Runtime Polymorphism

```java
BankAccount account = new SavingsAccount("Rahul", 10000);
account.calculateInterest();
```

Although the reference is `BankAccount`, the actual object is `SavingsAccount`.

At runtime, Java calls the `SavingsAccount` version of `calculateInterest()`.

---

# 🧠 1️⃣1️⃣ Abstraction

Abstraction means **hiding unnecessary implementation details and showing only what is important**.

The project uses:

```java
abstract class BankAccount
```

and:

```java
abstract void calculateInterest();
```

The parent says:

> Every account must have interest calculation.

But the child decides **how** to calculate it.

---

# 📜 1️⃣2️⃣ Interface

`Transaction` is an interface:

```java
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}
```

It acts like a **contract**.

A class that implements it must provide these methods.

```java
class SavingsAccount extends BankAccount implements Transaction {
}
```

---

# 🏛️ The Four Pillars of OOP

## 1. Encapsulation 🔐

```java
private double balance;
```

**Protect the data.**

## 2. Inheritance 👨‍👦

```java
class SavingsAccount extends BankAccount
```

**Reuse parent functionality.**

## 3. Polymorphism 🎭

```java
BankAccount a = new SavingsAccount();
```

**Same interface/reference, different behavior.**

## 4. Abstraction 🧠

```java
abstract class BankAccount
```

**Hide unnecessary implementation details.**

---

# ▶️ How to Run

Make sure Java is installed.

Open the project folder in terminal and run:

```bash
javac *.java
```

Then:

```bash
java Main
```

---

# 📚 Best Order to Learn This Project

For beginners, follow this order:

```text
1. Class
   ↓
2. Object
   ↓
3. Constructor
   ↓
4. this keyword
   ↓
5. Encapsulation
   ↓
6. Inheritance
   ↓
7. super keyword
   ↓
8. Method Overloading
   ↓
9. Method Overriding
   ↓
10. Polymorphism
   ↓
11. Abstraction
   ↓
12. Interface
```

---

# 👨‍🏫 Trainer Tip

Don't explain the whole project at once.

Build it step-by-step with students:

**Step 1:** Create a class → explain Class & Object  
**Step 2:** Add constructor → explain Constructor & `this`  
**Step 3:** Make fields private → explain Encapsulation  
**Step 4:** Create `SavingsAccount` → explain Inheritance  
**Step 5:** Use `super()` → explain parent constructor  
**Step 6:** Add two `deposit()` methods → explain Overloading  
**Step 7:** Override `calculateInterest()` → explain Overriding  
**Step 8:** Use parent reference with child object → explain Polymorphism  
**Step 9:** Make `BankAccount` abstract → explain Abstraction  
**Step 10:** Add `Transaction` → explain Interface

This way students understand **why each OOP concept is needed**, instead of only memorizing definitions.

---

# ⭐ Final Goal

After completing this project, a student should be able to explain:

> **Class → Object → Constructor → Encapsulation → Inheritance → Polymorphism → Abstraction → Interface**

using a single real-world **Bank Management System** example.
