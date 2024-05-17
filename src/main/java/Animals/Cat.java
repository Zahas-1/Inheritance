package Animals;

// Cat class representing a type of animal
public class Cat extends Animal implements NoiseCapable{

    // Private instance variable to store the name of the cat
    private String name;

    // Default constructor initializing the cat with the name "Cat"
    public Cat(){
        super("Cat"); // Call the constructor of the superclass Animal with the name "Cat"
    }

    // Constructor initializing the cat with a custom name
    public Cat(String name){
        super(name); // Call the constructor of the superclass Animal with the given name
        this.name = name; // Initialize the name
    }

    // Method for the cat to purr
    public void purr(){
        System.out.println(getName() + " purrs"); // Print a message indicating that the cat is purring
    }

    // Method overriding the eat behavior of the superclass
    @Override
    public void eat(){
        System.out.println(getName() + " eats"); // Print a message indicating that the cat is eating
    }

    // Method overriding the sleep behavior of the superclass
    @Override
    public void sleep(){
        System.out.println(getName() + " sleeps"); // Print a message indicating that the cat is sleeping
    }

    // Method to make noise, implementing the interface method
    public void makeNoise(){
        purr(); // Make the cat purr
    }

    // Main method for testing the Cat class
    public static void main(String[] args) {
        // Create a NoiseCapable object representing a dog
        NoiseCapable dog = new Dog();
        dog.makeNoise(); // Make the dog make noise

        // Create a NoiseCapable object representing a cat with the name "Garfield"
        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise(); // Make the cat make noise

        // Downcast the NoiseCapable object to a Cat object
        Cat c = (Cat) cat;
        c.purr(); // Call the purr method specific to the Cat class
    }
}
