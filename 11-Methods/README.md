# 7. Methods in Java

A **method** is a reusable block of code that performs a specific task.

Methods help us:

- Avoid repeating code
- Make programs easier to read
- Divide a large program into smaller tasks
- Reuse logic

## Basic method structure

```java
returnType methodName(parameters) {
    // method body
}
```

## 1. Method with no parameter and no return value

```java
public static void greet() {
    // This method only prints a message.
    System.out.println("Welcome to Java!");
}
```

Call it from `main()`:

```java
greet();
```

## 2. Method with parameters

Parameters allow us to send data into a method.

```java
public static void greetStudent(String name) {
    // name is received as a parameter.
    System.out.println("Hello " + name);
}
```

Call:

```java
greetStudent("Rahul");
```

## 3. Method with return value

A method can calculate something and return the result.

```java
public static int add(int a, int b) {
    // Calculate the sum.
    int result = a + b;

    // Send the result back to the caller.
    return result;
}
```

Call:

```java
int answer = add(10, 20);
System.out.println(answer); // 30
```

## 4. Complete example

```java
public class MethodExample {

    // No parameter + no return value.
    static void welcome() {
        System.out.println("Welcome to Java Learning!");
    }

    // Parameters + no return value.
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // Parameters + return value.
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling a method.
        welcome();

        // Passing a value to a method.
        greet("Rahul");

        // Store the returned value in a variable.
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
```

## 5. Method overloading

Method overloading means having multiple methods with the **same name but different parameter lists**.

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Now Java chooses the correct method based on the arguments:

```java
System.out.println(add(10, 20));       // Calls 2-parameter method
System.out.println(add(10, 20, 30));   // Calls 3-parameter method
```

> Changing only the return type is **not** enough to overload a method.

## ⭐ Important terms

- **Method declaration** – defines the method.
- **Parameter** – variable listed in the method definition.
- **Argument** – actual value passed during a method call.
- **Return type** – type of value returned by the method.
- **void** – method does not return a value.
- **Method call** – executing a method.

## 📝 Practice

1. Create a method that prints your name.
2. Create a method that accepts two numbers and prints their sum.
3. Create a method that returns the square of a number.
4. Create a method to check whether a number is even.
5. Create overloaded methods for calculating area of a square and rectangle.
