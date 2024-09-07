import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int playerScore = 0;
        int round = 0;
        double winNumber = 0;

        while (true) {
            System.out.println("Player Score: " + playerScore);
            System.out.println("Round : " + round);
            double winRate = round == 0 ? 0 : (winNumber / round) * 100;
            System.out.println("Win rate: " + winRate + " %");
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
                round++;
                playerScore++; // เพิ่มคะแนน
                winNumber++; // เพิ่มคะแนนชนะ
            } else if (playerChoice.equals(computerChoice)) {
                round++;
                System.out.println("It's a tie!");
            } else {
                round++;
                System.out.println("You lose!");
            }

            System.out.print("Play again? (y/n): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        
        System.out.println("Final Score: " + playerScore);
        double winRate = round == 0 ? 0 : (winNumber / round) * 100;
        System.out.println("Win rate: " + winRate + " %");
        scanner.close();
    }
}