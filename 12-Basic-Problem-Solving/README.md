# 12 - Basic Problem Solving

This module converts Core Java syntax into actual coding skill.

## Problem-Solving Approach

Before writing code, follow this flow:

**Understand → Identify input/output → Break into steps → Write logic → Dry run → Code → Test edge cases**

Example: To find whether a number is even:
1. Input: one integer.
2. Logic: divide the number by 2 and check the remainder.
3. If `number % 2 == 0`, it is even; otherwise it is odd.
4. Test with positive, negative, and zero values.

## Learn in this order

### 1. Number Problems
- Even / odd
- Positive / negative / zero
- Maximum and minimum
- Factorial
- Prime number
- Prime numbers in a range
- Fibonacci series
- GCD / HCF
- LCM

### 2. Digit Problems
- Count digits
- Sum of digits
- Reverse a number
- Palindrome number
- Armstrong number

**Common technique:** repeatedly use `% 10` to get the last digit and `/ 10` to remove the last digit.

### 3. Pattern Problems
- Square patterns
- Right-angled triangles
- Number patterns
- Character patterns
- Nested-loop based patterns

### 4. Array Problems
- Sum and average
- Maximum and minimum
- Linear search
- Reverse an array
- Count occurrences
- Remove duplicates/basic frequency logic

### 5. String Problems
- Reverse a string
- Palindrome string
- Count vowels/consonants
- Count words
- Character frequency
- Remove spaces/basic cleanup

### 6. Searching and Sorting Basics
- Linear search
- Binary search
- Bubble sort
- Selection sort
- Insertion sort

### 7. Placement-Style Problems
Practice easy problems commonly asked in coding rounds and aptitude-to-coding tests, including TCS NQT-style questions.

### 8. Mixed Timed Practice
Start with untimed practice. Then solve problems with a time limit and review mistakes.

## Dry Run / Trace Table

Dry run means manually executing the logic with sample input before running the program.

For digit problems, track values such as:

| Step | Number | Digit | Result |
|---|---:|---:|---:|
| 1 | 123 | 3 | 3 |
| 2 | 12 | 2 | 32 |
| 3 | 1 | 1 | 321 |

This helps you understand what every variable is doing instead of memorising code.

## Important Edge Cases

Always test:
- `0`
- `1`
- negative numbers where applicable
- smallest expected input
- largest reasonable input
- duplicate values
- empty strings/arrays where applicable
- already sorted input

## Time Complexity Awareness

At this stage, focus on recognising basic growth:
- One simple loop → usually **O(n)**
- Nested loops over the same input → often **O(n²)**
- Halving the search space repeatedly → **O(log n)**, as in binary search

Do not confuse theoretical time complexity with actual execution time on a particular machine.

## Real-World Example

For a bank transaction check:
1. Take transaction amount as input.
2. Check whether the amount is valid.
3. Check account balance.
4. Update the balance.
5. Display the result.

The same **input → process → output** thinking is used in real applications.

## Common Mistakes

- Coding before understanding the problem.
- Not doing a dry run.
- Forgetting edge cases.
- Using `/` when `%` is needed for digit extraction.
- Forgetting that integer division removes the decimal part.
- Creating unnecessary nested loops.
- Using the wrong initial value for maximum/minimum.
- Not checking what happens when input is `0` or `1`.

## Practice Strategy

For every problem, write these five things first:

1. **Input:** What data do I receive?
2. **Output:** What must I print/return?
3. **Logic:** What exact steps solve it?
4. **Dry run:** Can I manually verify one example?
5. **Complexity:** How much work does my solution do?

**Rule:** understand the logic on paper first, then code it yourself.

## Interview Questions

1. What is the difference between an algorithm and a program?
2. How do you approach an unfamiliar coding problem?
3. Why is a dry run useful?
4. How do you extract the last digit of an integer?
5. What is the difference between `%` and `/` in digit problems?
6. How would you check whether a number is prime?
7. What is the difference between linear search and binary search?
8. Why does binary search require sorted data?
9. What is the time complexity of a single loop?
10. Why should edge cases be tested?

## Trainer Checklist

- [ ] Students can convert a question into input, process, and output.
- [ ] Students can write simple algorithms/pseudocode before coding.
- [ ] Students can perform a dry run.
- [ ] Students can solve basic number and digit problems.
- [ ] Students can apply loops to arrays and strings.
- [ ] Students understand basic searching, sorting, and complexity.
- [ ] Students can explain their own solution instead of only memorising code.
