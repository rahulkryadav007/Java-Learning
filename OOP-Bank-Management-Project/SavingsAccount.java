class SavingsAccount extends BankAccount implements Transaction {

    SavingsAccount(String name, double balance) {
        super(name, balance); // calls parent constructor
    }

    @Override
    void calculateInterest() {
        System.out.println("Savings Account Interest = 5%");
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
