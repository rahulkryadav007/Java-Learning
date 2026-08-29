# 01 - Class and Object

## Easy Definition
A **class** is a blueprint/template. An **object** is a real instance created from that blueprint.

### Real-life example
`Car` is a class. Your red BMW is an object.

## Java Example
```java
class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 24;
        s1.study();
    }
}
```

### Understand it
- `Student` = class
- `s1` = reference variable
- `new Student()` = creates an object
- `name`, `age` = instance variables
- `study()` = behavior/method

## Important
A class describes objects; an object holds actual state and uses the class behavior.

## Interview Questions
**Q1. What is a class?**  
A: A class is a user-defined blueprint that defines fields and methods for objects.

**Q2. What is an object?**  
A: An object is an instance of a class with its own state and behavior.

**Q3. What does `new` do?**  
A: It creates an object and allocates memory for it on the heap.

**Q4. Can we create multiple objects from one class?**  
A: Yes. Each object can have different instance state.
