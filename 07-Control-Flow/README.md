# 07 - Control Flow

**Control flow** decides which statement runs, how many times it runs, and when execution moves to another part of the program.

Think of it like a traffic signal: depending on the condition, Java chooses the path to follow.

## Learn in this order

1. `if`
2. `if-else`
3. `else-if` ladder
4. Nested `if`
5. `switch` statement
6. `switch` expression
7. `break` and `continue` preview (loops are covered deeply in Module 08)
8. Common mistakes and practice

---

## 1. `if` Statement

Runs a block only when the condition is `true`.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Java conditions must evaluate to `boolean`. Unlike some languages, Java does not treat `0` or `1` as false/true.

---

## 2. `if-else`

Use it when there are exactly two main paths.

```java
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

**Hinglish:** condition true → `if` block, otherwise → `else` block.

---

## 3. `else-if` Ladder

Used when several mutually exclusive conditions need to be checked in order.

```java
if (marks >= 90) {
    System.out.println("A+");
} else if (marks >= 75) {
    System.out.println("A");
} else if (marks >= 60) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

Java checks from top to bottom and executes the first matching branch.

### Important mistake

Order matters:

```java
if (marks >= 40) {
    System.out.println("Pass");
} else if (marks >= 90) {
    System.out.println("A+"); // unreachable logically
}
```

A mark of `95` already satisfies `marks >= 40`, so the later condition will never be reached.

---

## 4. Nested `if`

An `if` inside another `if` is called a **nested if**.

```java
int age = 20;
boolean hasId = true;

if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed");
    }
}
```

**Real-world idea:** first check eligibility, then check the additional requirement.

Do not create deeply nested conditions unnecessarily; combine conditions with `&&` when that improves readability.

---

## 5. `switch` Statement

Useful when one expression is compared against multiple fixed alternatives.

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### `break` is important in traditional switch

Without `break`, execution can **fall through** into the next case.

```java
int number = 1;

switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
}
```

Output:

```text
One
Two
```

This fall-through behavior is sometimes intentional, but beginners should use `break` when they want only one matching case to execute.

### Multiple cases

```java
int day = 6;

switch (day) {
    case 6:
    case 7:
        System.out.println("Weekend");
        break;
    default:
        System.out.println("Weekday");
}
```

### Common switch types

A traditional `switch` can work with supported integral types, `char`, `String`, and `enum` values. It does **not** use arbitrary `boolean`, `float`, or `double` case values.

---

## 6. Modern `switch` Expression

Modern Java also supports switch expressions, which can directly produce a value.

```java
int day = 2;

String name = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid";
};

System.out.println(name);
```

The `->` form does not have the accidental fall-through behavior of the old colon-style cases.

### `yield`

When a switch-expression case needs multiple statements, `yield` returns the value from that case block.

```java
int marks = 82;

String grade = switch (marks / 10) {
    case 10, 9 -> "A";
    case 8 -> {
        System.out.println("Good performance");
        yield "B";
    }
    default -> "C";
};
```

---

## 7. `break` and `continue` Preview

These statements are mainly used with loops and are covered in detail in **Module 08 - Loops**.

- `break` → immediately exits the nearest loop or switch.
- `continue` → skips the current loop iteration and moves to the next iteration.

Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

---

## 8. `if-else` vs `switch`

| Use | Better choice |
|---|---|
| Range checks like `marks >= 75` | `if-else` |
| Complex boolean conditions | `if-else` |
| Fixed menu choices | `switch` |
| Fixed `String` commands | `switch` |
| Enum-based choices | `switch` |
| Simple value-producing selection | switch expression |

---

## 9. Real-World Example: Login Access

```java
boolean loggedIn = true;
String role = "ADMIN";

if (!loggedIn) {
    System.out.println("Please login first");
} else if (role.equals("ADMIN")) {
    System.out.println("Open admin dashboard");
} else if (role.equals("USER")) {
    System.out.println("Open user dashboard");
} else {
    System.out.println("Unknown role");
}
```

This is the same decision-making logic used in applications: **condition → decision → execution path**.

---

## Common Mistakes

1. ❌ Writing `if (age = 18)` instead of `if (age == 18)`.
2. ❌ Forgetting that an `if` condition must be `boolean`.
3. ❌ Putting broad `else-if` conditions before specific ones.
4. ❌ Forgetting `break` in traditional `switch` when fall-through is not intended.
5. ❌ Using `switch` for range-based conditions when `if-else` is clearer.
6. ❌ Confusing `break` and `continue`.
7. ❌ Creating deeply nested `if` statements when simpler boolean logic is possible.

## 📝 Practice

### Basic
1. Check whether a number is positive, negative, or zero.
2. Check whether a student passed or failed.
3. Find the largest of two numbers using `if-else`.
4. Create a grade calculator using an `else-if` ladder.
5. Check whether a person can vote and whether they have a valid ID.
6. Create a calculator menu using traditional `switch`.

### Understanding
7. What happens when no `if` condition is true and there is no `else`?
8. Why does the order of an `else-if` ladder matter?
9. What is nested `if`?
10. What is switch fall-through?
11. Difference between a switch statement and a switch expression?
12. When would you prefer `if-else` over `switch`?

### Interview Check
13. Can Java use `String` in switch?
14. Can `double` be used as a switch selector?
15. What does `break` do inside a switch?
16. What is `yield` in a switch expression?
17. Why doesn't Java allow `if (1)` like some other languages?
