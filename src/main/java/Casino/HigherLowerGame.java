package Casino;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    private final Scanner inputScanner;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {

        // Generate a random number
        // Put number of turns to zero

        int numberToGuess = new Random().nextInt(100);
        int numberOfTurns = 0;

        // Ask user to pick a number

        while (true) {
            System.out.println("Make a guess");
            String input = inputScanner.nextLine();
            System.out.printf("You typed: %s\n", input);

            // Add a turn to numberOfTurns

            int userInput = Integer.parseInt(input);
            numberOfTurns++;

            // Check if the guess is correct or player is out of turns, if so end the game

            if (numberOfTurns < 10) {
                if (userInput == numberToGuess) {
                    System.out.println("`Correct! You guessed the number in " + numberOfTurns + " turns");
                    break;
                } else if (userInput < numberToGuess) {
                    System.out.println("Your number is to low, guess again..!");
                } else {
                    System.out.println("Your number is to high, guess again..!");
                }
            } else {
                System.out.println("You're out of turns, you lost!!");
                break;
            }
        }
    }
}
