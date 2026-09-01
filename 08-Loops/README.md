# 08 - Loops

A **loop** repeats a block of code while a condition or iteration rule allows it.

Think of a loop like a teacher checking 50 students: instead of writing the same instruction 50 times, we write it once and repeat it.

## Loop Types in Java

Java has four commonly taught loop forms:

1. `for` — useful when initialization, condition, and update are naturally expressed together; often used when the iteration count is known.
2. `while` — checks the condition first; useful when the number of repetitions is not known in advance.
3. `do-while` — executes the body first and checks the condition afterward, so it runs at least once.
4. Enhanced `for` / for-each — traverses arrays and other `Iterable` objects without manually managing an index.

## Supporting Statements

- `break` — immediately exits the nearest loop or switch.
- `continue` — skips the rest of the current loop iteration and proceeds to the next iteration.
- Nested loops — one loop inside another.

---

## 1. `for` Loop

```java
for (initialization; condition; update) {
    // repeated code
}
```

Execution order:

```text
initialization → condition → body → update → condition → ...
```

Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Important points

- Initialization normally runs once.
- The condition is checked before each iteration.
- The update runs after the body.
- A `for` loop can have multiple initialization/update expressions separated by commas.

```java
for (int i = 0, j = 5; i < j; i++, j--) {
    System.out.println(i + " " + j);
}
```

---

## 2. `while` Loop

```java
while (condition) {
    // repeated code
}
```

The condition is checked **before** the body. Therefore, the body can execute zero times.

```java
int attempt = 1;
while (attempt <= 3) {
    System.out.println("Attempt: " + attempt);
    attempt++;
}
```

### Infinite loop warning

```java
while (true) {
    // runs forever unless something exits the loop
}
```

Use an intentional exit such as `break` when an infinite loop is actually required.

---

## 3. `do-while` Loop

```java
do {
    // body
} while (condition);
```

The body executes first, so it always executes **at least once**.

```java
int choice = 1;
do {
    System.out.println("1. View Profile");
    System.out.println("2. Logout");
    choice++;
} while (choice <= 2);
```

Notice the semicolon after the `while` condition.

### `while` vs `do-while`

If the initial condition is false:

```java
int x = 10;

while (x < 5) {
    System.out.println("while"); // never executes
}

do {
    System.out.println("do-while"); // executes once
} while (x < 5);
```

---

## 4. Enhanced `for` / For-Each Loop

Used to visit each element of an array or an `Iterable`.

```java
int[] marks = {85, 72, 91};

for (int mark : marks) {
    System.out.println(mark);
}
```

Read it as: **for each `mark` in `marks`**.

It is convenient when you need the values but do not need the index.

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(i + " -> " + marks[i]);
}
```

Use the traditional `for` when you need the index or more control over iteration.

---

## 5. `break`

Immediately terminates the **nearest enclosing loop**.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

---

## 6. `continue`

Skips the remaining statements of the current iteration.

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

### `break` vs `continue`

```text
break    → stop the loop completely
continue → skip this iteration and continue the loop
```

---

## 7. Nested Loops

A loop inside another loop is a nested loop.

```java
for (int row = 1; row <= 3; row++) {
    for (int column = 1; column <= 4; column++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:

```text
* * * *
* * * *
* * * *
```

The inner loop completes all its iterations for each one iteration of the outer loop.

---

## 8. Loop Control and Scope

A variable declared in a `for` initialization is normally scoped to that `for` statement:

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}
// System.out.println(i); // ERROR: i is out of scope
```

Be careful when modifying the loop variable inside the body because it can make the logic difficult to understand.

---

## 9. Real-World Examples

| Situation | Suitable loop |
|---|---|
| Process 100 student records | `for` |
| Keep asking until a valid password is entered | `while` |
| Display a menu at least once | `do-while` |
| Visit every element of an array | enhanced `for` |
| Stop searching after finding a target | `break` |
| Skip invalid records | `continue` |
| Print rows and columns | nested loops |

---

## 10. Loop-Based Problem Solving

Practice these in increasing difficulty:

### Basic
1. Print numbers from 1 to 100.
2. Print numbers from 100 to 1.
3. Print even and odd numbers separately.
4. Print the multiplication table of a number.
5. Find the sum of numbers from 1 to N.
6. Find the factorial of a number.

### Intermediate
7. Count the digits of a number.
8. Reverse a number.
9. Find the sum of digits.
10. Check whether a number is a palindrome.
11. Check whether a number is prime.
12. Print all prime numbers from 1 to N.
13. Find GCD/HCF using a loop.
14. Print Fibonacci terms.
15. Find the largest element in an array.
16. Count positive, negative, and zero values in an array.

### Patterns
17. Print a rectangle of stars.
18. Print a right triangle.
19. Print an inverted triangle.
20. Print a number pyramid.

---

## Common Mistakes

1. Forgetting to update a `while` loop variable → possible infinite loop.
2. Using `=` instead of a comparison such as `==` where appropriate.
3. Forgetting that `do-while` checks its condition **after** the body.
4. Confusing `break` with `continue`.
5. Using enhanced `for` when the index is required.
6. Accidentally changing the loop variable in multiple places.
7. Creating deeply nested loops without understanding their total work.
8. Forgetting that a loop condition may be checked one extra time before termination.

---

## Interview Questions

1. What are the four common loop forms in Java?
2. Difference between `for` and `while`?
3. Why does `do-while` execute at least once?
4. Difference between `break` and `continue`?
5. What is a nested loop?
6. What is an infinite loop?
7. When should you prefer enhanced `for` over traditional `for`?
8. Can a `for` loop omit its initialization, condition, or update parts?
9. What happens if the condition of a `while` loop is initially false?
10. What is the scope of a variable declared in the `for` initialization?

## Completion Checklist

- [ ] I can write a `for` loop.
- [ ] I can write a `while` loop.
- [ ] I can write a `do-while` loop.
- [ ] I can use enhanced `for`.
- [ ] I understand `break` and `continue`.
- [ ] I can write a nested loop.
- [ ] I can solve basic number problems using loops.
- [ ] I can create simple patterns.
