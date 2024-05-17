package Herds;

// Organism class representing a movable object
public class Organism implements Movable {

    // Private instance variables to store the coordinates of the organism
    private int x;
    private int y;

    // Constructor to initialize the organism with specified coordinates
    public Organism(int x, int y){
        this.x = x; // Initialize the x-coordinate
        this.y = y; // Initialize the y-coordinate
    }

    // Override the toString method to provide a string representation of the organism's coordinates
    public String toString(){
        return "x: " + this.x + "; " + "y: " + this.y; // Return the coordinates as a string
    }

    // Override the move method to move the organism by the specified amount in the x and y directions
    public void move(int dx, int dy){
        this.x += dx; // Move the organism in the x direction by dx
        this.y += dy; // Move the organism in the y direction by dy
    }

    // Main method for testing the Organism class
    public static void main(String[] args){
        Organism organism = new Organism(20, 30); // Create an organism object with initial coordinates
        System.out.println(organism); // Print the initial coordinates of the organism
        organism.move(-10, 5); // Move the organism
        System.out.println(organism); // Print the new coordinates of the organism after moving
        organism.move(50, 20); // Move the organism again
        System.out.println(organism); // Print the new coordinates of the organism after the second move
    }
}
