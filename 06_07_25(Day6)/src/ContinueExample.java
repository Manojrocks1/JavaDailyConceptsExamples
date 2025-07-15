package src;

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
