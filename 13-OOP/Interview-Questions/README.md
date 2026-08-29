# OOP Interview Questions & Answers

Use this section after studying all OOP topics. Try answering first, then reveal/check the answer.

## Frequently Asked

### 1. What are the four pillars of OOP?
**Answer:** Encapsulation, Inheritance, Polymorphism and Abstraction.

### 2. Class vs Object?
**Answer:** A class is a blueprint/type definition; an object is an instance with its own state.

### 3. Constructor vs method?
**Answer:** A constructor initializes a newly created object and has no return type; a method defines behavior and is invoked as a method call.

### 4. What is `this`?
**Answer:** A reference to the current object.

### 5. Why is `main()` static?
**Answer:** The JVM can start the program by invoking it without creating an object first.

### 6. What is encapsulation?
**Answer:** Keeping state and related operations together while controlling access to the state.

### 7. What is inheritance?
**Answer:** A child class extends a parent class and can reuse/extend accessible behavior.

### 8. Why doesn't Java support multiple inheritance of classes?
**Answer:** Java avoids ambiguity associated with multiple class inheritance, including diamond-style conflicts.

### 9. Overloading vs overriding?
**Answer:** Overloading uses different parameter lists and is resolved at compile time; overriding provides a child implementation for an inherited instance method and participates in runtime dispatch.

### 10. What is runtime polymorphism?
**Answer:** Dynamic dispatch of an overridden instance method based on the runtime object.

### 11. Can a static method be overridden?
**Answer:** No. Static methods are hidden, not overridden.

### 12. Can private methods be overridden?
**Answer:** No. Private methods are not inherited by subclasses as overridable methods.

### 13. Can an abstract class have a constructor?
**Answer:** Yes.

### 14. Can we instantiate an abstract class or interface directly?
**Answer:** No.

### 15. Can a class implement multiple interfaces?
**Answer:** Yes.

### 16. Abstract class vs interface?
**Answer:** An abstract class can provide shared state, constructors and implementation; an interface primarily defines a contract and supports multiple implementation by a class.

### 17. What is `final`?
**Answer:** Depending on usage, it prevents reassignment of a variable/reference, overriding of a method, or extension of a class.

### 18. What is IS-A?
**Answer:** An inheritance/subtype relationship, such as Dog IS-A Animal.

### 19. What is HAS-A?
**Answer:** A relationship where one object contains or uses another, commonly represented with composition or aggregation.

### 20. Composition vs inheritance?
**Answer:** Composition combines objects and is often more flexible; inheritance should represent a genuine subtype relationship.

## Scenario Questions

### Q21. You need `Car` and `Bike` to provide different `start()` behavior. What would you use?
**Answer:** A common abstraction such as an interface or abstract class, then override `start()` in each implementation.

### Q22. You need to prevent users from setting a bank balance to a negative value. What OOP concept helps?
**Answer:** Encapsulation: keep `balance` private and expose controlled operations such as `deposit()` and `withdraw()` with validation.

### Q23. You need a class to be both `Flyable` and `Swimmable`. How?
**Answer:** Implement both interfaces.

### Q24. A method has `add(int,int)` and `add(int,int,int)`. What is this?
**Answer:** Method overloading / compile-time polymorphism.

### Q25. `Animal a = new Dog(); a.sound();` calls Dog's implementation. Why?
**Answer:** `sound()` is an overridden instance method, so runtime dynamic dispatch selects the implementation belonging to the actual `Dog` object.

## Practice Before Interview
1. Explain all four OOP pillars without memorized definitions.
2. Write one example each for IS-A and HAS-A.
3. Create an overloaded `Calculator`.
4. Create an `Animal` parent and two child classes with overridden methods.
5. Create two interfaces and one class implementing both.
6. Design a small `BankAccount` using encapsulation.
