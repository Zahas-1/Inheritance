package Person;

public class Teacher extends Person {
    private int salary; // Declaration of private variable to store salary

    // Constructor to initialize Teacher object with name, address, and salary
    public Teacher(String name, String address, int salary) {
        super(name, address); // Calling the constructor of the superclass (Person) with name and address
        this.salary = salary; // Setting initial salary
    }

    // Method to retrieve the salary of the teacher
    public int getSalary() {
        return this.salary; // Returning the salary of the teacher
    }

    // Method to represent the Teacher object as a string
    @Override
    public String toString() {
        // Returning the name, address, and salary of the teacher
        return super.getName() + "\r\n  " + super.getAddress() + "\r\n  " + "salary " + getSalary() + " euro/month";
    }

    public static void main(String[] args) {
        // Creating instances of Teacher with specified details
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);

        // Printing details of teachers
        System.out.println(ada);
        System.out.println(esko);

        // Creating a Student instance
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        // Loop to simulate studying by incrementing study credits
        while (i < 25) {
            ollie.Study();
            i = i + 1;
        }
        // Printing updated details of the student
        System.out.println(ollie);
    }
}
