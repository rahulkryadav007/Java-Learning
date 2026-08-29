# 12 - Interface

An interface defines a contract that implementing classes agree to follow.

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
```

## Important
- A class uses `implements`.
- Interface methods are public by contract when they are abstract instance methods, so implementations must be `public`.
- Interface fields are implicitly `public static final`.
- Interfaces can also contain `default` and `static` methods with implementations.
- You cannot directly instantiate an interface.

## Interview
**Q: Why use interfaces?** To define contracts and enable loose coupling and multiple type inheritance.

**Q: Interface vs abstract class?** An interface primarily defines a contract; an abstract class can share state and implementation as well. A class can implement multiple interfaces but extend only one class.
