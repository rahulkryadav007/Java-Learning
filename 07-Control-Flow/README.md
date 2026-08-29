# 5. Control Flow Statements

Control flow statements decide **which code should execute and when**.

## 1. if statement

Use `if` when code should run only when a condition is true.

```java
int age = 20;

if (age >= 18) {
    // This block runs because age is 18 or more.
    System.out.println("You can vote.");
}
```

## 2. if-else

```java
int number = 7;

if (number % 2 == 0) {
    // Remainder 0 means the number is even.
    System.out.println("Even number");
} else {
    // Otherwise, the number is odd.
    System.out.println("Odd number");
}
```

## 3. else-if ladder

Use it when there are multiple conditions.

```java
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 75) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else if (marks >= 40) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

## 4. Nested if

An `if` inside another `if`.

```java
int age = 22;
boolean hasId = true;

if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed.");
    }
}
```

## 5. switch

Useful when one expression is compared with several fixed cases.

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break; // Stop here instead of continuing to the next case.

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

### Why `break`?

Without `break`, traditional switch cases can continue into the following cases. This behavior is called **fall-through**.

## 📝 Practice

1. Check whether a number is positive, negative or zero.
2. Find the largest of two numbers.
3. Create a marks-to-grade program.
4. Create a simple calculator using `switch`.
5. Create a login check using nested `if`.
