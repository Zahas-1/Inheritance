package Herds;

// Import ArrayList and List classes from java.util package
import java.util.ArrayList;
import java.util.List;

// Herd class representing a collection of movable organisms
public class Herd implements Movable {

    // Private instance variables to store the list of organisms and the coordinates of the herd
    private List<Movable> organism;
    private int x;
    private int y;

    // Constructor to initialize the herd with an empty list of organisms
    public Herd(){
        this.organism = new ArrayList<>(); // Initialize the list of organisms
    }

    // Method to add a movable object to the herd
    public void addToHerd(Movable movable){
        this.organism.add(movable); // Add the movable object to the list of organisms
    }

    // Override the toString method to provide a string representation of the herd
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(); // Create a StringBuilder object to build the string representation
        for (Movable item : organism){ // Iterate through the list of organisms
            sb.append(item); // Append the string representation of each organism to the StringBuilder
            sb.append("\r\n"); // Add a newline character to separate each organism
        }
        return sb.toString(); // Return the string representation of the herd
    }

    // Override the move method to move the entire herd by the specified amount in the x and y directions
    @Override
    public void move(int dx, int dy){
        for(Movable organism : this.organism){ // Iterate through the list of organisms
            organism.move(dx, dy); // Move each organism in the herd by the specified amount
        }
    }

    // Main method for testing the Herd class
    public static void main(String[] args) {
        Herd herd = new Herd(); // Create a new herd object
        // Add organisms to the herd
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd); // Print the string representation of the herd
    }
}
