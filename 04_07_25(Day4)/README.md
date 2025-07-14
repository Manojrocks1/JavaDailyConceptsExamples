# 🧠 Java Learning – Day 4

## 📘 Topics Covered
1. **this Keyword**
2. **do-while Loop**

---

## 🔹 1. `this` Keyword

### 🔸 What is `this`?
The `this` keyword refers to the **current object** inside a class. It's especially useful when method parameters or constructors have the **same variable names** as instance variables.

### 🌍 Real-World Analogy:
Imagine you're in a classroom full of people with the same name. You say **"this Manoj"** to clarify you mean yourself — the same way `this` tells Java which variable belongs to the current object.

### 🧑‍💻 Java Example:

```java
class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;  // 'this' distinguishes the instance variable from the parameter
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Manoj");
        s.display();
    }
}
```

🧠 **Output:**
```
Student name: Manoj
```

---

## 🔹 2. `do-while` Loop

### 🔸 What is a `do-while` Loop?
The `do-while` loop is similar to a `while` loop, **except it always runs at least once**, even if the condition is false.

### 🌍 Real-World Analogy:
You try a dish **at least once**, even if you don’t know you’ll like it. That’s like a `do-while` loop — it runs the block first, checks the condition after.

### 🧑‍💻 Java Example:

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Attempt " + i);
            i++;
        } while (i <= 3);
    }
}
```

🧠 **Output:**
```
Attempt 1
Attempt 2
Attempt 3
```

---

## ✅ Summary Table

| Concept         | Use Case                                  | Real-Life Analogy                        |
|-----------------|---------------------------------------------|-------------------------------------------|
| `this` keyword  | Access current object’s variables/methods   | Saying “this Manoj” in a classroom        |
| `do-while` loop | Run block at least once before checking     | Tasting food before judging it            |

---

## 📌 Practice Suggestion
- Create a `Book` class with a constructor using `this` to assign title and author.
- Use a `do-while` loop to print a message like "Reading..." 3 times.

---
