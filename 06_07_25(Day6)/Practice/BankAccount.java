package Practice;

import java.util.Scanner; // Import the Scanner class to read user input

public class BankAccount {

    private final String bankName;
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    /**
     * Constructor for the BankAccount class.
     * Initializes the bankName (which is final), account number, account holder name, and initial balance.
     *
     * @param bankName The name of the bank (this will be final).
     * @param accountNumber The unique account number.
     * @param accountHolderName The name of the account holder.
     * @param initialBalance The initial balance of the account.
     */
    public BankAccount(String bankName, String accountNumber, String accountHolderName, double initialBalance) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    /**
     * Displays the information about the bank account.
     * This method prints the bank name, account number, account holder name, and current balance to the console.
     */
    public void showInfo() {
        System.out.println("\n--- Bank Account Information ---");
        System.out.println("Bank Name: " + bankName); // Accessing the final bankName
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance)); // Format balance to 2 decimal places
        System.out.println("--------------------------------\n");
    }

    /**
     * Returns the account number.
     * @return The account number.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number.
     * @param accountNumber The new account number.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the account holder's name.
     * @return The account holder's name.
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the account holder's name.
     * @param accountHolderName The new account holder's name.
     */
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    /**
     * Returns the current balance.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits an amount into the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + String.format("%.2f", amount) + ". New balance: $" + String.format("%.2f", this.balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws an amount from the account.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew: $" + String.format("%.2f", amount) + ". New balance: $" + String.format("%.2f", this.balance));
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Creation System!");

        // Get bank name from user
        System.out.print("Enter Bank Name: ");
        String bankName = scanner.nextLine();

        // Get account number from user
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        // Get account holder name from user
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        // Get initial balance from user
        double initialBalance = 0.0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter Initial Balance: $");
            if (scanner.hasNextDouble()) {
                initialBalance = scanner.nextDouble();
                if (initialBalance >= 0) { // Ensure initial balance is non-negative
                    validInput = true;
                } else {
                    System.out.println("Initial balance cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value for the balance.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.nextLine(); // Consume the remaining newline character after reading double

        // Create a BankAccount object with user-provided details
        BankAccount myAccount = new BankAccount(bankName, accountNumber, accountHolderName, initialBalance);

        int choice;
        do {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Show Account Information");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Validate choice input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
                case 1:
                    myAccount.showInfo();
                    break;
                case 2:
                    double depositAmount = 0.0;
                    validInput = false;
                    while (!validInput) {
                        System.out.print("Enter amount to deposit: $");
                        if (scanner.hasNextDouble()) {
                            depositAmount = scanner.nextDouble();
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please enter a numeric value.");
                            scanner.next(); // Consume the invalid input
                        }
                    }
                    scanner.nextLine(); // Consume the remaining newline
                    myAccount.deposit(depositAmount);
                    break;
                case 3:
                    double withdrawAmount = 0.0;
                    validInput = false;
                    while (!validInput) {
                        System.out.print("Enter amount to withdraw: $");
                        if (scanner.hasNextDouble()) {
                            withdrawAmount = scanner.nextDouble();
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please enter a numeric value.");
                            scanner.next(); // Consume the invalid input
                        }
                    }
                    scanner.nextLine(); // Consume the remaining newline
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting Bank Account application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
