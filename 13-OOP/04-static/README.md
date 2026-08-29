# 04 - `static`

`static` members belong to the **class**, not to individual objects.

```java
class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Student a = new Student("A");
        Student b = new Student("B");
        System.out.println(Student.college);
    }
}
```

Both objects share the same `college` value.

## Static can be used with
- Variables
- Methods
- Initialization blocks
- Nested classes

## Important
A static method cannot directly access instance fields because no particular object is guaranteed.

## Interview
**Q: Why is `main` static?** JVM can invoke it without creating an object of the class.

**Q: Can a static method be overridden?** No. Static methods are hidden, not overridden.
