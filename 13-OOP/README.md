# 13 - Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming approach where we design a program using **classes and objects**. An object combines **state (data)** and **behavior (methods)**.

## Core Idea
- **Class:** Blueprint/template used to create objects.
- **Object:** An instance of a class.
- **State:** Data represented by fields/variables.
- **Behavior:** Actions represented by methods.

## Learning Order
1. Class & Object
2. Constructor
3. `this` keyword
4. `static`
5. Encapsulation
6. Inheritance
7. Method Overloading
8. Method Overriding
9. Polymorphism
10. Abstraction
11. Abstract Class
12. Interface
13. Multiple Inheritance using Interfaces
14. `final` keyword
15. Association, Aggregation & Composition

## Four Main Pillars
- **Encapsulation:** Bundle data and methods together and control access to the object's internal state.
- **Inheritance:** Create a new class from an existing class to reuse or extend behavior.
- **Polymorphism:** The same method call/reference can produce different behavior depending on the actual object.
- **Abstraction:** Expose essential behavior while hiding unnecessary implementation details.

## Important Relationships
- **IS-A:** Inheritance relationship. Example: `Dog IS-A Animal`.
- **HAS-A:** Object contains or uses another object. Example: `Car HAS-A Engine`.
- **Association:** General relationship between objects.
- **Aggregation:** Weak whole-part relationship where the contained object can exist independently.
- **Composition:** Strong whole-part relationship where the owner manages the contained object's lifecycle.

## Static vs Instance
- **Instance members:** Belong to individual objects.
- **Static members:** Belong to the class and are shared at the class level.

## Overloading vs Overriding
- **Overloading:** Same method name with different parameter lists; usually resolved at compile time.
- **Overriding:** Child class provides a new implementation of an inherited instance method; method selection is based on the runtime object.

## How to Study
1. Read the topic README.
2. Run the example.
3. Understand the output line by line.
4. Modify the example yourself.
5. Create one real-world example.
6. Solve the practice and interview questions without looking at the solution.

## Important Rule
OOP is not about memorizing definitions. Always ask:

**What object am I modeling? What data belongs to it? What behavior belongs to it? What relationship does it have with other objects?**

## Trainer Checklist
- Explain every concept with a real-world example.
- Draw the class/object relationship before coding when useful.
- Distinguish compile-time and runtime concepts clearly.
- Demonstrate inheritance and polymorphism with small examples.
- Keep code comments focused on important logic rather than commenting every line.
