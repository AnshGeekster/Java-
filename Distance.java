import java.util.Scanner;
public class Distance
{

    public static void main(String[] args) 
    {
         // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Define the acceleration due to gravity in meters per second squared
        float g= 9.81f;
        System.out.println("Enter the time in seconds: ");
        
        // Read the user input (time in seconds)
        int X=sc.nextInt();

        // Close the Scanner object
        sc.close();

        // Calculate the distance using the formula d = 0.5 * g * t^2
        float d= (0.5f)*g*X*X;
        System.out.println(d+" meters");
    
    }
}
