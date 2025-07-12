# 🧠 Java Learning – Day 3

## 📘 Topics Covered
1. **Switch Statement**
2. **Arrays**

---

## 🔹 1. Switch Statement

### 🔸 What is a Switch Statement?
A `switch` statement allows multi-way branching based on the value of an expression. It's cleaner and more efficient than multiple `if-else` conditions.

### 🌍 Real-World Analogy:
Think of a vending machine: press 1 for coffee, 2 for tea, 3 for juice — each choice leads to a different result.

### 🧑‍💻 Java Example:

```java
public class Menu {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1: System.out.println("Coffee"); break;
            case 2: System.out.println("Tea"); break;
            case 3: System.out.println("Juice"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
```

🧠 **Output:**
```
Tea
```

---

## 🔹 2. Arrays

### 🔸 What is an Array?
An array is a data structure that stores multiple values of the same type in a single variable, accessed using an index.

### 🌍 Real-World Analogy:
A row of lockers — each locker (index) stores a different item (value).

### 🧑‍💻 Java Example:

```java
public class Scores {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92};

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        System.out.println("Average: " + total / scores.length);
    }
}
```

🧠 **Output:**
```
Average: 86
```

---

## ✅ Summary Table

| Concept          | Use Case                        | Real-World Analogy                  |
|------------------|----------------------------------|-------------------------------------|
| Switch Statement | Cleaner alternative to if-else   | Vending machine selection           |
| Arrays           | Store multiple similar values    | Row of lockers or item containers   |

---

## 📌 Practice Suggestion
- Use a switch statement to create a basic calculator (add, subtract, multiply, divide).
- Store student marks in an array and find the highest mark.

---
