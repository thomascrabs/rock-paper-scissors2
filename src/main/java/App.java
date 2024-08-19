import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Welcome to RPS, Java style");
        String[] moves = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);

        boolean playAgain;
        do {
            playAgain = false;
            System.out.println("Please pick rock, paper or scissors");
            String humanMove = scanner.nextLine();
            if (!Arrays.asList(moves).contains(humanMove)) {
                System.out.println("Foolish human can't even enter a correct value");
                playAgain=true;
                continue;
            }
            String computerMove = moves[new Random().nextInt(3)];
            System.out.println("Computer picks " + computerMove);
            if (computerMove.equals(humanMove)) {
                System.out.println("It's a draw, try again");
                playAgain = true;
            } else if (humanMove.equals("rock") && computerMove.equals("scissors")
                    || humanMove.equals("scissors") && computerMove.equals("paper")
                    || humanMove.equals("paper") && computerMove.equals("rock")) {
                System.out.println("The puny human wins, this time");
            } else {
                System.out.println("Computer wins, you loooooooooser");
            }
            if (!playAgain) {
                System.out.println("Do you want to play again? (y/n)");
                playAgain = scanner.nextLine().equalsIgnoreCase("y");
            }
        } while (playAgain);
    }

}
