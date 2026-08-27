# 3. Data Types & Variables

A **variable** is a named memory location used to store a value.

Every variable in Java has a data type.

## Primitive data types

Java has 8 primitive data types:

| Type | Example | Use |
|---|---|---|
| byte | `byte age = 25;` | Small integer |
| short | `short marks = 300;` | Integer larger than byte |
| int | `int salary = 50000;` | Common integer |
| long | `long population = 8000000000L;` | Large integer |
| float | `float price = 99.5f;` | Decimal, lower precision |
| double | `double pi = 3.14159;` | Decimal, higher precision |
| char | `char grade = 'A';` | Single character |
| boolean | `boolean passed = true;` | `true` or `false` |

## Example

```java
public class DataTypesExample {

    public static void main(String[] args) {

        // Integer values
        int age = 25;
        long population = 8000000000L;

        // Decimal values
        float price = 99.5f;
        double pi = 3.14159265359;

        // A single character uses single quotes.
        char grade = 'A';

        // boolean stores only true or false.
        boolean isJavaEasy = true;

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java easy? " + isJavaEasy);
    }
}
```

## Reference types

Examples include:

- `String`
- Arrays
- Classes
- Interfaces
- Enums

```java
String name = "Rahul"; // String is a reference type.
```

## Type casting

### Widening casting
Smaller numeric type → larger numeric type. Usually automatic.

```java
int number = 100;
double value = number; // int is converted to double automatically.
```

### Narrowing casting
Larger numeric type → smaller type. You explicitly cast it.

```java
double price = 99.99;
int value = (int) price; // Decimal part is removed.

System.out.println(value); // 99
```

## `final` variable

Use `final` when a value should not be reassigned.

```java
final double PI = 3.14159;

// PI = 4.0; // Error: cannot assign a new value to a final variable.
```

## 📝 Practice

1. Declare variables for your name, age and marks.
2. Store the population of a city using an appropriate type.
3. Write one widening-casting example.
4. Write one narrowing-casting example.
5. Create a `final` variable for GST rate.
