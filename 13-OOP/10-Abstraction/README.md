# 10 - Abstraction

Abstraction means focusing on **what an object does** while hiding unnecessary implementation details.

Real life: You press a car's brake pedal without needing to know every internal braking mechanism.

Java mainly provides abstraction through **abstract classes and interfaces**.

```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key/button");
    }
}
```

## Encapsulation vs Abstraction
- Encapsulation → controls access to state.
- Abstraction → hides implementation complexity and exposes essential behavior.

## Interview
**Q: Why abstraction?** To reduce complexity and allow code to depend on essential contracts rather than implementation details.

**Q: How is abstraction achieved in Java?** Mainly using abstract classes and interfaces.
