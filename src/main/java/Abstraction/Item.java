package Abstraction;

// Import Objects class from java.util package
import java.util.Objects;

// Item class representing an item with a name and weight
public class Item {

    // Private instance variables to store the name and weight of the item
    private String name;
    private int weight;

    // Constructor to initialize the item with a name and weight
    public Item(String name, int weight) {
        this.name = name; // Initialize the name
        this.weight = weight; // Initialize the weight
    }

    // Constructor to initialize the item with only a name (weight defaults to 0)
    public Item(String name) {
        this(name, 0); // Call the other constructor with default weight
    }

    // Getter method to retrieve the name of the item
    public String getName() {
        return name;
    }

    // Getter method to retrieve the weight of the item
    public int getWeight() {
        return weight;
    }

    // Override the equals method to compare two items based on their names
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check if the objects are the same reference
        if (o == null || getClass() != o.getClass()) return false; // Check if the classes are the same
        Item item = (Item) o; // Cast the object to an Item
        return Objects.equals(getName(), item.getName()); // Compare names for equality
    }

    // Override the hashCode method to generate a hash code based on the item's name
    @Override
    public int hashCode() {
        return Objects.hash(getName()); // Generate hash code based on the name
    }
}
