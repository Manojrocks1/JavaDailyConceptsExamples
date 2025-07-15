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
