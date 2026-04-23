import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = { "Scissors", "Rock", "Paper" };

        System.out.println("Welcome to Rock Paper Scissors!");

        while (true) { // control whether to continue playing
            System.out.print("Enter Scissors / Rock / Paper: ");
            String userChoice = scanner.next();

            // check if input is valid
            if (!userChoice.equalsIgnoreCase("Scissors") &&
                    !userChoice.equalsIgnoreCase("Rock") &&
                    !userChoice.equalsIgnoreCase("Paper")) {
                System.out.println("Invalid input. Please enter Scissors / Rock / Paper.");
                continue;
            }

            // computer random choice
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // determine winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                    (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            
            // Continue playing?
            if (!InputHelper.askToContinue(scanner)) {
                System.out.println("Game over. Goodbye!");
                break;
            }
            System.out.println();
        }

        scanner.close();
    }
}