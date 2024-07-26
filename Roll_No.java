import java.util.Scanner;

public class Roll_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of roll nos. to be taken:");
        int n = sc.nextInt();
        
        int[] rollNumbers = new int[n];
        
        System.out.println("Enter the sorted list of roll nos.:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the roll no. to search for:");
        int N = sc.nextInt();
        sc.close();
        int comparisons = linearSearch(rollNumbers, N);
        
        if (comparisons == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Number of comparisons made: " + comparisons);
        }
    }
    
    public static int linearSearch(int[] array, int target) {
        int comparisons = 0;
        
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (array[i] == target) {
                return comparisons;
            }
        }
        
        return -1; 
    }
}
