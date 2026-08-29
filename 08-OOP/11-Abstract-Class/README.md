# 11 - Abstract Class

An abstract class is a class declared with `abstract`. It **cannot be instantiated directly**.

```java
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

An abstract class can contain:
- Abstract methods
- Concrete methods
- Fields
- Constructors
- Static members

A child class must implement inherited abstract methods unless the child is also abstract.

## Interview
**Q: Can an abstract class have a constructor?** Yes. It runs as part of child-object construction.

**Q: Can an abstract class have no abstract methods?** Yes.

**Q: Can we create an object of an abstract class?** No, not directly.
