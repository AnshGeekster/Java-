import java.util.Scanner;
import java.lang.*;
public class String_Encryption {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string:");
        String input = sc.nextLine().trim();
        sc.close();  // Close the scanner to prevent resource leaks
        int l=input.length();  // Get the length of the input string
        int i,j;
        String s="";  // Initialize an empty string to store the encrypted result
        for(i=0,j=l-1;i<=j;i++,j--){
            s+=input.charAt(i);  // Append the character from the front
            if(i!=j){
                s+=input.charAt(j);
            }
        }
        // Print the encrypted string
        System.out.println(s);


    }}
