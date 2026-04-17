package BuzzFeedQuiz;

import java.util.Scanner;

import Game.GameWriteable;

import java.util.HashMap;

public class Quiz implements GameWriteable {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws Exception { // All questions + cats made by me
                // // Create Categories
                // Category tesla = new Category("Tesla Model Y",
                //                 "You're clean, simple and like a car that matches those traits.");
                // Category ford = new Category("Ford F-150",
                //                 "You love the thrill of adventure and need a vehicle suited to that love.");
                // Category merc = new Category("Mercedes Maybach 600",
                //                 "You enjoy traveling in luxory where you can sit back and relax");
                // Category lambo = new Category("Lamborghini Aventador SVJ",
                //                 "You are a speed demon; Someone who enjoys racing down the highway with the wind in your hair");
                // // Create Questions
                // Question q1 = new Question("Which of these shoes are you wearing on a given day?");
                // // Attach Answers to Questions
                // q1.possibleAnswers[0] = new Answer("Boots", ford);
                // q1.possibleAnswers[1] = new Answer("Slip-ons", tesla);
                // q1.possibleAnswers[2] = new Answer("Sneakers", lambo);
                // q1.possibleAnswers[3] = new Answer("Loafers", merc);

                // Question q2 = new Question("What is your ideal pet of these options?");
                // // Attach Answers to Questions
                // q2.possibleAnswers[0] = new Answer("Horse", ford);
                // q2.possibleAnswers[1] = new Answer("Rottweiler", merc);
                // q2.possibleAnswers[2] = new Answer("Shark", lambo);
                // q2.possibleAnswers[3] = new Answer("No pets", tesla);

                // Question q3 = new Question("How would your friends describe you?");
                // // Attach Answers to Questions
                // q3.possibleAnswers[0] = new Answer("Smart", merc);
                // q3.possibleAnswers[1] = new Answer("Fun", lambo);
                // q3.possibleAnswers[2] = new Answer("Tough guy", ford);
                // q3.possibleAnswers[3] = new Answer("Tech-savvy", tesla);

                // Question q4 = new Question("Choose a road trip snack and drink.");
                // // Attach Answers to Questions
                // q4.possibleAnswers[0] = new Answer("Energy Drink + Protein Bar", lambo);
                // q4.possibleAnswers[1] = new Answer("Coke + Beef Jerky", ford);
                // q4.possibleAnswers[2] = new Answer("Coffee + Croissant", merc);
                // q4.possibleAnswers[3] = new Answer("Soy Late + Trail Mix", tesla);

                // Question q5 = new Question("What music are you listening to?");
                // // Attach Answers to Questions
                // q5.possibleAnswers[0] = new Answer("Country", ford);
                // q5.possibleAnswers[1] = new Answer("Pop", tesla);
                // q5.possibleAnswers[2] = new Answer("Classical", merc);
                // q5.possibleAnswers[3] = new Answer("Rock", lambo);

                // Question q6 = new Question("Which of these if your favotie sport?");
                // // Attach Answers to Questions
                // q6.possibleAnswers[0] = new Answer("Formula 1", lambo);
                // q6.possibleAnswers[1] = new Answer("Football", ford);
                // q6.possibleAnswers[2] = new Answer("Hiking", tesla);
                // q6.possibleAnswers[3] = new Answer("Golf", merc);

                // Question q7 = new Question("What is closest to your typical weekend activity?");
                // // Attach Answers to Questions
                // q7.possibleAnswers[0] = new Answer("Going to a party", lambo);
                // q7.possibleAnswers[1] = new Answer("Hosting a dinner", merc);
                // q7.possibleAnswers[2] = new Answer("Binging a TV show", tesla);
                // q7.possibleAnswers[3] = new Answer("BBQing", ford);

                // Question q8 = new Question("Which of these is your favorite holiday?");
                // // Attach Answers to Questions
                // q8.possibleAnswers[0] = new Answer("4th of July", ford);
                // q8.possibleAnswers[1] = new Answer("Thanksgiving", merc);
                // q8.possibleAnswers[2] = new Answer("Haloween", tesla);
                // q8.possibleAnswers[3] = new Answer("Your Birthday", lambo);

