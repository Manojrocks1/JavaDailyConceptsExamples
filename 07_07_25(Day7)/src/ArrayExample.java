import java.util.Scanner; // Import the Scanner class to get user input

public class ArrayExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        System.out.print("How many scores do you want to enter? ");
        int numberOfScores = input.nextInt(); // Read the number of scores the user wants to enter

        // Declare an array to store the scores, with the size determined by user input
        int[] scores = new int[numberOfScores];

        // Loop to get each score from the user
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt(); // Read each score and store it in the array
        }

        System.out.println("\n--- Your Scores ---");
        // Loop to display all the scores entered by the user
        for (int i = 0; i < scores.length; i++)
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        

        input.close(); // Close the scanner to release system resources
    }
}