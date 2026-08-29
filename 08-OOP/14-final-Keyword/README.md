# 14 - `final` Keyword

`final` prevents further change in different contexts.

## 1. final variable
```java
final int MAX_AGE = 100;
// MAX_AGE = 101; // compile-time error
```

## 2. final method
A final method cannot be overridden.

```java
class Parent {
    final void show() { System.out.println("Fixed behavior"); }
}
```

## 3. final class
A final class cannot be extended.

```java
final class Utility { }
```

## Important
A `final` reference cannot point to a different object, but the object's internal state may still be mutable.

## Interview
**Q: Can a final variable be initialized later?** Yes, if it is definitely assigned exactly once (for example, a blank final field in a constructor).

**Q: Can a final class have child classes?** No.

**Q: Is `final` the same as immutable?** No. `final` prevents reassignment/overriding/inheritance depending on context; immutability is a property of object state.
