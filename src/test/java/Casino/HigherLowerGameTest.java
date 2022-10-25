package Casino;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class HigherLowerGameTest {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    public void HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;

        // Generate random number between 1-100


        int min = 1;
        int max = 100;

        Random numberPick = new Random();

        int value = numberPick.nextInt(max + min) + min;


        // Ask user to pick a number

        while (gameIsRunning) {
            System.out.println("Make a guess");
            String guess = inputScanner.nextLine();
            System.out.printf("You typed: %s\n", guess);

            // Check if the guess is correct, if so end the game

            if(Objects.equals(guess, value)) {

            }




        }
    }
}

