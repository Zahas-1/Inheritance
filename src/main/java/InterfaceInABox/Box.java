package InterfaceInABox;

import java.util.ArrayList;

// Box class represents a container that implements the Packable interface
public class Box implements Packable {
    // Instance variables to store items in the box and its capacity
    private ArrayList<Packable> items;
    private double capacity;

    // Constructor to initialize the box with a given capacity
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    // Method to add a packable item to the box
    public void add(Packable item) {
        // Check if the weight of the item does not exceed the remaining capacity of the box
        if (item.weight() <= capacity) {
            // Add the item to the box and update the remaining capacity
            this.items.add(item);
            capacity -= item.weight();
        }
    }

    // Override the toString() method to provide a string representation of the box
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }

    // Override the weight() method defined in the Packable interface
    @Override
    public double weight() {
        double weight = 0;
        // Calculate the total weight of all items in the box
        for (Packable pack : items) {
            weight += pack.weight();
        }
        return weight;
    }

    // Main method to demonstrate the usage of the Box class
    public static void main(String[] args) {
        // Create instances of Box, Book, and CD objects
        Box box = new Box(10);
        Box box2 = new Box(5);
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        box.add(box2);
        box2.add(new Book("ts", "ts", 2.00));
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        // Print information about the box
        System.out.println(box);
    }
}
