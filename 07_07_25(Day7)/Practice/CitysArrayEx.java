package Practice;

import java.util.Scanner;

public class CitysArrayEx {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Declare a String array to hold 5 city names.
        // The size is fixed at 5 as per the requirement.
        String[] cityNames = new String[5];

        System.out.println("Please enter 5 city names:");

        // Loop to get each city name from the user
        // The loop runs 5 times (from index 0 to 4)
        for (int i = 0; i < cityNames.length; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            // Read the entire line of input (allowing for city names with spaces)
            cityNames[i] = input.nextLine(); 
        }

        System.out.println("\n--- Your Entered City Names ---");
        // Use a for-each loop to display all the city names entered by the user
        // This loop iterates through each 'city' element in the 'cityNames' array
        for (String city : cityNames) {
            System.out.println("City: " + city);
        }

        input.close(); // Close the scanner to release system resources
    }
}
