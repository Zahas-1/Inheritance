package Person;

import java.util.ArrayList;

public class Person {
    private String name; // Declaration of private variable to store the person's name
    private String address; // Declaration of private variable to store the person's address

    // Constructor to initialize the Person object with name and address
    public Person(String name, String address){
        this.name = name; // Assigning name parameter to the instance variable
        this.address = address; // Assigning address parameter to the instance variable
    }

    // Method to retrieve the name of the person
    public String getName(){
        return this.name; // Returning the name of the person
    }

    // Method to retrieve the address of the person
    public String getAddress(){
        return this.address; // Returning the address of the person
    }

    // Method to represent the Person object as a string
    public String toString(){
        return getName() + "\r\n  " + getAddress(); // Returning the name and address of the person
    }

    // Method to print details of each person in the given list
    public static void printPersons(ArrayList<Person> persons){
        for(Person item : persons){ // Iterating through each person in the list
            System.out.println(item); // Printing details of the current person
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>(); // Creating a list to store Person objects

        // Adding instances of Teacher and Student to the list
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons); // Printing details of all persons in the list
    }
}
