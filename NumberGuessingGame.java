import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between 1 and 10.");

        while (!correctGuess && attempts < 3) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                correctGuess = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        if (!correctGuess) {
            System.out.println("Sorry, you didn't guess the number. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
