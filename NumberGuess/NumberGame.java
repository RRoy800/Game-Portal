package NumberGuess;
import java.util.Random;
import java.util.Scanner;
import java.security.Identity;
import java.util.ArrayList;

public class NumberGame {
    int guesses;
    int numToGuess;
    static Scanner sc = new Scanner(System.in);
    int min;
    ArrayList<Integer> previousGuesses = new ArrayList<>();

    NumberGame(int low, int high) {
        guesses = 0;
        System.out.println("I'm thinking of a number from " + low + " to " + high);
        Random x = new Random();
        numToGuess = x.nextInt(low, high);

    }

    void play() {

        System.out.println("Begin guessing!");
        int guess = getGuess();
        while (guess != numToGuess) {
            System.out.println("You guessed " + guess);
            if (guess < numToGuess) {
                System.out.println("Your should guess higher!");
            } else if (guess > numToGuess) {
                System.out.println("You should guess lower");
            }
            guess = getGuess();
        }
        System.out.println("The number was " + numToGuess + "!");
        System.out.println("You got it in " + guesses + " guesses");

    }


    int getGuess() {
        if (sc.hasNextInt()) {
            int guess = sc.nextInt();
            if (previousGuesses.contains(guess)) {
                System.out.println("You already guessed that!");
                return getGuess();
            }
            previousGuesses.add(guess);
            guesses++;
            return guess;
        } else {
            sc.next();
            System.out.println("Give me an integer");
            return getGuess();
        }
    }

    int getNumGuesses() {
        return guesses;
    }

}
