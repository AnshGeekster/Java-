import java.util.Scanner;

public class Roll_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        System.out.println("Enter the no. of roll nos. to be taken:");
        int n = sc.nextInt();
        
        // Create an array to store the roll numbers
        int[] rollNumbers = new int[n];
        
        // Read the sorted list of roll numbers
        System.out.println("Enter the sorted list of roll nos.:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();
        }
        
        // Read the number to search for
        System.out.println("Enter the roll no. to search for:");
        int N = sc.nextInt();
        sc.close();
        // Perform linear search and get the number of comparisons
        int comparisons = linearSearch(rollNumbers, N);
        
        // Print the result
        if (comparisons == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Number of comparisons made: " + comparisons);
        }
    }
    
    // Linear search method
    public static int linearSearch(int[] array, int target) {
        int comparisons = 0;
        
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (array[i] == target) {
                return comparisons;
            }
        }
        
        return -1; // Element not found
    }
}
