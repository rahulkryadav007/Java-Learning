# 03 - `this` Keyword

`this` refers to the **current object**.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(this.name);
    }
}
```

Here `this.name` means the current object's field, while `name` is the constructor parameter.

## Common Uses
1. Resolve field/parameter name conflict.
2. Call another instance method.
3. Call another constructor using `this(...)`.
4. Pass the current object as an argument.

## Interview
**Q: What is `this`?** A reference to the current object.

**Q: Can `this` be used in a static method?** No, because static methods belong to the class and have no current instance.
