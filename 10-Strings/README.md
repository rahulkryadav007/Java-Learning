# 10 - Strings

Java `String` is an object used to represent text. Strings are immutable: once a `String` object is created, its contents cannot be changed.

## Learn in this order
1. String creation
2. `length()` and `charAt()`
3. String indexing and traversal
4. `equals()` vs `==`
5. `substring()` and searching
6. `toUpperCase()`, `toLowerCase()`, `trim()` and `strip()`
7. `replace()`, `replaceAll()`, `split()` and `join()`
8. String immutability
9. String Pool and `intern()`
10. `StringBuilder` and `StringBuffer`
11. Common string problems

## 1. Creating Strings

```java
String a = "Java";                 // String literal
String b = new String("Java");     // Explicit object creation
char[] letters = {'J', 'a', 'v', 'a'};
String c = new String(letters);     // From a character array
```

Prefer string literals in normal code. Java maintains a **String Pool** for string literals to reuse immutable string objects.

## 2. Important String Methods

| Method | Purpose | Example |
|---|---|---|
| `length()` | number of UTF-16 code units | `name.length()` |
| `charAt(i)` | character at index | `name.charAt(0)` |
| `substring(begin)` | text from index onward | `name.substring(2)` |
| `substring(begin, end)` | text in `[begin, end)` | `name.substring(1, 4)` |
| `indexOf()` | first matching position | `text.indexOf("a")` |
| `lastIndexOf()` | last matching position | `text.lastIndexOf("a")` |
| `contains()` | checks whether text exists | `text.contains("Java")` |
| `startsWith()` | prefix check | `text.startsWith("J")` |
| `endsWith()` | suffix check | `text.endsWith("a")` |
| `equals()` | content comparison | `a.equals(b)` |
| `equalsIgnoreCase()` | case-insensitive comparison | `a.equalsIgnoreCase(b)` |
| `compareTo()` | lexicographic comparison | `a.compareTo(b)` |
| `toUpperCase()` | uppercase copy | `text.toUpperCase()` |
| `toLowerCase()` | lowercase copy | `text.toLowerCase()` |
| `trim()` | removes leading/trailing ASCII whitespace | `text.trim()` |
| `strip()` | removes leading/trailing Unicode whitespace | `text.strip()` |
| `replace()` | literal replacement | `text.replace("a", "b")` |
| `replaceAll()` | regex replacement | `text.replaceAll("\\d", "*")` |
| `split()` | splits using regex | `text.split(",")` |
| `isEmpty()` | length is zero | `text.isEmpty()` |
| `isBlank()` | empty or whitespace-only | `text.isBlank()` |
| `concat()` | joins strings | `a.concat(b)` |
| `repeat(n)` | repeats text | `"Hi ".repeat(3)` |
| `join()` | joins multiple strings | `String.join(", ", "A", "B")` |

**Important:** `length()` is a method for `String`, while `array.length` is a field for arrays.

## 3. `==` vs `equals()`

- `==` compares references when used with objects.
- `equals()` compares String contents.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // false: different objects
System.out.println(a.equals(b));  // true: same content
```

Do not use `==` when your intention is to compare String content.

## 4. Immutability

String methods return a new String when a change is requested.

```java
String text = "java";
text.toUpperCase();
System.out.println(text); // java

text = text.toUpperCase();
System.out.println(text); // JAVA
```

The original String object was not modified.

## 5. String Pool

String literals can be stored in the JVM's String Pool and reused.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // typically true: same pooled literal reference
```

Do not generalize this to all Strings: `new String("Java")` creates a distinct String object. `intern()` can return the canonical pooled representation.

## 6. StringBuilder vs StringBuffer

For repeated modifications:

- `StringBuilder` is mutable and generally preferred for single-threaded string construction.
- `StringBuffer` is also mutable and its key methods are synchronized, so it is useful when that synchronization is specifically needed.
- `String` is immutable and is convenient for ordinary text values.

```java
StringBuilder builder = new StringBuilder("Java");
builder.append(" Learning");
builder.insert(5, "Programming ");
builder.reverse();
System.out.println(builder);
```

Common `StringBuilder` methods: `append()`, `insert()`, `delete()`, `deleteCharAt()`, `replace()`, `reverse()`, `setCharAt()`, `toString()`.

## 7. String Problems for DSA

Practice:

1. Reverse a String
2. Check palindrome
3. Count vowels and consonants
4. Count words
5. Count frequency of a character
6. Remove spaces
7. Remove duplicate characters
8. Check anagram
9. Find first non-repeating character
10. Reverse words in a sentence
11. Check whether one String is a rotation of another
12. Find the longest word

## 8. Real-World Examples

- Username/password validation
- Search boxes and filtering
- Parsing CSV-like input
- Formatting names and addresses
- Generating messages and reports
- Building URLs, SQL fragments, or JSON text carefully

## 9. Common Mistakes

- Using `==` instead of `equals()` for content comparison
- Thinking String methods modify the original String
- Forgetting that indexes start at `0`
- Calling `charAt(length())` — the last valid index is `length() - 1`
- Confusing `substring(begin, end)` with an inclusive end index
- Using `replaceAll()` when literal replacement with `replace()` is enough
- Forgetting that `split()` uses a regular expression
- Using `length` instead of `length()` for a String
- Building a large String with repeated `+` inside a loop when `StringBuilder` is more appropriate
- Assuming every String literal and every `new String(...)` object has the same reference

## 10. Interview Questions

1. Why is String immutable in Java?
2. What is the difference between `==` and `equals()` for Strings?
3. What is the String Pool?
4. What is `intern()`?
5. Why is `StringBuilder` usually preferred for repeated concatenation?
6. Difference between `StringBuilder` and `StringBuffer`?
7. Difference between `substring()` and `subSequence()`?
8. What does `compareTo()` return?
9. Difference between `replace()` and `replaceAll()`?
10. Why can `split(".")` surprise beginners? (Because `.` is a regex metacharacter.)

## Completion Checklist

- [x] String creation
- [x] String methods
- [x] Indexing and traversal
- [x] `==` vs `equals()`
- [x] Immutability
- [x] String Pool
- [x] Searching and substring
- [x] Replace and split
- [x] `StringBuilder`
- [x] `StringBuffer` comparison
- [x] DSA problems
- [x] Common mistakes and interview questions
