# 06 - Inheritance

Inheritance allows a child class to reuse and extend the members of a parent class.

```java
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```

`Dog` **is an** `Animal`, so `Dog` inherits accessible behavior from `Animal`.

## Types in Java
- Single inheritance
- Multilevel inheritance
- Hierarchical inheritance

Java does **not** support multiple inheritance of classes. Multiple type inheritance can be achieved with interfaces.

## Important Keywords
- `extends`
- `super`

## Interview
**Q: Why doesn't Java support multiple inheritance with classes?** It avoids ambiguity such as the diamond problem and keeps class inheritance simpler.

**Q: Can private members be inherited?** They are not directly accessible in the child class.

**Q: What is IS-A?** An inheritance relationship, e.g. Dog IS-A Animal.
