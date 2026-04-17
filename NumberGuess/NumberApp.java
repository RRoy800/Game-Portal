package NumberGuess;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Game.Game;
import Game.GameWriteable;

public class NumberApp implements GameWriteable {

    private ArrayList<NumberGame> games = new ArrayList<>();

    public static int getBestGame(ArrayList<NumberGame> games) {
        // best game
        int minGame = Integer.MAX_VALUE;
        for (NumberGame g : games) {
            if (g.getNumGuesses() < minGame) {
                minGame = g.getNumGuesses();
            }
        }
        return minGame;
    }

    @Override
    public String getGameName() {
        return "Number Guess Game";
    }

    @Override
    public void play() {
        System.out.println("Welcome to the Number Guess Game!");
        Scanner sc = new Scanner(System.in);
        System.out.println("To play a game, press 'y'. If you want to stop playing, type anything other than 'y'.");
        HashMap<Integer, Integer> histogram = new HashMap<>();
        while (sc.hasNext() && sc.next().equals("y")) {
            NumberGame g = new NumberGame(1, 100);
            g.play();
            games.add(g);
            int key = g.getNumGuesses();
            if (histogram.containsKey(key)) {
                histogram.put(key, histogram.get(key) + 1);
            } else {
                histogram.put(key, 1);
            }
            System.out.println("press 'y' to play another game. Press any other key to end your session");
        }
        // System.out.println("Histogram print out:");
        // System.out.println(histogram);
    }

    @Override
    public String getScore() {
        return String.valueOf(getBestGame(games));
    }

    @Override
    public boolean isHighScore(String score, String currentHighScore) {
        return currentHighScore == null || 
               Integer.parseInt(score) < Integer.parseInt(currentHighScore);  
        
    }

}
