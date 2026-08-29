# 07 - Method Overloading

Method overloading means having multiple methods with the **same name but different parameter lists** in the same class.

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
}
```

The compiler chooses the matching method based on arguments. This is **compile-time polymorphism**.

## Valid differences
- Number of parameters
- Parameter types
- Parameter order

Return type alone cannot overload a method.

## Interview
**Q: Can we overload by changing only return type?** No.

**Q: Is constructor overloading possible?** Yes; constructors can have different parameter lists.
