package Package;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int secretNumber = random.nextInt(10) + 1;

            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 10.");
            System.out.println("Three players will each guess the number.");
            System.out.println("Let's begin!");

            // prompt player 1 to guess the number
            System.out.print("Player 1, enter your guess: ");
            int player1Guess = scanner.nextInt();

            // prompt player 2 to guess the number
            System.out.print("Player 2, enter your guess: ");
            int player2Guess = scanner.nextInt();

            // prompt player 3 to guess the number
            System.out.print("Player 3, enter your guess: ");
            int player3Guess = scanner.nextInt();

            // check if any player guessed the correct number
            if (player1Guess == secretNumber) {
                System.out.println("Player 1 guessed the correct number!");
            } else if (player2Guess == secretNumber) {
                System.out.println("Player 2 guessed the correct number!");
            } else if (player3Guess == secretNumber) {
                System.out.println("Player 3 guessed the correct number!");
            } else {
                System.out.println("No one guessed the correct number.");
                System.out.println("The correct number was: " + secretNumber);
            }
        }
    }
