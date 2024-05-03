package InterfaceInABox;

// CD class represents a compact disc that implements the Packable interface
public class CD implements Packable {
    // Instance variables to store the artist, CD name, and publication year of the CD
    String artist;
    String CDName;
    int pubYear;

    // Constructor to initialize the CD object with artist, CD name, and publication year
    public CD(String artist, String CDName, int pubYear) {
        this.artist = artist;
        this.CDName = CDName;
        this.pubYear = pubYear;
    }

    // Override the weight() method defined in the Packable interface
    @Override
    public double weight() {
        return 0.1; // CDs are assumed to have a standard weight of 0.1 units
    }

    // Override the toString() method to provide a string representation of the CD object
    @Override
    public String toString() {
        return this.artist + ": " + this.CDName + " (" + this.pubYear + ")"; // Return artist, CD name, and publication year
    }

    // Main method to demonstrate the usage of Book and CD objects
    public static void main(String[] args) {
        // Create instances of Book and CD objects
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        // Print information about the books and CDs
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
