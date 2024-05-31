package Warehousing;

// ProductWarehouse class representing a storage facility for a specific product
public class ProductWarehouse extends Warehouse {
    // Private instance variable to store the name of the product
    private String productName;

    // Constructor to initialize the product warehouse with a product name and initial amount
    public ProductWarehouse(String productName, double amount){
        super(amount); // Call superclass constructor to initialize capacity
        this.productName = productName; // Initialize product name
    }

    // Method to get the name of the product
    public String getName(){
        return this.productName;
    }

    // Method to set the name of the product
    public void setName(String newName){
        this.productName = newName;
    }

    // Method to generate a string representation of the product warehouse
    @Override
    public String toString(){
        // Concatenate product name, balance, and space left
        return getName() + "\r" + getName() + ": balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }

    // Main method for testing the ProductWarehouse class
    public static void main(String[] args) {
        // Create a ProductWarehouse instance for juice with an initial amount of 1000.0
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // Add 1000.0 units of juice to the warehouse
        juice.addToWarehouse(1000.0);
        // Take 11.3 units of juice from the warehouse
        juice.takeFromWarehouse(11.3);
        // Output the name of the product (Juice)
        System.out.println(juice.getName()); // Juice
        // Output the string representation of the product warehouse
        System.out.println(juice);           // balance = 988.7, space left 11.3
    }
}
