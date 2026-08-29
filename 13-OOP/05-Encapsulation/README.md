# 05 - Encapsulation

## Easy Meaning
Encapsulation means **wrapping data and the methods that operate on that data together**, while controlling direct access to the data.

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

Because `balance` is `private`, outside code cannot change it directly. The class controls valid changes through `deposit()`.

## Why important?
- Protects data
- Adds validation
- Reduces unwanted coupling
- Makes code easier to maintain

## Common Pattern
`private fields + public methods` (getters/setters or meaningful operations).

## Interview
**Q: Is encapsulation only about private variables?** No. Private access is common, but the key idea is controlled access to an object's state.

**Q: Encapsulation vs abstraction?** Encapsulation controls access to state/implementation; abstraction focuses on exposing essential behavior while hiding unnecessary implementation details.
