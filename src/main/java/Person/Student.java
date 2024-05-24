package Person;

public class Student extends Person{
    private int studyCredits; // Declaration of private variable to store study credits

    // Constructor to initialize Student object with name, address, and study credits
    public Student(String name, String address){
        super(name, address); // Calling the constructor of the superclass (Person) with name and address
        this.studyCredits = 0; // Setting initial study credits to 0
    }

    // Method to retrieve the study credits of the student
    public int getStudyCredits(){
        return this.studyCredits; // Returning the study credits of the student
    }

    // Method to represent the Student object as a string
    @Override
    public String toString(){
        // Returning the name, address, and study credits of the student
        return super.getName() + "\r\n  " + super.getAddress() + "\r\n  " + "Study credits: " + getStudyCredits();
    }

    // Method to increment study credits of the student
    public int Study(){
        return this.studyCredits++; // Incrementing and returning the study credits of the student
    }

    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"); // Creating a new Student object
        System.out.println(ollie); // Printing details of the student
        ollie.Study(); // Incrementing study credits of the student
        System.out.println(ollie); // Printing updated details of the student
    }
}
