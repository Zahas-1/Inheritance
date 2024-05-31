package Warehousing;

import java.util.ArrayList;

// ChangeHistory class to keep track of changes over time
public class ChangeHistory {
    // Private instance variable to store the list of values
    private ArrayList<Double> changeHistory;

    // Constructor to initialize the change history
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    // Method to add a new value to the change history
    public void add(double status) {
        changeHistory.add(status);
    }

    // Method to clear the change history
    public void clear() {
        changeHistory.clear();
    }

    // Method to generate a string representation of the change history
    public String toString() {
        return changeHistory.toString();
    }

    // Method to find the maximum value in the change history
    public double maxValue() {
        // Initialize max with the smallest possible value
        double max = Integer.MIN_VALUE;
        // Check if the change history is not empty
        if (!(changeHistory.isEmpty())) {
            // Iterate through the change history to find the maximum value
            for(int i = 0; i < changeHistory.size(); i++){
                max = Math.max(changeHistory.get(i), max);
            }
            // Return the maximum value found
            return max;
        }
        // Return 0 if the change history is empty
        return 0.00;
    }

    // Method to find the minimum value in the change history
    public double minValue() {
        // Initialize least with the largest possible value
        double least = Integer.MAX_VALUE;
        // Check if the change history is not empty
        if (!(changeHistory.isEmpty())) {
            // Iterate through the change history to find the minimum value
            for(int i = 0; i < changeHistory.size(); i++){
                if(changeHistory.get(i) < least){
                    least = changeHistory.get(i);
                }
            }
            // Return the minimum value found
            return least;
        }
        // Return 0 if the change history is empty
        return 0.00;
    }

    // Method to calculate the average value of the change history
    public double average(){
        // Initialize variables for sum, count, and average
        double avg = 0.00;
        double count = 0.00;
        double sum = 0.00;
        // Check if the change history is not empty
        if(!(changeHistory.isEmpty())){
            // Iterate through the change history to calculate sum and count
            for(double items : changeHistory){
                count++;
                sum += items;
            }
            // Calculate the average
            avg = sum / count;
        }
        // Return the average value
        return avg;
    }

    // Main method for testing the ChangeHistory class
    public static void main(String[] args) {
        // Create a new instance of ChangeHistory
        ChangeHistory item1 = new ChangeHistory();
        // Add sample values to the change history
        item1.add(60.00);
        item1.add(20.00);
        item1.add(30.00);
        item1.add(40.00);
        item1.add(50.00);
        item1.add(40.00);
        item1.add(15.00);

        // Output the change history
        System.out.println(item1);

        // Output the maximum value in the change history
        System.out.println(item1.maxValue());
        // Output the minimum value in the change history
        System.out.println(item1.minValue());
        // Output the average value of the change history
        System.out.println(item1.average());
    }
}
