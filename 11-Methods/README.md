# 11 - Methods

Methods are reusable blocks of code that perform a specific task. They help us divide a large program into smaller, readable, testable and reusable pieces.

## 1. Method Anatomy

```java
static int add(int a, int b) {
    return a + b;
}
```

- `static` → method belongs to the class; it can be called without creating an object.
- `int` → return type.
- `add` → method name.
- `int a, int b` → parameters.
- `return a + b` → returned value.

**Parameter vs Argument:** parameters are variables written in the method definition; arguments are actual values supplied during a call.

## 2. Common Method Types

### A. No parameter, no return value
```java
static void greet() {
    System.out.println("Hello");
}
```

### B. Parameter, no return value
```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

### C. No parameter, return value
```java
static int getDefaultAge() {
    return 18;
}
```

### D. Parameter and return value
```java
static int add(int a, int b) {
    return a + b;
}
```

## 3. Calling a Method

```java
int result = add(10, 20);
```

Execution flow: caller → method → statements execute → `return` sends value back → caller continues.

## 4. `void` vs Return Value

A `void` method does not return a value. A non-void method must return a compatible value on every reachable path.

```java
static void printMessage() {
    System.out.println("Java");
}

static int square(int n) {
    return n * n;
}
```

## 5. Method Overloading

Java supports **compile-time polymorphism** through method overloading: same method name, different parameter list.

```java
static int add(int a, int b) { return a + b; }
static int add(int a, int b, int c) { return a + b + c; }
static double add(double a, double b) { return a + b; }
```

Changing only the return type is **not** method overloading.

## 6. Static vs Instance Methods

```java
class Calculator {
    static int add(int a, int b) { return a + b; }

    int multiply(int a, int b) { return a * b; }
}
```

Call the static method with the class name: `Calculator.add(2, 3)`.
Create an object to call the instance method: `new Calculator().multiply(2, 3)`.

## 7. Access Modifiers with Methods

Methods can use `public`, `protected`, package-private (no modifier), or `private` depending on visibility requirements. Access modifiers become especially important with classes and OOP.

## 8. Java Pass-by-Value

Java is **always pass-by-value**. For an object or array, the value passed is a copy of the reference. Therefore a method can modify the object's contents through that copied reference, but reassigning the parameter does not change the caller's reference.

```java
static void change(int x) {
    x = 100;
}

static void changeFirst(int[] numbers) {
    numbers[0] = 100;
}
```

## 9. Varargs (`...`)

Varargs allow a method to accept zero or more arguments. Inside the method, the parameter behaves like an array.

```java
static int sum(int... numbers) {
    int total = 0;
    for (int n : numbers) total += n;
    return total;
}
```

A varargs parameter must be the last parameter.

## 10. Recursion Preview

A recursive method calls itself and must have a **base case** to stop.

```java
static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

Recursion is useful for problems naturally represented as smaller versions of themselves, but every recursive call uses stack memory.

## 11. Scope and Local Variables

Variables declared inside a method are local to that method/block. Parameters are also local variables of the method. They cannot be directly accessed outside their scope.

## 12. Methods and Problem Solving

Good methods usually follow **single responsibility**: one method should perform one clear task.

Example decomposition:
```text
main()
 ├── readInput()
 ├── calculateTotal()
 ├── calculateDiscount()
 └── printBill()
```

This makes code easier to understand, test and reuse.

## 13. Important Rules & Common Mistakes

- `return` must match the declared return type.
- A `void` method cannot return a value such as `return 10;`.
- Do not confuse parameter with argument.
- Return type alone cannot distinguish overloaded methods.
- An instance method normally needs an object when called from a static context.
- A `static` method cannot directly access an instance field/method without an object.
- Method names normally use `camelCase` and should describe an action.
- Recursion needs a terminating base case.
- Java does not support pass-by-reference; it is always pass-by-value.

## 14. Real-World Example

A banking application can separate responsibilities into methods such as `deposit()`, `withdraw()`, `checkBalance()` and `calculateInterest()` instead of putting everything inside `main()`.

## Practice

### Basic
1. Create a method to print your name.
2. Create a method that accepts two integers and prints their sum.
3. Create a method that returns the square of a number.
4. Create a method to check whether a number is even.

### Intermediate
5. Find the maximum of three numbers using a method.
6. Create overloaded `area()` methods for a circle and rectangle.
7. Write a varargs method to find the largest number.
8. Write a recursive factorial method.
9. Create separate methods for input, calculation and output in a simple marks program.

## Interview Questions

1. What is a method in Java?
2. Parameter vs argument?
3. `void` vs non-void method?
4. What is method overloading?
5. Can methods be overloaded by changing only return type?
6. Is Java pass-by-value or pass-by-reference?
7. What is a varargs method?
8. What is recursion and why is a base case required?
9. Static method vs instance method?
10. Why should methods generally follow single responsibility?

## Completion Checklist

- [x] Method declaration and calling
- [x] Parameters and arguments
- [x] Return values and `void`
- [x] Four basic parameter/return combinations
- [x] Static and instance methods
- [x] Method overloading
- [x] Access modifiers
- [x] Scope
- [x] Java pass-by-value
- [x] Varargs
- [x] Recursion basics
- [x] Reusable problem-solving methods
- [x] Common mistakes and interview questions
