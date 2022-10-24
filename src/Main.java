import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playAgain = "y";
        int rollAgain = 0;
        while (playAgain.equalsIgnoreCase("Y")) {
            Random diceRoll = new Random();
            int die1 = diceRoll.nextInt(6) + 1;
            int die2 = diceRoll.nextInt(6) + 1;
            int diceSum = die1 + die2;
            int point;

            if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println("The sum of the two dice is " + diceSum);
                System.out.println("You have crapped out. ");

                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();

            } else if (diceSum == 7 || diceSum == 11) {
                System.out.println("The sum of the two dice was " + diceSum);
                System.out.println("You won with a natural!");

                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();

            } else if (diceSum == 4 || diceSum == 5 || diceSum == 6 || diceSum == 8 || diceSum == 9 || diceSum == 10) {
                point = diceSum;

                System.out.println("You rolled a " + diceSum + " so your point is: " + point);
                System.out.print("Do you want to roll again? [Y/N]" );
                playAgain = in.nextLine();

                while (rollAgain != 7) {
                    Random diceRollAgain = new Random();
                    int die3 = diceRollAgain.nextInt(6) + 1;
                    int die4 = diceRollAgain.nextInt(6) + 1;
                    int diceSummy = die3 + die4;

                    System.out.println("The sum of the two dice is " + diceSummy);

                    if (diceSummy == 7) {
                        System.out.println("You have crapped out. ");
                        System.out.print("Would you like to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        rollAgain = 7;

                    } else if (diceSummy == point) {
                        System.out.println("You have won, it matches the point!");
                        System.out.print("Would you like to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        rollAgain = 7;

                    } else {
                        System.out.println("You haven't won or lost ");
                        System.out.print("Do you want to roll again? [Y/N]: ");
                        playAgain = in.nextLine();

                    }

                }if (playAgain.equalsIgnoreCase("Y")) {
                    System.out.println("Play Again? [Y/N]");

                    if (playAgain.equalsIgnoreCase("N"))
                        playAgain = in.nextLine(); }
            }
        }
    }
}