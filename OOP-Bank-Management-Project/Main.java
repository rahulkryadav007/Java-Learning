public class Main {
    public static void main(String[] args) {

        // Class + Object + Runtime Polymorphism:
        // Parent reference points to child object.
        BankAccount account1 = new SavingsAccount("Rahul", 10000);

        System.out.println("===== ACCOUNT DETAILS =====");
        account1.displayBalance();

        System.out.println("\n===== DEPOSIT =====");
        account1.deposit(2000);

        System.out.println("\n===== WITHDRAW =====");
        account1.withdraw(1500);

        System.out.println("\n===== FINAL BALANCE =====");
        account1.displayBalance();

        System.out.println("\n===== RUNTIME POLYMORPHISM =====");
        account1.calculateInterest();

        System.out.println("\n===== METHOD OVERLOADING =====");
        SavingsAccount account2 = new SavingsAccount("Amit", 5000);
        account2.deposit(1000);
        account2.deposit(2000, "UPI");
        account2.displayBalance();

        System.out.println("\n===== 4 PILLARS =====");
        System.out.println("1. Encapsulation  -> private data + controlled methods");
        System.out.println("2. Inheritance    -> SavingsAccount extends BankAccount");
        System.out.println("3. Polymorphism   -> overloading + overriding");
        System.out.println("4. Abstraction    -> abstract class + abstract method");
    }
}
