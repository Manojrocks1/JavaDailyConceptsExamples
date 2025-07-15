# 🧠 Java Learning – Day 6

## 📘 Topics Covered
1. **final Keyword**
2. **continue Statement**

---

## 🔹 1. `final` Keyword

### 🔸 What is `final`?
The `final` keyword is used to **declare constants** or to **prevent changes** to variables, methods, or classes.

- A `final` variable = constant value (cannot be reassigned)
- A `final` method = cannot be overridden
- A `final` class = cannot be subclassed

### 🌍 Real-World Analogy:
Your **date of birth** is final — it doesn’t change once assigned.

### 🧑‍💻 Java Example:

```java
public class Constants {
    final int MAX_USERS = 100;

    void showLimit() {
        System.out.println("Max users allowed: " + MAX_USERS);
    }
}
```

🧠 **Output:**
```
Max users allowed: 100
```

---

## 🔹 2. `continue` Statement

### 🔸 What is `continue`?
The `continue` statement **skips the current iteration** and moves to the next 
 one in a loop.

### 🌍 Real-World Analogy:
->Imagine you’re reading 10 emails and want to skip **spam emails**. 
->When you see spam, you skip it and move to the next.

### 🧑‍💻 Java Example:

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip when i is 3
            }
            System.out.println("Value: " + i);
        }
    }
}
```

🧠 **Output:**
```
Value: 1
Value: 2
Value: 4
Value: 5
```

---

## ✅ Summary Table

| Concept         | Use Case                             | Real-Life Analogy                        |
|------------------|----------------------------------------|-------------------------------------------|
| `final`          | Prevent modification                   | Your birthdate never changes              |
| `continue`       | Skip specific iterations in a loop     | Skip spam emails, read the rest           |

---

## 📌 Practice Suggestion

- Create a class `BankAccount` with a `final` `bankName` and method `showInfo()`.
- Use a loop to print transaction IDs and `continue` if the ID is invalid.

---

### 🧑‍💻 Java Example:
1)Create a class `BankAccount` with a `final` `bankName` and method `showInfo()`.
```package Practice;

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

```
```

🧠 **Output:**
```
Welcome to the Bank Account Creation System!
Enter Bank Name: SBI
Enter Account Number: 12365789760 
Enter Account Holder Name: Golla Manoj
Enter Initial Balance: $3000

--- Bank Account Menu ---
1. Show Account Information
2. Deposit Funds
3. Withdraw Funds
4. Exit
Enter your choice: 1

--- Bank Account Information ---
Bank Name: SBI
Account Number: 12365789760
Account Holder: Golla Manoj
Current Balance: $3000.00
--------------------------------


--- Bank Account Menu ---
1. Show Account Information
2. Deposit Funds
3. Withdraw Funds
4. Exit
Enter your choice: 2
Enter amount to deposit: $2000
Deposited: $2000.00. New balance: $5000.00

--- Bank Account Menu ---
1. Show Account Information
2. Deposit Funds
3. Withdraw Funds
4. Exit
Enter your choice: 3
Enter amount to withdraw: $3000
Withdrew: $3000.00. New balance: $2000.00

--- Bank Account Menu ---
1. Show Account Information
2. Deposit Funds
3. Withdraw Funds
4. Exit
Enter your choice: 4
Exiting Bank Account application. Goodbye!

2)Use a 'continue' statement to print transaction IDs and `continue` if the ID is invalid.

### 🧑‍💻 Java Example:

```
package Practice;

public class TransactionID {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Interactive Transaction ID Processor ---");
        System.out.println("Enter transaction IDs one by one.");
        System.out.println("Type 'done' (case-insensitive) and press Enter to finish.");

        String inputId;
        // Loop indefinitely until the user types 'done'
        while (true) {
            System.out.print("Enter Transaction ID (or 'done' to finish): ");
            inputId = scanner.nextLine(); // Read the entire line of input

            // Check if the user wants to stop
            if (inputId.equalsIgnoreCase("done")) {
                break; // Exit the while loop
            }

            // --- Validation Logic for Transaction ID ---
            // Assume an invalid ID if it's empty, "INVALID_ID", starts with "TXN-", or represents "0"
            // For a more robust check, you might use regex or try-catch for number parsing
            // if you expect numeric parts in the ID.
            if (inputId.trim().isEmpty()) { // Check for empty input after trimming whitespace
                System.out.println("Invalid input: Transaction ID cannot be empty. Please try again.");
                continue; // Skip to the next iteration
            }

            if (inputId.equals("INVALID_ID") || inputId.startsWith("TXN-") || inputId.equals("0")) {
                System.out.println("Skipping invalid transaction ID: " + inputId);
                // The 'continue' statement immediately jumps to the next iteration of the loop.
                // Any code below this 'continue' within the current loop iteration will be skipped.
                continue;
            }

            // This code will only be executed if the 'continue' statement was NOT encountered
            // for the current iteration (i.e., the ID was considered valid).
            System.out.println("Processing valid transaction ID: " + inputId);
            // In a real application, you would add more processing logic here
            // for the valid transaction ID, e.g., saving to a database, performing calculations, etc.
        }

        System.out.println("\n--- Transaction Processing Complete ---");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

```
🧠 **Output:**

--- Interactive Transaction ID Processor ---
Enter transaction IDs one by one.
Type 'done' (case-insensitive) and press Enter to finish.
Enter Transaction ID (or 'done' to finish): TXN001 TXN003 TXN007
Processing valid transaction ID: TXN001 TXN003 TXN007
Enter Transaction ID (or 'done' to finish): done

--- Transaction Processing Complete ---
```