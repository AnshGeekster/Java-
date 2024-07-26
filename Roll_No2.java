import java.util.Scanner;

public class Roll_No2 {

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
        int N  = sc.nextInt();
        sc.close();
        // Perform binary search and get the number of comparisons
        int comparisons = binarySearch(rollNumbers, N);
        
        // Print the result
        if (comparisons == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Number of comparisons made: " + comparisons);
        }
    }
    
    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int comparisons = 0;
        
        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return comparisons;
            }
            
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Element not found
    }
}
