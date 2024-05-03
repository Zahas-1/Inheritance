package Abstraction;

// Import ArrayList class from java.util package
import java.util.ArrayList;

// BoxWithMaxWeight class representing a box with a maximum weight capacity
public class BoxWithMaxWeight extends Box {
    // Private instance variables to store the maximum weight capacity and items in the box
    private int capacity;
    private ArrayList<Item> items;

    // Constructor to initialize the box with a maximum weight capacity
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity; // Initialize the maximum weight capacity
        this.items = new ArrayList<>(); // Initialize an empty ArrayList for items
    }

    // Override the add method to add an item to the box if there is enough capacity
    @Override
    public void add(Item item) {
        if (item.getWeight() <= this.capacity) { // Check if the item's weight is less than or equal to the remaining capacity
            this.capacity -= item.getWeight(); // Decrease the remaining capacity by the item's weight
            items.add(item); // Add the item to the box
        }
    }

    // Override the isInBox method to check if an item is in the box
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item); // Check if the item is in the list of items
    }

    // Main method for testing the BoxWithMaxWeight class
    public static void main(String[] args) {
        // Create a BoxWithMaxWeight object with a capacity of 10
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        // Add items to the box
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        // Check if specific items are in the box and print the result
        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
    }
}
