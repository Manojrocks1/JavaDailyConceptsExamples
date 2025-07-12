import java.util.Scanner; // Import the Scanner class to read user input

public class Scores {

    public static void showScores(Scanner inputScanner) {
        // Create a Scanner object to read input from the console (System.in)
        // Scanner inputScanner = new Scanner(System.in);

        System.out.println("--- Score Calculator ---");

        int numScores; // Declare a variable to store the number of scores the user wants to enter

        // Loop to ensure valid input for the number of scores
        while (true) {
            System.out.print("Enter the number of scores you want to input: ");
            if (inputScanner.hasNextInt()) {
                numScores = inputScanner.nextInt(); // Read the number of scores
                if (numScores > 0) { // Ensure the number of scores is positive
                    break; // Exit the loop if input is a valid positive integer
                } else {
                    System.out.println("Please enter a positive number of scores.");
                }
            } else {
                System.out.println("Invalid input! Please enter a whole number.");
                inputScanner.next(); // Consume the invalid input to prevent an infinite loop
            }
        }

        // Declare an array to store the scores, with size determined by user input
        int[] scores = new int[numScores];
        int total = 0; // Initialize total score to 0

        // Loop to prompt the user for each score and store it in the array
        for (int i = 0; i < numScores; i++) {
            while (true) { // Inner loop to validate each score input
                System.out.print("Enter score #" + (i + 1) + ": ");
                if (inputScanner.hasNextInt()) {
                    int score = inputScanner.nextInt(); // Read the score
                    scores[i] = score; // Store the score in the array
                    total += score;    // Add the score to the total
                    break; // Exit the inner loop if input is a valid integer
                } else {
                    System.out.println("Invalid input! Please enter a whole number for the score.");
                    inputScanner.next(); // Consume the invalid input
                }
            }
        }

        // Display the entered scores (optional, for verification)
        System.out.print("\nEntered Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + (i == scores.length - 1 ? "" : ", "));
        }
        System.out.println(); // New line after scores

        // Calculate and print the average
        // Ensure integer division doesn't truncate the result for average,
        // by casting total to a double before division.
        double average = (double) total / scores.length;
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + String.format("%.2f", average)); // Format to 2 decimal places
    }
}