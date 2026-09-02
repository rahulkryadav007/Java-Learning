# Exception Handling Practice Questions

## Beginner

1. What is an exception?
2. What is the difference between compile-time error and runtime exception?
3. What is the purpose of `try`?
4. What is the purpose of `catch`?
5. What is the purpose of `finally`?
6. What does `e` represent in `catch (Exception e)`?
7. Write a program to handle division by zero.
8. Write a program to handle invalid array index.

## Intermediate

9. Explain checked vs unchecked exceptions with two examples each.
10. Why should a general `Exception` catch normally come after specific catches?
11. Explain `throw` vs `throws`.
12. Write a method that throws `IllegalArgumentException` when age is below 18.
13. Create a custom `InvalidPasswordException`.
14. Read a file using try-with-resources and handle `IOException`.
15. Write a program using multiple catch blocks.

## Interview Practice

- Can we have `try` without `catch`?
- Can we have `try` with `finally` but without `catch`?
- Can `finally` be skipped?
- Can we have multiple `catch` blocks?
- What happens if an exception is not handled?
- Difference between `throw` and `throws`?
- Difference between checked and unchecked exceptions?
- Why is `NullPointerException` common?
- What is a custom exception and why do we use it?
- What is try-with-resources?

## Coding Challenge

Build a **Student Registration System** that validates:

- Name cannot be empty.
- Age must be between 18 and 60.
- Marks must be between 0 and 100.
- Invalid data should produce meaningful custom exceptions.
- The main method should handle the exceptions and keep the program running.
