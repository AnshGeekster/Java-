import java.util.Scanner;
import java.util.Random;

public class PenGame {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Display a welcome message to the player
        System.out.println("Welcome to the Pen Game!");

        // Set the minimum and maximum number of pens
        int min =2;
        int max=30;

        // Generate a random number of total pens within the range [min, max]
        int totalPens= (int)(Math.random()*(max-min+1)+min);

        // Display the total number of pens
        System.out.println("Total pens are "+ totalPens);
        while (totalPens > 0) {
      
            int computerPick = totalPens % 4;
            if (computerPick == 0) {
                computerPick = 1;
            }

            // Subtract the computer's pick from the total pens
            totalPens -= computerPick;
            System.out.println("Computer picked " + computerPick + " pens. " + totalPens + " pens remaining.");

            // Check if there are no pens left after the computer's move
            if (totalPens == 0) {
                System.out.println("Computer picked the last pen. Computer wins!");
                break;
            }

            System.out.println("Your turn. Pick 1, 2, or 3 pens:");
            int userPick = sc.nextInt();

            while (userPick < 1 || userPick > 3 || userPick > totalPens) {
                System.out.println("Invalid move. Pick 1, 2, or 3 pens:");
                userPick = sc.nextInt();
            }

            // Subtract the player's pick from the total pens
            totalPens -= userPick;
            System.out.println("You picked " + userPick + " pens. " + totalPens + " pens remaining.");

            
            // Check if there are no pens left after the player's move
            if (totalPens == 0) {
                System.out.println("You picked the last pen. You win!");
                break;
            }
        }
        sc.close();
    }
}
