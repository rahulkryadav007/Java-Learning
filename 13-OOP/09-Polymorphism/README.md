# 09 - Polymorphism

**Polymorphism = one name/interface, many forms.**

Java commonly demonstrates:

### 1. Compile-time polymorphism
Method overloading.

```java
class Printer {
    void print(int n) { System.out.println(n); }
    void print(String s) { System.out.println(s); }
}
```

### 2. Runtime polymorphism
Method overriding + a parent reference pointing to a child object.

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Bark
    }
}
```

The **actual object** is `Dog`, so the overridden instance method is selected at runtime.

## Interview
**Q: What is runtime polymorphism?** Dynamic method dispatch where an overridden instance method is selected according to the runtime object.

**Q: Why use parent reference?** It lets code depend on a common abstraction while different child implementations provide behavior.
