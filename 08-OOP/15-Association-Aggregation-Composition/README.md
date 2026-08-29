# 15 - Association, Aggregation & Composition

These describe **relationships between objects**.

## 1. Association
A general relationship: one object knows/uses another.

```java
class Teacher { }
class Student {
    void learnFrom(Teacher teacher) {
        System.out.println("Learning from teacher");
    }
}
```

## 2. Aggregation
A weak **has-a** relationship. The contained object can exist independently.

```java
class Department {
    Teacher teacher;
    Department(Teacher teacher) {
        this.teacher = teacher;
    }
}
```

The `Teacher` can exist without that `Department`.

## 3. Composition
A strong **has-a** relationship where the owning object controls the contained object's lifecycle.

```java
class Engine { }

class Car {
    private final Engine engine = new Engine();
}
```

Conceptually, the `Engine` is part of the `Car` and is created/managed by it.

## Quick Comparison
| Relationship | Meaning | Independent lifetime? |
|---|---|---|
| Association | uses/knows | Yes |
| Aggregation | weak has-a | Yes |
| Composition | strong has-a | Usually no / owned |

## Interview
**Q: IS-A vs HAS-A?** IS-A is inheritance; HAS-A is object composition/aggregation.

**Q: Composition vs inheritance?** Composition builds behavior by containing other objects; inheritance creates a subtype relationship. Prefer composition when the relationship is not truly IS-A.
