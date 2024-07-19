
import java.util.Scanner;
import java.util.Random;

class PenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Pen Game!");
        int min = 2;
        int max = 30;
        int totalPens = (int)(Math.random() * (max - min + 1) + min);
        System.out.println("Total pens are " + totalPens);
        System.out.println("State the number of pens that can be picked:");
        int x = sc.nextInt();

        while (totalPens > 0) {
            int computerPick = Pens(x,0);
            totalPens -= computerPick;
            System.out.println("Computer picked " + computerPick + " pens. " + totalPens + " pens remaining.");

            if (totalPens == 0) {
                System.out.println("Computer picked the last pen. Computer wins!");
                break;
            }

            System.out.println("Your turn. Pick pens:");
            int userPick = sc.nextInt();

            while (userPick > x || userPick > totalPens || userPick <= 0) {
                System.out.println("Invalid move. Pick again:");
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

    public static int Pens(int max, int min) {
        return (int)(Math.random() * Math.min(max, min)) + 1;
    }
}
