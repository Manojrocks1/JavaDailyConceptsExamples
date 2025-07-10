# 🧠 Java Learning – Day 1

## 📘 Topics Covered
1. **Constructors**
2. **For Loop**

---

## 🔹 1. Constructors

### 🔸 What is a Constructor?
A constructor is a special method in a class that is automatically called when an object is created. Its main purpose is to **initialize** the object with default or user-defined values.

### 🌍 Real-World Analogy:
Think of opening a **bank account**:
- You provide your name and initial balance when creating it.
- This setup is like a constructor assigning initial values to an object.

### 🧑‍💻 Java Example:

```java
class BankAccount {
    String holderName;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        holderName = name;
        balance = initialBalance;
    }

    void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Manoj", 10000);
        acc1.display();
    }
}
```

🧠 **Output:**
```
Account Holder: Manoj
Balance: ₹10000.0
```

---

## 🔹 2. For Loop

### 🔸 What is a For Loop?
A `for` loop allows you to **repeat a block of code** a fixed number of times. It is ideal when the number of iterations is known.

### 🌍 Real-World Analogy:
Imagine a theatre with 5 seats:
- You want to label each seat as "available".
- Instead of writing the same print statement 5 times, you use a loop.

### 🧑‍💻 Java Example:

```java
public class SeatPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Seat " + i + " is available.");
        }
    }
}
```

🧠 **Output:**
```
Seat 1 is available.
Seat 2 is available.
Seat 3 is available.
Seat 4 is available.
Seat 5 is available.
```

---

## ✅ Summary Table

| Concept      | Use Case                                | Real-World Analogy                    |
|--------------|------------------------------------------|---------------------------------------|
| Constructor  | Initialize object state                  | Opening a bank account                |
| For Loop     | Repeating a block of code                | Labeling theater seats as "available" |

---

## 📌 Practice Suggestion:
- Create a `Student` class with a constructor that takes name & roll number.
- Use a `for` loop to input marks for 5 subjects and calculate average.
