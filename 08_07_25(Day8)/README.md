# 🧠 Java Learning – Day 8

## 📘 Topics Covered
1. **Constructor**
2. **this Keyword**

---

## 🔹 1. Constructor

### 🔸 What is a Constructor?
A constructor is a special method that is automatically called when an object is created. It is used to initialize objects.

- Has the same name as the class
- No return type
- Can be parameterized or default

### 🌍 Real-World Analogy:
When you buy a new mobile, it comes with default settings — constructor = initial setup.

### 🧑‍💻 Java Example:

```java
public class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
```

🧠 **Output:**
```
Anil is 21 years old.
```

---

                                           ## 🔹 2. this Keyword

### 🔸 What is `this`?
The `this` keyword refers to the **current object** of the class. Common uses:
- Refer to current class instance variables
- Call other constructors in constructor chaining

### 🌍 Real-World Analogy:
When you say "this car is mine", you mean the car you're sitting in — `this` refers to the current instance.

### 🧑‍💻 Java Example:

```java
public class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    void showBrand() {
        System.out.println("Brand: " + this.brand);
    }
}
```

🧠 **Output:**
```
Brand: Honda
```

---

## ✅ Summary Table

| Concept        | Purpose                                  | Real-Life Analogy                        |
|----------------|-------------------------------------------|-------------------------------------------|
| Constructor    | Initialize object when created            | New mobile setup                          |
| `this` keyword | Refer to current object inside class      | “This house” means the one you're in      |

---

## 📌 Practice Suggestion

1)Create a class `Book` with `title` and `author` attributes and Use a constructor 
 to assign them using `this`.

### 🧑‍💻 Java Example:

```java
package Practice;

// Define the Book class
public class Book {
    // Declare instance variables for the book's title and author
    String title;
    String author;

    /**
     * Constructor for the Book class.
     * Initializes the title and author of the book.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, String author) {
        // Use 'this' to refer to the current object's instance variables
        // and assign the values passed to the constructor.
        this.title = title;
        this.author = author;
    }

    // You can add other methods here, for example, to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    // Main method to demonstrate the Book class (optional, for testing)
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book myBook = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        // Call the method to display its information
        myBook.displayBookInfo();

        System.out.println("\nCreating another book:");
        Book anotherBook = new Book("Pride and Prejudice", "Jane Austen");
        anotherBook.displayBookInfo();
    }
}

}
```
🧠 **Output:**
```
Title: The Lord of the Rings
Author: J.R.R. Tolkien

Creating another book:
Title: Pride and Prejudice
Author: Jane Austen
```