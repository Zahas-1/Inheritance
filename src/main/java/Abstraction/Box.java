package Abstraction;

// Import ArrayList class from java.util package
import java.util.ArrayList;

// Abstract class Box representing a container
public abstract class Box {

    // Abstract method to add an item to the box
    public abstract void add(Item item);

    // Method to add multiple items to the box
    public void add(ArrayList<Item> items) {
        // Iterate through the list of items
        for (Item item : items) {
            Box.this.add(item); // Call the abstract add method for each item
        }
    }

    // Abstract method to check if an item is in the box
    public abstract boolean isInBox(Item item);
}
