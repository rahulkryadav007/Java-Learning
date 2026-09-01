# 04 - Variables & Constants

A **variable** is a named storage location/reference used by a program to work with a value. The value can be changed unless the variable is declared with `final`.

## Learn in this order

1. Declaration
2. Initialization
3. Assignment and reassignment
4. Naming rules and conventions
5. Local variables
6. Instance variables
7. Static (class) variables
8. `final` variables / constants
9. Scope and lifetime
10. `var` — local variable type inference (Java 10+)

---

## 1. Declaration vs Initialization vs Assignment

```java
int age;       // Declaration
age = 25;      // Assignment / initialization
age = 26;      // Reassignment

int marks = 90; // Declaration + initialization
```

**Hinglish:** Declaration means Java ko batana ki variable ka type kya hai. Initialization means first value dena. Reassignment means baad mein value change karna.

---

## 2. Naming Rules

A Java variable name:

- Can contain letters, digits, `_`, and `$`.
- Cannot start with a digit.
- Cannot contain spaces.
- Cannot be a Java keyword such as `class`, `int`, or `static`.
- Is case-sensitive: `age` and `Age` are different names.

### Recommended naming convention

Use **camelCase** for variables:

```java
int studentAge = 20;
double monthlySalary = 45000.0;
```

For constants, use **UPPER_SNAKE_CASE**:

```java
final double GST_RATE = 0.18;
```

> Naming conventions are recommendations; naming rules are compiler requirements.

---

## 3. Local Variables

Declared inside a method, constructor, or block.

```java
public static void main(String[] args) {
    int age = 25; // local variable
    System.out.println(age);
}
```

A local variable exists only within its scope and **does not get an automatic default value**.

```java
int marks;
// System.out.println(marks); // Compile-time error: not initialized
```

---

## 4. Instance Variables

Declared inside a class but outside methods, constructors, and blocks, without `static`.

Each object gets its own instance variable.

```java
class Student {
    String name; // instance variable
    int age;     // instance variable
}
```

```java
Student s1 = new Student();
Student s2 = new Student();

s1.age = 20;
s2.age = 22;
```

Here, `s1.age` and `s2.age` can hold different values.

---

## 5. Static Variables

A `static` variable belongs to the **class**, not to each individual object. It is shared by instances of that class.

```java
class Student {
    static String college = "ABC College";
    String name;
}
```

Access it through the class name when appropriate:

```java
System.out.println(Student.college);
```

### Quick comparison

| Variable | Declared | Belongs to | Default value? |
|---|---|---|---|
| Local | Inside method/block | Current execution scope | No |
| Instance | Inside class, non-static | Object | Yes |
| Static | Inside class with `static` | Class | Yes |

---

## 6. `final` Variables

`final` prevents a variable from being assigned a new value after it has been initialized.

```java
final int MAX_LOGIN_ATTEMPTS = 3;

// MAX_LOGIN_ATTEMPTS = 5; // Compile-time error
```

### Constant convention

A `static final` field is commonly used as a class constant:

```java
class AppConfig {
    static final int MAX_USERS = 1000;
}
```

> In Java, `final` means the **variable cannot be reassigned**. For a reference variable, the referenced object may still be mutable.

Example:

```java
final StringBuilder name = new StringBuilder("Rahul");
name.append(" Kumar"); // Allowed: object is mutable

// name = new StringBuilder("Amit"); // Not allowed: reference cannot be reassigned
```

---

## 7. Scope

**Scope** means the region of code where a variable can be accessed.

```java
public static void main(String[] args) {
    int age = 25;

    if (age > 18) {
        int message = 1;
        System.out.println(age);     // Accessible
        System.out.println(message); // Accessible
    }

    // System.out.println(message); // Error: outside its scope
}
```

**Easy rule:** A variable declared inside `{ }` generally cannot be accessed outside that block.

---

## 8. Lifetime

Lifetime means how long a variable exists during program execution.

- Local variables are associated with a method/block execution.
- Instance variables exist as part of an object while that object is reachable/exists.
- Static fields are associated with the class and typically exist while the class is loaded.

Do not confuse **scope** (where a variable can be accessed in source code) with **lifetime** (how long it exists during execution).

---

## 9. `var` — Local Variable Type Inference

Java 10 introduced `var` for **local variable type inference**.

```java
var age = 25;       // Compiler infers int
var name = "Rahul"; // Compiler infers String
```

Important:

- `var` is **not a new data type**.
- The compiler determines the actual type at compile time.
- `var` requires an initializer.
- `var` cannot be used for fields, method parameters, or method return types.

```java
// var age;          // Error: no initializer
// var value = null; // Error: type cannot be inferred
```

---

## 10. Complete Example

```java
class Student {
    static String college = "ABC College"; // static variable

    String name; // instance variable
    int age;     // instance variable

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class VariablesExample {
    public static void main(String[] args) {
        // Local variable
        int count = 10;
        count = 20; // reassignment

        // Constant
        final double GST_RATE = 0.18;

        // Instance variables
        Student student = new Student("Rahul", 24);

        // Static variable
        System.out.println("College: " + Student.college);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Count: " + count);
        System.out.println("GST Rate: " + GST_RATE);

        // Local variable type inference
        var course = "Java";
        System.out.println("Course: " + course);
    }
}
```

## Common Mistakes

1. ❌ Using a local variable before initialization.
2. ❌ Thinking `final` means the object itself can never change; for references, only reassignment is prevented.
3. ❌ Confusing instance variables with static variables.
4. ❌ Thinking `var` is a dynamic type like in some other languages.
5. ❌ Using `var` without an initializer.
6. ❌ Using spaces or keywords in variable names.
7. ❌ Confusing scope with lifetime.

## 📝 Practice

### Basic
1. Declare a variable and initialize it in a separate statement.
2. Reassign the variable and print both values.
3. Create three local variables of different data types.
4. Create a `final` constant for the maximum marks.

### Understanding
5. Difference between declaration, initialization, and assignment?
6. What is the difference between local, instance, and static variables?
7. Why can a local variable not be used before initialization?
8. What does `final` mean for a reference variable?
9. What is variable scope?
10. What is the difference between scope and lifetime?
11. Is `var` a data type?
12. Why can't `var` be used without an initializer?

### Interview Check
13. Where are local, instance, and static variables stored/associated at a high level?
14. What is the difference between a static variable and an instance variable?
15. Can a `final` variable be reassigned?
16. Can a `final` object be modified?
17. What are the rules for Java variable names?
