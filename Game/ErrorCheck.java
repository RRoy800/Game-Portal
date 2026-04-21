package Game;

import java.util.Scanner;

public class ErrorCheck {

    public static int ans = 0;

    public static int getInt(Scanner sc) {

        int ans;

        while (true) {
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number that corresponds with a game");
                sc.next();
            }
            ans = sc.nextInt();
            if (ans >= 1 && ans <= 3) {
                return ans;
            } else {
                System.out.print("Please enter a number that corresponds with a game");
            }
        }

    }
}