package Warehousing;

// Warehouse class representing a storage facility
public class Warehouse {
    // Private instance variables to store capacity and used space
    private double capacity;
    private double usedSpace;

    // Constructor to initialize the warehouse with a given capacity
    public Warehouse(double capacity) {
        // Ensure capacity is non-negative
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be non-negative");
        }
        // Initialize capacity and used space
        this.capacity = capacity;
        this.usedSpace = 0;
    }

    // Method to get the current used space
    public double getBalance() {
        return this.usedSpace;
    }

    // Method to get the total capacity of the warehouse
    public double getCapacity() {
        return this.capacity;
    }

    // Method to calculate how much space is left in the warehouse
    public double howMuchSpaceLeft() {
        return getCapacity() - getBalance();
    }

    // Method to add items to the warehouse
    public void addToWarehouse(double amount) {
        // Ensure amount to add is non-negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to add must be non-negative");
        }
        // Update used space, but not exceeding the capacity
        this.usedSpace = Math.min(this.usedSpace + amount, this.capacity);
    }

    // Method to take items from the warehouse
    public double takeFromWarehouse(double amount) {
        // Ensure amount to take is non-negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to take must be non-negative");
        }
        // Calculate the amount to take, limited by the available items
        double amountTaken = Math.min(amount, this.usedSpace);
        // Update used space
        this.usedSpace -= amountTaken;
        // Return the amount taken
        return amountTaken;
    }

    // Method to generate a string representation of the warehouse
    @Override
    public String toString() {
        return "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
