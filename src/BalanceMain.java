import java.util.Scanner;

public class BalanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine(); // Read the full line for name

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble(); // Read the double for balance

        // Consume the leftover newline character after reading the double
        // This is important if you were to read another line of text afterwards.
        scanner.nextLine(); 

        BankAccount acc1 = new BankAccount(name, initialBalance); // Create BankAccount object with user input
        acc1.display(); // Display the account details

        scanner.close(); // Close the scanner to release resources
    }
}
