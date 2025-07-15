package Practice;

import java.util.Scanner;

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
