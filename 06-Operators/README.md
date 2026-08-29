# 4. Operators in Java

Operators are symbols that tell Java to perform an operation on values.

## 1. Arithmetic operators

`+`, `-`, `*`, `/`, `%`

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13 - addition
System.out.println(a - b); // 7  - subtraction
System.out.println(a * b); // 30 - multiplication
System.out.println(a / b); // 3  - integer division
System.out.println(a % b); // 1  - remainder
```

## 2. Relational operators

`>`, `<`, `>=`, `<=`, `==`, `!=`

They return a boolean value.

```java
int age = 20;

System.out.println(age >= 18); // true
System.out.println(age == 20); // true
System.out.println(age != 20); // false
```

## 3. Logical operators

- `&&` – AND: both conditions must be true.
- `||` – OR: at least one condition must be true.
- `!` – NOT: reverses a boolean value.

```java
int age = 25;
boolean hasId = true;

System.out.println(age >= 18 && hasId); // true
System.out.println(age < 18 || hasId);  // true
System.out.println(!hasId);             // false
```

## 4. Assignment operators

`=`, `+=`, `-=`, `*=`, `/=`, `%=`

```java
int marks = 50;
marks += 10; // same as marks = marks + 10
System.out.println(marks); // 60
```

## 5. Unary operators

`++` increments and `--` decrements a value.

```java
int count = 5;

count++; // count becomes 6
count--; // count becomes 5
```

### Pre-increment vs post-increment

```java
int a = 5;

System.out.println(++a); // First increase, then print: 6

int b = 5;
System.out.println(b++); // First print, then increase: 5
System.out.println(b);   // Now b is 6
```

## 6. Ternary operator

Short form of a simple `if-else`.

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";
System.out.println(result);
```

## 📝 Practice

1. Calculate the total and remainder of two numbers.
2. Check whether a number is greater than 50.
3. Check whether a person is eligible to vote using `&&`.
4. Use `+=` and `-=` on a variable.
5. Use a ternary operator to find whether a number is even or odd.
