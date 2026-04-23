import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Welcome to the Number Guessing Game ===");

        while (true) { // Control whether to continue playing
            int target = random.nextInt(100) + 1; // 1–100
            int min = 1;
            int max = 100;
            int count = 0;

            System.out.println("\nGuess the number between 1 and 100");

            while (true) {
                System.out.print("Input: ");

                // Prevent non-numeric input
                if (!scanner.hasNextInt()) {
                    String invalid = scanner.next();
                    System.out.println("'" + invalid + "' is not a valid number. Please enter an integer.");
                    continue;
                }

                int guess = scanner.nextInt();

                // correct range check (allow boundary)
                if (guess < min || guess > max) {
                    System.out.println("Please enter a number between " + min + " and " + max);
                    continue;
                }

                count++;

                if (guess < target) {
                    min = guess; // update lower bound
                    System.out.println("Too small! New range: " + min + " - " + max);
                } else if (guess > target) {
                    max = guess; // update upper bound
                    System.out.println("Too big! New range: " + min + " - " + max);
                } else {
                    System.out.println("Congratulations! You guessed it in " + count + " tries!");
                    break;
                }
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