# 🧠 Java Learning – Day 5

## 📘 Topics Covered
1. **static Keyword**
2. **break Statement**

---

## 🔹 1. `static` Keyword

### 🔸 What is `static`?
The `static` keyword makes a variable or method belong to the **class** rather than to any specific object. It can be accessed **without creating an object** of the class.

### 🌍 Real-World Analogy:
Think of a **school rule** like "Wear uniform." Every student follows it — it's **common to all**.

### 🧑‍💻 Java Example:

```java
class School {
    static String schoolName = "Greenwood High";

    static void announce() {
        System.out.println("Welcome to " + schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
        School.announce(); // No object needed
    }
}
```

🧠 **Output:**
```
Welcome to Greenwood High
```

---

## 🔹 2. `break` Statement

### 🔸 What is `break`?
The `break` statement **exits the current loop or switch** early. Useful when a specific condition is met and no further checking is needed.

### 🌍 Real-World Analogy:
You are searching for a specific book on a shelf. Once found, you **stop searching** — that’s a **break**.

### 🧑‍💻 Java Example:

```java
public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            if (num == 30) {
                System.out.println("Found: " + num);
                break;
            }
        }
    }
}
```

🧠 **Output:**
```
Found: 30
```

---

## ✅ Summary Table

| Concept       | Use Case                               | Real-World Analogy                       |
|---------------|------------------------------------------|------------------------------------------|
| `static`      | Shared method or variable for all        | School rule all students follow          |
| `break`       | Exit early from loop or switch           | Stop looking when you find your book     |

---

## 📌 Practice Suggestion

- Create a class `Library` with a static variable for `libraryName`, and method `showInfo()` that prints it.
- Use a `for` loop to search for a book and `break` when found.

---