                // Question q9 = new Question("Which of these books do you most like?"); // MAKE TIEBRAKER
                // // Attach Answers to Questions
                // q9.possibleAnswers[0] = new Answer("The Hunt for Red October", ford);
                // q9.possibleAnswers[1] = new Answer("The Godfather", merc);
                // q9.possibleAnswers[2] = new Answer("To Kill a Mockingbird", tesla);
                // q9.possibleAnswers[3] = new Answer("Moneyball", lambo);
                // // ... more questions here

                // // For each question, ask, read input, store answer.
                // gameIntro();
                // HashMap<Category, Integer> histogram = new HashMap<>();
                // Question[] qList = { q1, q2, q3, q4, q5, q6, q7, q8, q9 };
                // Category[] cList = { tesla, ford, merc, lambo };
                // // Intro (runs once)

                // String playAgain = "1";

                // while (playAgain.equals("1")) { //allows you to play again

                //         for (Category c : cList) { // all points reset to 0
                //                 c.points = 0;
                //         }

                //         for (Question q : qList) { //This histogram stores all of the answer choices and gives them to you after the game
                //                 Category c = q.ask(sc);
                //                 if (histogram.containsKey(c)) {
                //                         histogram.put(c, histogram.get(c) + 1);
                //                 } else {
                //                         histogram.put(c, 1);
                //                 }
                //                 c.points++;
                //         }

                //         int index = getMostPopularCatIndex(cList);
                //         System.out.println("The car that best suits you is the " + cList[index].label + ".");
                //         System.out.println(cList[index].description);
                //         System.out.println("Here is the breakdown oif your choices:");
                //         for (Category c : histogram.keySet()) {
                //                 System.out.println(c.label + ", " + histogram.get(c));
                //         }

                //         System.out.println("Press '1' to play again. Press any other key to end the game.");
                //         playAgain = sc.next();
                // }

                // System.out.println("Thank you for playing");
        }

        public static void gameIntro() {
                // requires 1 to keep going
                System.out.println("Which Car Best Suits You?");
                System.out.println("You get to choose numbers 1-4 for every question. Enter '1' to play!");
                int play = 0; // Illigal imput fixed by me
                while (play < 1 || play > 1) {
                        while (!sc.hasNextInt()) {
                                sc.next();
                                System.out.println("Unidentifiable input. Please enter '1' to play");
                        }
                        play = sc.nextInt();
                        if (play < 1 || play > 1) {
                                System.out.println("Unidentifiable input. Please enter '1' to plays");
                        }
                }
        }

        // returns the index that is the max
        // the tie breaker is the first Category that has the count is the "max" :/
        public static int getMostPopularCatIndex(Category[] counts) {
                int maxCount = 0;
                int maxIndex = 0;
                for (int i = 0; i < counts.length; i++) {
                        if (counts[i].points > maxCount) {
                                maxCount = counts[i].points;
                                maxIndex = i;
                        }
                }
                return maxIndex;
        }

        @Override
        public String getGameName() {
                return "Buzz Feed Quiz";
        }

