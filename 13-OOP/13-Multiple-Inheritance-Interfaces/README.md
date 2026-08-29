# 13 - Multiple Inheritance Using Interfaces

Java does not allow a class to extend multiple classes, but one class can implement multiple interfaces.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flies"); }
    public void swim() { System.out.println("Duck swims"); }
}
```

The `Duck` class gets two contracts without multiple class inheritance.

## Default-method conflict
If two interfaces provide the same `default` method, the implementing class must resolve the conflict by overriding it.

## Interview
**Q: Can a class implement multiple interfaces?** Yes.

**Q: Why is this useful?** It lets a class satisfy multiple independent capabilities/contracts while avoiding multiple class inheritance.
