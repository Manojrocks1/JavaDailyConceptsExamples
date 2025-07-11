# 🧠 Java Learning – Day 2

## 📘 Topics Covered
1. **Method Overloading**
2. **While Loop**

---

## 🔹 1. Method Overloading

### 🔸 What is Method Overloading?
Method overloading means having **multiple methods with the same name** in a class, but with **different parameter lists** (type, number, or both). It improves code readability and reusability.

### 🌍 Real-World Analogy:
A smartphone’s camera button behaves differently:
- **Click once** → takes a photo
- **Hold** → records video
- **Double tap** → switches camera

Same action (method name), different behavior depending on input (parameters).

### 🧑‍💻 Java Example:

```java
class Printer {
    void print(String msg) {
        System.out.println("Message: " + msg);
    }

    void print(int number) {
        System.out.println("Number: " + number);
    }

    void print(String msg, int count) {
        System.out.println("Repeated Message:");
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");
        p.print(100);
        p.print("Repeat", 3);
    }
}
```

🧠 **Output:**
```
Message: Hello
Number: 100
Repeated Message:
Repeat
Repeat
Repeat
```

---

## 🔹 2. While Loop

### 🔸 What is a While Loop?
A `while` loop continues to execute a block of code **as long as the condition is true**. It checks the condition **before** each iteration.

### 🌍 Real-World Analogy:
While your phone’s battery is low, keep charging.
> "While it's raining, stay inside."

### 🧑‍💻 Java Example:

```java
public class Countdown {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            System.out.println("Countdown: " + i);
            i--;
        }
    }
}
```

🧠 **Output:**
```
Countdown: 5
Countdown: 4
Countdown: 3
Countdown: 2
Countdown: 1
```

---

## ✅ Summary Table

| Concept            | Use Case                        | Real-World Analogy                         |
|--------------------|----------------------------------|--------------------------------------------|
| Method Overloading | Reuse same method name           | One button = many camera actions           |
| While Loop         | Repeat while a condition is true | Charging a phone while battery is low      |

---

## 📌 Practice Suggestion
- Create a `Calculator` class with overloaded `add()` methods for:
  - `add(int, int)`
  - `add(double, double)`
  - `add(String, String)`
- Use a `while` loop to keep taking inputs until the user types `"exit"`.

---
