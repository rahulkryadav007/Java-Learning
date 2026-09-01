# 3. Data Types

A **data type** tells Java what kind of value a variable can store and helps determine how that value is represented and used.

> **Important:** A variable is not a memory location itself. It is a named reference to a value stored in memory (for primitives, the variable directly holds the primitive value; for reference types, it holds a reference to an object).

## 1. Two broad categories

Java data types are commonly grouped into:

```text
Data Types
├── Primitive Types (8)
│   ├── byte
│   ├── short
│   ├── int
│   ├── long
│   ├── float
│   ├── double
│   ├── char
│   └── boolean
│
└── Reference Types
    ├── String
    ├── Arrays
    ├── Classes / Objects
    ├── Interfaces
    └── Enums
```

---

## 2. Primitive Data Types

Java has exactly **8 primitive data types**.

| Type | Size | Typical range / values | Example | Use |
|---|---:|---|---|---|
| `byte` | 8-bit | -128 to 127 | `byte age = 25;` | Very small integers |
| `short` | 16-bit | -32,768 to 32,767 | `short marks = 300;` | Small integers |
| `int` | 32-bit | -2³¹ to 2³¹-1 | `int salary = 50000;` | Most common whole numbers |
| `long` | 64-bit | -2⁶³ to 2⁶³-1 | `long population = 8000000000L;` | Very large integers |
| `float` | 32-bit | ~6–7 decimal digits precision | `float price = 99.5f;` | Decimal values when lower precision is acceptable |
| `double` | 64-bit | ~15–16 decimal digits precision | `double pi = 3.14159;` | Default choice for many decimal calculations |
| `char` | 16-bit | `\u0000` to `\uffff` | `char grade = 'A';` | One UTF-16 code unit |
| `boolean` | JVM-dependent | `true` / `false` | `boolean passed = true;` | Logical conditions |

### Easy memory trick

```text
Whole numbers → byte, short, int, long
Decimal numbers → float, double
Character → char
True/False → boolean
```

### Important literal rules

```java
long population = 8000000000L; // L makes it a long literal
float price = 99.5f;            // f makes it a float literal
char grade = 'A';               // single quotes for char
String name = "Rahul";          // double quotes for String
```

By default, an integer literal such as `10` is an `int`, and a decimal literal such as `10.5` is a `double`.

---

## 3. Reference Types

Reference types are types whose variables can refer to objects.

Common examples:

- `String`
- Arrays
- User-defined classes
- Interfaces
- Enums

```java
String name = "Rahul";
int[] marks = {80, 90, 75};
```

### Primitive vs Reference

```text
Primitive                         Reference
---------                         ---------
int age = 25;                     String name = "Rahul";
Stores a primitive value          Variable refers to an object
8 primitive types                 Many possible reference types
Cannot call methods on value      Can use object methods
```

> `String` is **not** a primitive type. It is a class/reference type.

---

## 4. Default Values

For **instance variables** and **static variables**, Java provides default values:

| Type | Default value |
|---|---|
| `byte`, `short`, `int`, `long` | `0` |
| `float`, `double` | `0.0` |
| `char` | `\u0000` |
| `boolean` | `false` |
| Reference types | `null` |

**Local variables do not receive automatic default values.** They must be initialized before use.

---

## 5. Type Casting

Type casting means converting a value from one compatible type to another.

### A. Widening Conversion

Smaller compatible numeric type → larger compatible numeric type.

Usually automatic because there is no loss of numeric range.

```java
int number = 100;
double value = number;

System.out.println(value); // 100.0
```

Example flow:

```text
byte → short → int → long → float → double
```

### B. Narrowing Conversion

Larger numeric type → smaller compatible numeric type.

An explicit cast is required and information may be lost.

```java
double price = 99.99;
int value = (int) price;

System.out.println(value); // 99
```

The decimal part is discarded; this is **not rounding**.

### C. `char` and numeric conversions

`char` participates in numeric promotion because it represents a UTF-16 code unit.

```java
char ch = 'A';
int code = ch;

System.out.println(code); // 65
```

---

## 6. Type Promotion in Expressions

Java may automatically promote smaller integral types during arithmetic.

```java
byte a = 10;
byte b = 20;

// byte result = a + b; // Error: result of byte + byte is int
int result = a + b;
```

This is a common interview and beginner concept.

---

## 7. Overflow

Primitive numeric types have fixed ranges. If an integer calculation exceeds the range, the result can wrap around.

```java
int max = Integer.MAX_VALUE;
System.out.println(max);       // 2147483647
System.out.println(max + 1);   // -2147483648
```

For large calculations, choose an appropriate type and understand its limits.

---

## 8. `final` Variables

Use `final` when a variable should not be reassigned after initialization.

```java
final double GST_RATE = 0.18;

// GST_RATE = 0.20; // Compile-time error
```

`final` is a **modifier**, not a data type.

---

## 9. Wrapper Classes — Preview

Each primitive has a corresponding wrapper class:

| Primitive | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Wrapper classes are useful when an object is required, such as in many Java Collections.

```java
Integer age = 25; // autoboxing
int value = age;  // unboxing
```

---

## 10. Complete Example

```java
public class DataTypesExample {
    public static void main(String[] args) {

        byte smallNumber = 100;
        short marks = 300;
        int age = 25;
        long population = 8000000000L;

        float price = 99.5f;
        double pi = 3.14159265359;

        char grade = 'A';
        boolean passed = true;

        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + marks);
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // Widening
        double widened = age;
        System.out.println("Widened value: " + widened);

        // Narrowing
        int narrowed = (int) price;
        System.out.println("Narrowed value: " + narrowed);
    }
}
```

## Common Mistakes

1. ❌ `float price = 99.5;` → decimal literal is `double`; use `99.5f`.
2. ❌ `long population = 8000000000;` → literal is too large for `int`; use `L`.
3. ❌ `char grade = "A";` → `char` uses single quotes.
4. ❌ Saying `String` is primitive → it is a reference type.
5. ❌ Assuming local variables get default values → they must be initialized before use.
6. ❌ Assuming `(int) 99.99` rounds → it truncates to `99`.
7. ❌ Saying `final` is a data type → it is a modifier.

## 📝 Practice

### Basic
1. Declare all 8 primitive data types.
2. Store your name, age, percentage, grade and pass status.
3. Create one `long` variable using a large literal.
4. Create one `float` variable correctly.

### Understanding
5. Explain primitive vs reference types.
6. Why do we write `L` after some `long` literals?
7. Why do we write `f` after a `float` literal?
8. What happens when `double` is cast to `int`?
9. Why does `byte + byte` produce an `int` result?
10. What is integer overflow?

### Interview Check
11. How many primitive data types exist in Java?
12. Is `String` a primitive type?
13. Difference between widening and narrowing conversion?
14. What are wrapper classes?
15. What is autoboxing and unboxing?
16. Do local variables get default values in Java?
