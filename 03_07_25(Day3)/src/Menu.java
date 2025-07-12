import java.util.Scanner; // Import the Scanner class to read user input

public class Menu {

    public static void showMenu(Scanner inputScanner) {
        // Declare a Scanner object to read input from the console (System.in)
        // Scanner inputScanner = new Scanner(System.in);

        // Display the menu options to the user
        System.out.println("--- Welcome to Our Cafe Menu ---");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Juice");
        System.out.println("4. Soft Drink");
        System.out.print("Enter your choice (1-4): "); // Prompt the user for input
        int choice;
        // Check if the next input token is an integer
        if (inputScanner.hasNextInt()) {
            choice = inputScanner.nextInt(); // Read the integer input from the user
        } else {
            // If the input is not an integer, handle it as an invalid choice
            System.out.println("Invalid input! Please enter a number.");
            inputScanner.next(); // Consume the invalid input to prevent an infinite loop
            // We could loop here to ask again, but for this example, we'll just exit
            // or let the switch's default case handle it if choice is initialized to 0 or similar.
            choice = 0; // Assign a value that will fall into the default case
        }


        // Use a switch statement to perform actions based on the user's choice
        switch (choice) {
            case 1:
                System.out.println("You chose Coffee. Enjoy your brew!");
                break; // Exit the switch statement after this case is executed
            case 2:
                System.out.println("You chose Tea. A refreshing choice!");
                break;
            case 3:
                System.out.println("You chose Juice. Get your vitamins!");
                break;
            case 4:
                System.out.println("You chose Soft Drink. Quench your thirst!");
                break;
            default: // This case is executed if 'choice' does not match any of the above cases
                System.out.println("Invalid choice. Please select a number from 1 to 4.");
                break;
        }
    }
}