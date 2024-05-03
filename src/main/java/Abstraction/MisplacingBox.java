package Abstraction;

// Import ArrayList class from java.util package
import java.util.ArrayList;

// MisplacingBox class representing a box where items are always added but cannot be found
public class MisplacingBox extends Box {
    // Private instance variable to store the items added to the box
    private ArrayList<Item> items;

    // Constructor to initialize the MisplacingBox with an empty ArrayList for items
    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    // Override the add method to add an item to the box
    @Override
    public void add(Item item) {
        items.add(item); // Add the item to the box regardless of its presence
    }

    // Override the isInBox method to always return false (items cannot be found)
    @Override
    public boolean isInBox(Item item) {
        return false; // Items cannot be found in the MisplacingBox
    }

    // Main method for testing the MisplacingBox class
    public static void main(String[] args) {
        // Create a MisplacingBox object
        MisplacingBox box = new MisplacingBox();
        // Add items to the box
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        // Check if specific items are in the box and print the result (always false)
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
