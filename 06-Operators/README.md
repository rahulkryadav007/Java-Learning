# 06 - Operators

An **operator** is a symbol that tells Java to perform an operation on one or more operands.

```text
Operand + Operator + Operand → Expression → Result
10      +          20        → 10 + 20    → 30
```

## Learn in this order

1. Arithmetic operators
2. Assignment operators
3. Relational / comparison operators
4. Logical operators
5. Unary operators
6. Increment / decrement
7. Ternary operator
8. Bitwise operators
9. Shift operators
10. `instanceof`
11. Operator precedence and associativity
12. Short-circuit evaluation

---

## 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Remainder | `a % b` |

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

### Integer division

If both operands are integers, division produces an integer result:

```java
System.out.println(5 / 2);   // 2
System.out.println(5 / 2.0); // 2.5
```

`%` is useful for checking even/odd numbers:

```java
int number = 17;
System.out.println(number % 2 == 0); // false
```

---

## 2. Assignment Operators

Used to assign or update a variable.

| Operator | Equivalent |
|---|---|
| `=` | `a = 5` |
| `+=` | `a = a + 5` |
| `-=` | `a = a - 5` |
| `*=` | `a = a * 5` |
| `/=` | `a = a / 5` |
| `%=` | `a = a % 5` |
| `&=` | bitwise AND assignment |
| `|=` | bitwise OR assignment |
| `^=` | bitwise XOR assignment |
| `<<=` | left-shift assignment |
| `>>=` | signed right-shift assignment |
| `>>>=` | unsigned right-shift assignment |

```java
int score = 10;
score += 5;
System.out.println(score); // 15
```

---

## 3. Relational / Comparison Operators

Compare values and produce a `boolean` result.

```text
>   greater than
<   less than
>=  greater than or equal to
<=  less than or equal to
==  equal to
!=  not equal to
```

```java
int age = 20;
System.out.println(age >= 18); // true
```

> `=` means assignment, while `==` means equality comparison.

### Comparing objects

For objects such as `String`, `==` checks whether two references refer to the same object, not whether their text contents are equal.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

---

## 4. Logical Operators

Used mainly with boolean expressions.

| Operator | Name | Meaning |
|---|---|---|
| `&&` | AND | both conditions must be true |
| `||` | OR | at least one condition must be true |
| `!` | NOT | reverses boolean value |

```java
int age = 25;
boolean hasId = true;

System.out.println(age >= 18 && hasId); // true
```

### Short-circuit evaluation

With `&&`, if the left side is `false`, Java may not evaluate the right side. With `||`, if the left side is `true`, Java may not evaluate the right side.

```java
int x = 0;
if (x != 0 && 10 / x > 1) {
    System.out.println("Valid");
}
```

The second condition is not evaluated because `x != 0` is false.

> `&` and `|` can also operate on boolean operands, but unlike `&&` and `||`, they do not short-circuit.

---

## 5. Unary Operators

Operate on one operand.

| Operator | Meaning |
|---|---|
| `+` | unary plus |
| `-` | unary minus |
| `++` | increment by 1 |
| `--` | decrement by 1 |
| `!` | logical NOT |
| `~` | bitwise complement |

```java
int x = 5;
System.out.println(-x); // -5
System.out.println(!true); // false
```

### Pre-increment vs Post-increment

```java
int a = 5;
int x = ++a; // a becomes 6, then x gets 6

int b = 5;
int y = b++; // y gets 5, then b becomes 6
```

Same idea applies to `--`.

---

## 6. Ternary Operator

A compact alternative for a simple `if-else` value selection.

```java
int age = 20;
String result = age >= 18 ? "Adult" : "Minor";
System.out.println(result);
```

Syntax:

```text
condition ? valueIfTrue : valueIfFalse
```

Use it for simple expressions; avoid deeply nested ternaries because they reduce readability.

---

## 7. Bitwise Operators

Work on individual bits of integral types (`byte`, `short`, `int`, `long`, and `char`, with numeric promotion rules applying).

| Operator | Meaning |
|---|---|
| `&` | AND |
| `|` | OR |
| `^` | XOR |
| `~` | complement |

Example with binary values:

```text
5  = 0101
3  = 0011
----------
5 & 3 = 0001 = 1
5 | 3 = 0111 = 7
5 ^ 3 = 0110 = 6
```

---

## 8. Shift Operators

| Operator | Meaning |
|---|---|
| `<<` | left shift |
| `>>` | signed right shift |
| `>>>` | unsigned right shift |

```java
int x = 8;
System.out.println(x << 1); // 16
System.out.println(x >> 1); // 4
```

`>>` preserves the sign bit for signed integers; `>>>` shifts in zero bits from the left.

---

## 9. `instanceof`

Checks whether an object reference is compatible with a given type.

```java
String name = "Java";
System.out.println(name instanceof String); // true
```

The result is a boolean.

---

## 10. Operator Precedence & Parentheses

When an expression contains multiple operators, precedence determines the order of evaluation. Use parentheses when clarity matters.

```java
int result = 10 + 2 * 3;
System.out.println(result); // 16

int clear = (10 + 2) * 3;
System.out.println(clear); // 36
```

A useful beginner order to remember:

```text
() → unary → * / % → + - → comparisons → && → || → ?: → assignment
```

Do not memorize every rule at once; use parentheses when there is any doubt.

---

## 11. Complete Example

```java
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        a += 5;
        System.out.println("After += 5: " + a);

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        boolean adult = a >= 18;
        boolean hasId = true;
        System.out.println("Can enter: " + (adult && hasId));

        int number = 5;
        System.out.println("Pre-increment: " + (++number));
        System.out.println("Post-increment: " + (number++));
        System.out.println("After post-increment: " + number);

        String status = number >= 18 ? "Adult" : "Minor";
        System.out.println("Status: " + status);

        System.out.println("5 & 3: " + (5 & 3));
        System.out.println("8 << 1: " + (8 << 1));

        int precedence = 10 + 2 * 3;
        System.out.println("10 + 2 * 3: " + precedence);
    }
}
```

## Common Mistakes

1. ❌ Confusing `=` with `==`.
2. ❌ Expecting `5 / 2` to produce `2.5`.
3. ❌ Comparing String contents using `==` instead of `.equals()`.
4. ❌ Confusing `&&` / `||` with `&` / `|`.
5. ❌ Forgetting the difference between pre-increment and post-increment.
6. ❌ Writing complicated nested ternary expressions.
7. ❌ Ignoring operator precedence when an expression is hard to read.
8. ❌ Assuming `>>` and `>>>` behave identically for negative numbers.

## 📝 Practice

### Basic
1. Write a program using all five arithmetic operators.
2. Check whether a number is even or odd using `%`.
3. Use `+=`, `-=`, `*=`, `/=`, and `%=`.
4. Compare two numbers using all six relational operators.
5. Check whether a student is eligible using `&&` and `||`.
6. Find the larger of two numbers using the ternary operator.

### Understanding
7. Difference between `=` and `==`?
8. Why does `5 / 2` return `2`?
9. Difference between `++x` and `x++`?
10. Why is `String.equals()` normally used instead of `==` for content comparison?
11. What is short-circuit evaluation?
12. What is the difference between `>>` and `>>>`?

### Interview Check
13. What are the major categories of Java operators?
14. What is operator precedence?
15. What is associativity?
16. Difference between logical and bitwise operators?
17. What is the ternary operator?
18. What does `instanceof` return?