        @Override
        public void play() {
                Category tesla = new Category("Tesla Model Y",
                                "You're clean, simple and like a car that matches those traits.");
                Category ford = new Category("Ford F-150",
                                "You love the thrill of adventure and need a vehicle suited to that love.");
                Category merc = new Category("Mercedes Maybach 600",
                                "You enjoy traveling in luxory where you can sit back and relax");
                Category lambo = new Category("Lamborghini Aventador SVJ",
                                "You are a speed demon; Someone who enjoys racing down the highway with the wind in your hair");
                // Create Questions
                Question q1 = new Question("Which of these shoes are you wearing on a given day?");
                // Attach Answers to Questions
                q1.possibleAnswers[0] = new Answer("Boots", ford);
                q1.possibleAnswers[1] = new Answer("Slip-ons", tesla);
                q1.possibleAnswers[2] = new Answer("Sneakers", lambo);
                q1.possibleAnswers[3] = new Answer("Loafers", merc);

                Question q2 = new Question("What is your ideal pet of these options?");
                // Attach Answers to Questions
                q2.possibleAnswers[0] = new Answer("Horse", ford);
                q2.possibleAnswers[1] = new Answer("Rottweiler", merc);
                q2.possibleAnswers[2] = new Answer("Shark", lambo);
                q2.possibleAnswers[3] = new Answer("No pets", tesla);

                Question q3 = new Question("How would your friends describe you?");
                // Attach Answers to Questions
                q3.possibleAnswers[0] = new Answer("Smart", merc);
                q3.possibleAnswers[1] = new Answer("Fun", lambo);
                q3.possibleAnswers[2] = new Answer("Tough guy", ford);
                q3.possibleAnswers[3] = new Answer("Tech-savvy", tesla);

                Question q4 = new Question("Choose a road trip snack and drink.");
                // Attach Answers to Questions
                q4.possibleAnswers[0] = new Answer("Energy Drink + Protein Bar", lambo);
                q4.possibleAnswers[1] = new Answer("Coke + Beef Jerky", ford);
                q4.possibleAnswers[2] = new Answer("Coffee + Croissant", merc);
                q4.possibleAnswers[3] = new Answer("Soy Late + Trail Mix", tesla);

                Question q5 = new Question("What music are you listening to?");
                // Attach Answers to Questions
                q5.possibleAnswers[0] = new Answer("Country", ford);
                q5.possibleAnswers[1] = new Answer("Pop", tesla);
                q5.possibleAnswers[2] = new Answer("Classical", merc);
                q5.possibleAnswers[3] = new Answer("Rock", lambo);

                Question q6 = new Question("Which of these if your favotie sport?");
                // Attach Answers to Questions
                q6.possibleAnswers[0] = new Answer("Formula 1", lambo);
                q6.possibleAnswers[1] = new Answer("Football", ford);
                q6.possibleAnswers[2] = new Answer("Hiking", tesla);
                q6.possibleAnswers[3] = new Answer("Golf", merc);

                Question q7 = new Question("What is closest to your typical weekend activity?");
                // Attach Answers to Questions
                q7.possibleAnswers[0] = new Answer("Going to a party", lambo);
                q7.possibleAnswers[1] = new Answer("Hosting a dinner", merc);
                q7.possibleAnswers[2] = new Answer("Binging a TV show", tesla);
                q7.possibleAnswers[3] = new Answer("BBQing", ford);

                Question q8 = new Question("Which of these is your favorite holiday?");
                // Attach Answers to Questions
                q8.possibleAnswers[0] = new Answer("4th of July", ford);
                q8.possibleAnswers[1] = new Answer("Thanksgiving", merc);
                q8.possibleAnswers[2] = new Answer("Haloween", tesla);
                q8.possibleAnswers[3] = new Answer("Your Birthday", lambo);

                Question q9 = new Question("Which of these books do you most like?"); // MAKE TIEBRAKER
                // Attach Answers to Questions
                q9.possibleAnswers[0] = new Answer("The Hunt for Red October", ford);
                q9.possibleAnswers[1] = new Answer("The Godfather", merc);
                q9.possibleAnswers[2] = new Answer("To Kill a Mockingbird", tesla);
                q9.possibleAnswers[3] = new Answer("Moneyball", lambo);
                // ... more questions here

                // For each question, ask, read input, store answer.
                gameIntro();
                HashMap<Category, Integer> histogram = new HashMap<>();
                Question[] qList = { q1, q2, q3, q4, q5, q6, q7, q8, q9 };
                Category[] cList = { tesla, ford, merc, lambo };
                // Intro (runs once)

                String playAgain = "1";

                while (playAgain.equals("1")) { //allows you to play again

                        for (Category c : cList) { // all points reset to 0
                                c.points = 0;
                        }

                        for (Question q : qList) { //This histogram stores all of the answer choices and gives them to you after the game
                                Category c = q.ask(sc);
                                if (histogram.containsKey(c)) {
                                        histogram.put(c, histogram.get(c) + 1);
                                } else {
                                        histogram.put(c, 1);
                                }
                                c.points++;
                        }

                        int index = getMostPopularCatIndex(cList);
                        System.out.println("The car that best suits you is the " + cList[index].label + ".");
                        System.out.println(cList[index].description);
                        System.out.println("Here is the breakdown oif your choices:");
                        for (Category c : histogram.keySet()) {
                                System.out.println(c.label + ", " + histogram.get(c));
                        }

                        System.out.println("Press '1' to play again. Press any other key to end the game.");
                        playAgain = sc.next();
                }

                System.out.println("Thank you for playing");
        }

        @Override
        public String getScore() {
                return "You cannot get a high score on this";
        }

        @Override
        public boolean isHighScore(String score, String currentHighScore) {
                return true;
        }
}
