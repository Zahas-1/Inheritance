package Abstraction;

// Import ArrayList class from java.util package
import java.util.ArrayList;

// OneItemBox class representing a box that can hold only one item
public class OneItemBox extends Box {
    // Private instance variable to store the item in the box
    private ArrayList<Item> items;

    // Constructor to initialize the OneItemBox with an empty ArrayList for items
    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    // Override the add method to add an item to the box if it is empty
    @Override
    public void add(Item item) {
        if (items.isEmpty()) { // Check if the box is empty
            items.add(item); // Add the item to the box
        }
    }

    // Override the isInBox method to check if a specific item is in the box
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item); // Check if the item is in the list of items
    }

    // Main method for testing the OneItemBox class
    public static void main(String[] args) {
        // Create a OneItemBox object
        OneItemBox box = new OneItemBox();
        // Add multiple items to the box (only the first one should be added)
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
        box.add(new Item("Pirdssakka", 1));
        box.add(new Item("Pirwqekka", 2));
        box.add(new Item("Pifsdrkka", 5));

        // Check if specific items are in the box and print the result
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println(box.isInBox(new Item("Pirdssakka")));
        System.out.println(box.isInBox(new Item("Pirwqekka")));
        System.out.println(box.isInBox(new Item("Pifsdrkka")));
    }
}
