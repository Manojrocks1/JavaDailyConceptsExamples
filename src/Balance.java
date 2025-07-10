class BankAccount {
    String holderName;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        holderName = name;
        balance = initialBalance;
    }

    void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}