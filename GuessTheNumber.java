import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            try {
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        }

        scanner.close();
    }
}
