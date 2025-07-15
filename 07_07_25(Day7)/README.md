# 🧠 Java Learning – Day 7

## 📘 Topics Covered
1. **Array**
2. **Enhanced for loop (for-each)**

---

## 🔹 1. Array

### 🔸 What is an Array?
An array is a **collection of elements** of the same type stored together in memory. It helps to manage multiple values efficiently.

### 🌍 Real-World Analogy:
A **train** with identical coaches (like compartments for passengers or goods), organized in a sequence.

### 🧑‍💻 Java Example:

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78, 92};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }
    }
}
```

🧠 **Output:**
```
Score 1: 90
Score 2: 85
Score 3: 78
Score 4: 92
```

---

## 🔹 2. Enhanced for loop (for-each)

### 🔸 What is it?
It is a simplified loop to traverse arrays or collections. It removes the need for an index counter.

### 🌍 Real-World Analogy:
Like passing around a box of chocolates — everyone takes one, in order, without counting.

### 🧑‍💻 Java Example:

```java
public class ForEachExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango"};

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
```

🧠 **Output:**
```
Fruit: Apple
Fruit: Banana
Fruit: Mango
```

---

## ✅ Summary Table

| Concept            | Use Case                    | Real-Life Analogy              |
|--------------------|-----------------------------|-------------------------------|
| Array              | Store multiple values        | Coaches in a train            |
| Enhanced for loop  | Loop through collections     | Passing chocolates in a group |

---

## 📌 Practice Suggestion

- Create an array of 5 city names.
- Print them using a regular for loop and then using a for-each loop.

---
1)Create an array of 5 city names with Scanner class?

Code(Example):
  import java.util.Scanner; // Import the Scanner class to get user input

public class CityArrayWithScanner {
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

🧠 **Output:**
```
Please enter 5 city names:
Enter city name 1: Guntur
Enter city name 2: Vizag
Enter city name 3: Hyderabad
Enter city name 4: Mumbai
Enter city name 5: Solapur

--- Your Entered City Names ---
City: Guntur
City: Vizag
City: Hyderabad
City: Mumbai
City: Solapur
```