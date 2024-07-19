import java.util.Scanner;
import java.util.Random;

public class PenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Pen Game!");
        int min =2;
        int max=30;
        int totalPens= (int)(Math.random()*(max-min+1)+min);
        System.out.println("Total pens are "+ totalPens);
        while (totalPens > 0) {
      
            int computerPick = totalPens % 4;
            if (computerPick == 0) {
                computerPick = 1;
            }
            totalPens -= computerPick;
            System.out.println("Computer picked " + computerPick + " pens. " + totalPens + " pens remaining.");

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

            totalPens -= userPick;
            System.out.println("You picked " + userPick + " pens. " + totalPens + " pens remaining.");

            if (totalPens == 0) {
                System.out.println("You picked the last pen. You win!");
                break;
            }
        }
        sc.close();
    }
}
