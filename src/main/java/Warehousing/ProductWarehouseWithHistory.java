package Warehousing;

// ProductWarehouseWithHistory class representing a product warehouse with a history of changes
public class ProductWarehouseWithHistory extends ProductWarehouse {
    // Private instance variable to store the change history
    private ChangeHistory ch;

    // Constructor to initialize the product warehouse with a product name, capacity, and initial balance
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity); // Call superclass constructor to initialize the product warehouse
        this.ch = new ChangeHistory(); // Initialize the change history
        addToWarehouse(initialBalance); // Add initial balance to the warehouse and history
    }

    // Method to return the history of changes as a string
    public String history() {
        return ch.toString(); // Return the string representation of ChangeHistory
    }

    // Method to add an amount to the warehouse and update the history
    @Override
    public void addToWarehouse(double amount){
        // Check if the amount to add is non-negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to add must be non-negative");
        }
        // Call superclass method to add to the warehouse
        super.addToWarehouse(amount);
        // Add the new balance to the change history
        ch.add(getBalance());
    }

    // Method to take an amount from the warehouse and update the history
    @Override
    public double takeFromWarehouse(double amount){
        // Check if the amount to take is non-negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to take must be non-negative");
        }
        // Take from the warehouse and store the received amount
        double received = super.takeFromWarehouse(amount);
        // Add the new balance to the change history
        ch.add(getBalance());
        // Return the received amount
        return received;
    }

    // Method to print analysis of the product warehouse history
    public void printAnalysis(){
        // Output product name
        System.out.println("Product: " + getName());
        // Output history
        System.out.println("History: " + ch);
        // Output largest amount of product in the history
        System.out.println("Largest amount of product: " + ch.maxValue());
        // Output smallest amount of product in the history
        System.out.println("Smallest amount of product: " + ch.minValue());
        // Output average amount of product in the history
        System.out.println("Average: " + ch.average());
    }

    // Main method for testing the ProductWarehouseWithHistory class
    public static void main(String[] args) {
        // Create a ProductWarehouseWithHistory instance for juice with an initial amount of 1000.0
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // Take 11.3 units of juice from the warehouse
        juice.takeFromWarehouse(11.3);
        // Add 1.0 unit of juice to the warehouse
        juice.addToWarehouse(1.0);

        // Print analysis of the product warehouse history
        juice.printAnalysis();
        // Print analysis again
        juice.printAnalysis();
    }
}
