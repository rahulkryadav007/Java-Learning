# 08 - Method Overriding

When a child class provides its own implementation of an inherited instance method with the same signature, it is **method overriding**.

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }
}
```

## Rules
- Same method signature (name + parameter types).
- Child method cannot reduce access visibility.
- Use `@Override` so the compiler can catch mistakes.
- Return type may be covariant for reference types.

Overriding enables runtime dispatch.

## Interview
**Q: Overloading vs overriding?** Overloading changes the parameter list and is resolved at compile time; overriding replaces inherited instance behavior and is selected at runtime.

**Q: Can static methods be overridden?** No, they are hidden.
