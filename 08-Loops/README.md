# 6. Loops in Java

A loop repeats a block of code while a condition is satisfied.

## 1. for loop

Best when you know how many times you want to repeat something.

```java
for (int i = 1; i <= 5; i++) {
    // i changes from 1 to 5.
    System.out.println("Count: " + i);
}
```

### How it works

```text
int i = 1      → initialization
 i <= 5        → condition
 print         → loop body
 i++           → update
 repeat...
```

## 2. while loop

Checks the condition first, then executes the body.

```java
int i = 1;

while (i <= 5) {
    System.out.println("Count: " + i);

    // Increase i, otherwise the loop would never end.
    i++;
}
```

## 3. do-while loop

Executes the body **at least once**, because the condition is checked after the body.

```java
int i = 1;

do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

## 4. Nested loop

A loop inside another loop.

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 3; column++) {
        // Inner loop runs completely for each outer-loop iteration.
        System.out.print("* ");
    }

    System.out.println(); // Move to the next row.
}
```

Output:

```text
* * *
* * *
* * *
```

## 5. break

Stops the loop immediately.

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break; // Stop the loop when i becomes 5.
    }

    System.out.println(i);
}
```

## 6. continue

Skips the current iteration and moves to the next iteration.

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue; // Skip printing 3.
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

## 📝 Practice

1. Print numbers from 1 to 10.
2. Print even numbers from 1 to 50.
3. Find the sum of numbers from 1 to 100.
4. Print a multiplication table.
5. Create a star pattern using nested loops.
6. Use `break` to stop when a number reaches 7.
7. Use `continue` to skip all even numbers.
