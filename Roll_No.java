import java.util.Scanner;

public class Roll_No {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of roll numbers to be taken
        System.out.println("Enter the no. of roll nos. to be taken:");
        int n = sc.nextInt();   // Read the number of roll numbers

        // Create an array to store the roll numbers
        int[] rollNumbers = new int[n];
        
        System.out.println("Enter the sorted list of roll nos.:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();  // Read each roll number and store it in the array
        }
        
        System.out.println("Enter the roll no. to search for:");
        int N = sc.nextInt();  // Read the roll number to be searched
        sc.close();  // Close the scanner to prevent resource leaks

        // Perform a linear search to find the roll number and count comparisons
        int comparisons = linearSearch(rollNumbers, N);
        
        if (comparisons == -1) {
            System.out.println("-1");  // Indicate that the roll number was not found

        } else {
            System.out.println("Number of comparisons made: " + comparisons);
        }
    }
    
    public static int linearSearch(int[] array, int target) {
        int comparisons = 0;  // Initialize a counter for the number of comparisons
        
        for (int i = 0; i < array.length; i++) {
            comparisons++;  // Increment the comparison counter
            if (array[i] == target) {
                return comparisons;  // Return the number of comparisons made
            }
        }
        
        return -1;  // Return -1 if the target roll number is not found
    }
}
