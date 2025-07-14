import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare array with given size
        int[] numbers = new int[size];

        // Ask user to input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ask user for the number to find
        System.out.print("Enter the number to find: ");
        int target = scanner.nextInt();

        boolean found = false; // Flag to check if number is found

        // Loop through the array to search for the number
        for (int num : numbers) {
            if (num == target) {
                System.out.println("Found: " + num);
                found = true;
                break; // Exit loop once found
            }
        }

        // If not found, display message
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
