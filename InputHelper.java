import java.util.Scanner;

public class InputHelper {

    public static boolean askToContinue(Scanner scanner) {
        String answer;

        while (true) {
            System.out.print("Do you want to play again? (y/n): ");
            answer = scanner.next().toLowerCase();

            if (answer.equals("y") || answer.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n' only.");
            }
        }

        return answer.equals("y"); // true = continue, false = stop
    }
}