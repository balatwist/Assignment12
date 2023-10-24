import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a score (0 to 100): ");
                score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException("Inputs should be in the range of 0-100.");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer value.");
                scanner.next();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Score entered: " + score);
    }
}
