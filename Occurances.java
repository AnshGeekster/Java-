import java.util.*;
import java.lang.*;
public class Occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        int c=0,k=0;
        System.out.println("Enter the String:");
        String s=sc.nextLine();  // Read the input string
        sc.close();  // Close the Scanner object
        int l=s.length();  // Get the length of the input string
        int[] arr=new int[l];  // Create an array to store the frequency of each character
        s=s.toLowerCase();  // Convert the input string to lowercase
        for(char j='a';j<='z';j++)
        {
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);  // Get the character at the current position
                if(ch==j){
                    c++;  // Increment the counter
                }
            }
            if (c>0){
                arr[k]=c;  // Store the counter value in the array
                k++;  // Increment the array index
                c=0;  // Reset the counter
            }
        }
        int l1=arr.length;
        for(int m=0;m<l1;m++){
            for(int n=m+1;n<l1;n++){
                if(arr[m]<arr[n]){
                    int temp=arr[m];  // Swap the elements
                    arr[m]=arr[n];
                    arr[n]=temp;
                }
            }
        }
        // Print the sorted frequencies
        for(int p=0;p<l1;p++){
            if(arr[p]!=0){
            System.out.print(arr[p]+" ");
        }

}
}
}
