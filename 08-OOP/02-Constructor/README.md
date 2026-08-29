# 02 - Constructor

A **constructor** initializes an object when it is created.

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 24);
        System.out.println(s.name + " " + s.age);
    }
}
```

## Rules
- Constructor name must match the class name.
- It has no return type, not even `void`.
- It runs when `new` creates an object.
- Constructors can be overloaded.
- If you write no constructor, Java provides a default no-argument constructor (subject to the normal constructor rules).

## Types
- No-argument constructor
- Parameterized constructor
- Constructor overloading

## Interview
**Q: Constructor vs method?** Constructor initializes an object and has no return type; a method represents behavior and has a return type or `void`.

**Q: Can a constructor be inherited?** No.

**Q: Can a constructor be `static`, `final`, or `abstract`?** No.
