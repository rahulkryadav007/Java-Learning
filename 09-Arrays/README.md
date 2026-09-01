# 09 - Arrays

An **array** is an object that stores a fixed-size sequence of values of one component type. Array indexing starts at `0`.

```text
marks = [70, 80, 90, 85]
index    0   1   2   3
```

## Learn in This Order

1. Array declaration, creation, and initialization
2. Indexing and updating
3. `length`
4. Traversing with `for` and enhanced `for`
5. Taking array input
6. Searching
7. Sum, average, max, and min
8. Copying arrays
9. Sorting
10. 2D / multidimensional arrays
11. Jagged arrays
12. Arrays of objects
13. Common array mistakes and problem solving

---

## 1. Array Declaration and Creation

```java
int[] marks;       // declaration
marks = new int[5]; // creation
```

You can also combine them:

```java
int[] marks = new int[5];
```

Or initialize with values:

```java
int[] marks = {70, 80, 90, 85};
```

`int[] marks` and `int marks[]` are both valid Java syntax, but `int[] marks` is generally clearer and preferred.

### Fixed size

Once created, an array's length cannot be changed. If you need a dynamically growing collection, learn `ArrayList` later.

---

## 2. Default Values

When an array is created with `new`, its elements receive default values according to the component type:

```java
int[] numbers = new int[3];
boolean[] flags = new boolean[3];
String[] names = new String[3];
```

Their initial values are respectively `0`, `false`, and `null`.

Local array **variables** still must be initialized before use; the default values apply to the elements of a newly created array.

---

## 3. Access and Update

```java
int[] marks = {70, 80, 90};

System.out.println(marks[0]); // 70
marks[1] = 95;
System.out.println(marks[1]); // 95
```

Invalid indexes cause `ArrayIndexOutOfBoundsException`:

```java
// marks[3] = 100; // invalid: valid indexes are 0, 1, 2
```

---

## 4. `length`

Every array object has a `length` field.

```java
int[] marks = {70, 80, 90, 85};
System.out.println(marks.length); // 4
```

Remember:

```text
array.length     → field
String.length()  → method
```

---

## 5. Traversing an Array

### Traditional `for`

Best when the index is needed:

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(i + " -> " + marks[i]);
}
```

### Enhanced `for`

Best when only the values are needed:

```java
for (int mark : marks) {
    System.out.println(mark);
}
```

---

## 6. Different Array Component Types

Arrays can contain primitives or references.

```java
int[] numbers = {10, 20, 30};
double[] prices = {99.5, 149.0};
char[] letters = {'J', 'a', 'v', 'a'};
boolean[] results = {true, false};
String[] names = {"Rahul", "Aman", "Priya"};
```

An array is itself an **object** in Java, including arrays of primitive values.

---

## 7. Array of Objects

A reference-type array stores references to objects.

```java
String[] names = {"Rahul", "Aman", "Priya"};
```

For a custom class:

```java
Student[] students = new Student[2];
students[0] = new Student("Rahul");
students[1] = new Student("Aman");
```

`new Student[2]` creates the array of references; it does **not** automatically create two `Student` objects. Each element must refer to an actual object before calling its methods.

---

## 8. Anonymous Array

An array can be created without storing it in a variable first:

```java
printNumbers(new int[]{10, 20, 30});
```

This is useful when an array is needed only for one method call.

---

## 9. Taking Array Input

```java
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] numbers = new int[n];

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = scanner.nextInt();
}
```

Always ensure that the input count matches the array length you intend to fill.

---

## 10. Common Array Operations

### Sum and average

```java
int sum = 0;
for (int value : numbers) {
    sum += value;
}

double average = (double) sum / numbers.length;
```

The cast is important if you want fractional results.

### Maximum and minimum

Initialize from the first element rather than blindly using `0`, because an array may contain only negative numbers.

```java
int max = numbers[0];
int min = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    max = Math.max(max, numbers[i]);
    min = Math.min(min, numbers[i]);
}
```

This approach assumes the array is non-empty.

---

## 11. Searching

### Linear search

Check elements one by one.

```java
int target = 90;
int index = -1;

