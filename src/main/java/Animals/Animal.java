package Animals;

// Abstract class representing an animal
public abstract class Animal implements NoiseCapable {

    // Private instance variable to store the name of the animal
    private String name;

    // Constructor to initialize the animal with a name
    public Animal(String name){
        this.name = name; // Initialize the name
    }

    // Abstract method to make noise (implemented by subclasses)
    public abstract void makeNoise();

    // Method to perform eating behavior
    public void eat(){
        System.out.println(getName() + " eats"); // Print a message indicating that the animal is eating
    }

    // Method to perform sleeping behavior
    public void sleep(){
        System.out.println(getName() + " sleeps"); // Print a message indicating that the animal is sleeping
    }

    // Getter method to retrieve the name of the animal
    public String getName(){
        return this.name; // Return the name of the animal
    }
}
