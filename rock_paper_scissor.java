import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors):");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 1 || playerChoice > 3) {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            return;
        }

        // Generate computer's choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = (int) (Math.random() * 3) + 1;

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                   (playerChoice == 2 && computerChoice == 1) ||
                   (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}