for (int i = 0; i < marks.length; i++) {
    if (marks[i] == target) {
        index = i;
        break;
    }
}
```

Time complexity: `O(n)`.

### Binary search

Binary search requires a sorted array and runs in `O(log n)` time.

Java also provides `Arrays.binarySearch()` for sorted arrays.

---

## 12. Copying Arrays

Assignment copies the **reference**, not the array contents:

```java
int[] a = {1, 2, 3};
int[] b = a;
b[0] = 99;

System.out.println(a[0]); // 99
```

For an independent copy, use methods such as:

```java
int[] copy1 = a.clone();
int[] copy2 = Arrays.copyOf(a, a.length);
```

For arrays containing object references, these are shallow copies: the references are copied, not the referenced objects themselves.

---

## 13. Sorting

For basic Java sorting, use `Arrays.sort()`:

```java
int[] numbers = {40, 10, 30, 20};
Arrays.sort(numbers);
```

After sorting:

```text
10 20 30 40
```

For DSA practice, also learn manual algorithms such as bubble sort, selection sort, and insertion sort later.

---

## 14. 2D Arrays / Multidimensional Arrays

A 2D array can be viewed as rows and columns:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrix[1][2]); // 6
```

Traversal:

```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```

### Important concept

Java multidimensional arrays are actually **arrays of arrays**. Therefore, each row can have a different length.

---

## 15. Jagged Array

A jagged array is a 2D array whose rows have different lengths.

```java
int[][] marks = new int[3][];
marks[0] = new int[]{80, 90};
marks[1] = new int[]{70, 85, 88};
marks[2] = new int[]{95};
```

This is possible because Java's multidimensional arrays are arrays of arrays.

---

## 16. Multidimensional Array Beyond 2D

Java supports arrays with more dimensions:

```java
int[][][] data = new int[2][3][4];
```

In practice, 1D and 2D arrays are the most common in beginner programming and DSA.

---

## 17. Useful `java.util.Arrays` Methods

```java
Arrays.sort(numbers);
Arrays.toString(numbers);
Arrays.copyOf(numbers, numbers.length);
Arrays.equals(a, b);
Arrays.fill(numbers, 0);
Arrays.binarySearch(numbers, 20); // array must be sorted for meaningful binary search
```

Import:

```java
import java.util.Arrays;
```

`Arrays.toString()` is useful because printing an array directly does not display its elements in the expected list format.

---

## Real-World Examples

- Student marks → `int[]`
- Product prices → `double[]`
- User names → `String[]`
- Seating arrangement → `String[][]`
- Matrix calculations → 2D arrays
- Unequal rows of data → jagged arrays
- Collection of Student objects → `Student[]`

## Common Mistakes

1. ❌ Using index `length` — last valid index is `length - 1`.
2. ❌ Accessing an empty array at index `0`.
3. ❌ Assuming `new Student[5]` creates five `Student` objects.
4. ❌ Forgetting that arrays have fixed length.
5. ❌ Using `a = b` when you intended to make a copy of the contents.
6. ❌ Using binary search on an unsorted array.
7. ❌ Printing an array directly instead of using `Arrays.toString()` for a readable representation.
8. ❌ Assuming every 2D array must be rectangular.

## Practice Questions

### Basic
1. Create an array of 5 integers and print all elements.
2. Find sum and average.
3. Find maximum and minimum.
4. Count even and odd elements.
5. Reverse an array.
6. Search for a target value using linear search.

### Intermediate
7. Find the second-largest element.
8. Remove duplicate values conceptually / using DSA logic.
9. Move all zeroes to the end.
10. Rotate an array left/right.
11. Merge two sorted arrays.
12. Implement bubble sort manually.
13. Find the frequency of each element.
14. Transpose a matrix.
15. Find row-wise and column-wise sums of a matrix.

### Interview Check
1. Is an array an object in Java?
2. What is the difference between `length` and `length()`?
3. Why does an array index start at 0?
4. What happens when an invalid index is accessed?
5. Difference between array reference assignment and copying?
6. What is an array of objects?
7. Why can Java have jagged arrays?
8. Difference between `int[]` and `Integer[]`?
9. What is the time complexity of linear search?
10. What condition is required for binary search?
