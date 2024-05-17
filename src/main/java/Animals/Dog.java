package Animals;

// Dog class representing a type of animal
public class Dog extends Animal implements NoiseCapable{

    // Private instance variable to store the name of the dog
    private String name;

    // Default constructor initializing the dog with the name "Dog"
    public Dog(){
        super("Dog"); // Call the constructor of the superclass Animal with the name "Dog"
    }

    // Constructor initializing the dog with a custom name
    public Dog(String name){
        super(name); // Call the constructor of the superclass Animal with the given name
        this.name = name; // Initialize the name
    }

    // Method for the dog to bark
    public void bark(){
        System.out.println(getName() + " barks"); // Print a message indicating that the dog is barking
    }

    // Method overriding the eat behavior of the superclass
    @Override
    public void eat(){
        System.out.println(getName() + " eats"); // Print a message indicating that the dog is eating
    }

    // Method overriding the sleep behavior of the superclass
    @Override
    public void sleep(){
        System.out.println(getName() + " sleeps"); // Print a message indicating that the dog is sleeping
    }

    // Method to make noise, implementing the interface method
    public void makeNoise(){
        bark(); // Make the dog bark
    }

    // Main method for testing the Dog class
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
