package InterfaceInABox;

// Book class represents a book that implements the Packable interface
public class Book implements Packable {
    // Instance variables to store the author, book name, and weight of the book
    String author;
    String bookName;
    double bookWeight;

    // Constructor to initialize the Book object with author, book name, and weight
    public Book(String author, String bookName, double bookWeight) {
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    // Override the weight() method defined in the Packable interface
    @Override
    public double weight() {
        return this.bookWeight; // Return the weight of the book
    }

    // Override the toString() method to provide a string representation of the Book object
    @Override
    public String toString() {
        return this.author + ": " + this.bookName; // Return the author and book name
    }
}
