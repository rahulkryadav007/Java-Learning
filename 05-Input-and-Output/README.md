# 05 - Input & Output

Input/Output (I/O) is how a Java program **receives data** and **displays data**.

```text
User → Input → Java Program → Processing → Output → User
```

## Learn in this order

1. `System.out.print()`
2. `System.out.println()`
3. `System.out.printf()` and format specifiers
4. `Scanner` for keyboard input
5. Reading `int`, `double`, `boolean`, `char`, and text
6. `next()` vs `nextLine()`
7. The `nextInt()` + `nextLine()` newline issue
8. Basic input validation
9. Closing `Scanner`
10. Input-based programs

---

## 1. Output Methods

### `print()`
Prints without moving to the next line.

```java
System.out.print("Hello ");
System.out.print("Java");
// Hello Java
```

### `println()`
Prints and then moves to the next line.

```java
System.out.println("Hello");
System.out.println("Java");
```

### `printf()`
Useful when formatted output is required.

```java
String name = "Rahul";
int age = 24;
double percentage = 85.5;

System.out.printf("Name: %s, Age: %d, Percentage: %.2f%n",
        name, age, percentage);
```

Common format specifiers:

| Specifier | Meaning |
|---|---|
| `%d` | integer |
| `%f` | floating-point number |
| `%s` | String |
| `%c` | character |
| `%b` | boolean |
| `%n` | platform-independent newline |

---

## 2. Scanner

`Scanner` is a convenient class for reading input from sources such as `System.in`.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
```

### Common Scanner methods

| Method | Reads |
|---|---|
| `nextInt()` | integer |
| `nextLong()` | long integer |
| `nextDouble()` | double |
| `nextFloat()` | float |
| `nextBoolean()` | boolean |
| `next()` | next token/word |
| `nextLine()` | complete line |
| `next().charAt(0)` | first character of next token |

---

## 3. Reading Different Types

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter age: ");
int age = sc.nextInt();

System.out.print("Enter salary: ");
double salary = sc.nextDouble();

System.out.print("Are you a student? (true/false): ");
boolean student = sc.nextBoolean();

System.out.print("Enter name: ");
sc.nextLine(); // consume leftover newline
String name = sc.nextLine();
```

For a character:

```java
System.out.print("Enter grade: ");
char grade = sc.next().charAt(0);
```

---

## 4. `next()` vs `nextLine()`

This is one of the most common beginner mistakes.

```java
String word = sc.next();
```

`next()` reads the next token and stops at whitespace.

```java
String sentence = sc.nextLine();
```

`nextLine()` reads the remaining characters of the current line, including spaces.

### The newline problem

After `nextInt()`, `nextDouble()`, etc., the Enter key's newline can remain in the input buffer.

```java
int age = sc.nextInt();
sc.nextLine(); // consume leftover newline
String name = sc.nextLine();
```

Without that extra `nextLine()`, the name may appear to be skipped.

---

## 5. Input Validation

If the user enters data that does not match the expected type, methods such as `nextInt()` can throw `InputMismatchException`.

For a simple validation example:

```java
if (sc.hasNextInt()) {
    int age = sc.nextInt();
    System.out.println("Age: " + age);
} else {
    System.out.println("Please enter a valid integer.");
}
```

Exception handling for robust input will be covered in a later module.

---

## 6. Closing Scanner

```java
Scanner sc = new Scanner(System.in);
// use scanner
sc.close();
```

Closing a `Scanner` that wraps `System.in` also closes the underlying input stream. Therefore, in larger programs, avoid closing a shared `System.in` scanner before other code still needs keyboard input.

---

## 7. Complete Example

```java
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Percentage: %.2f%n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
```

## Common Mistakes

1. ❌ Using `next()` when a full sentence with spaces is required.
2. ❌ Forgetting the newline issue after `nextInt()` / `nextDouble()` before `nextLine()`.
3. ❌ Using `%d` for a `double` in `printf()`.
4. ❌ Assuming `nextInt()` accepts arbitrary text; invalid input can throw an exception.
5. ❌ Closing a shared `System.in` scanner while more input is still required.
6. ❌ Forgetting `import java.util.Scanner;`.

## 📝 Practice

### Basic
1. Print your name, age and college using `println()`.
2. Print the same details using `printf()`.
3. Take two integers and print their sum.
4. Take a name containing spaces using `nextLine()`.
5. Take a character from the user.

### Understanding
6. Difference between `print()`, `println()`, and `printf()`?
7. Difference between `next()` and `nextLine()`?
8. Why is an extra `nextLine()` sometimes required after `nextInt()`?
9. What happens when `nextInt()` receives non-numeric input?
10. What happens when a `Scanner` wrapping `System.in` is closed?

### Interview Check
11. What is `System.in`?
12. What is `System.out`?
13. Why do we import `java.util.Scanner`?
14. Which Scanner method reads a complete line?
15. How do you read a character using Scanner?
