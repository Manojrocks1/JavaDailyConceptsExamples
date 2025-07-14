public class DoWhileLoop {
public static void main(String[] args) {

		// Declare and initialize an integer variable 'i' with the value 5.
		int i = 5;

		// Start of the do-while loop.
		// The code inside the 'do' block will execute at least once,
		// regardless of the condition.
		do {
			// Print the current value of 'i' to the console.
			System.out.println(i);

			// Increment the value of 'i' by 1.
			i++;
		}
		// The loop continues as long as the value of 'i' is less than or equal to 10.
		// After each iteration, the condition is checked.
		while (i <= 10);
	}
}
