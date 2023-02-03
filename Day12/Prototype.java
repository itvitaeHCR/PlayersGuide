package Day12;

import java.util.Scanner;

public class Prototype {
    public static void main(String[] args) {
        thePrototype();
    }

    private static void thePrototype() {
        Scanner guess = new Scanner(System.in);
        System.out.println("please input a number between 0 and 100");
        int goal = guess.nextInt();
        guessAssess(goal);
    }

    public static void guessAssess(int goal) {
        Scanner attempts = new Scanner(System.in);
        System.out.println("please provide a guess\t:");
        int attempt = attempts.nextInt();
        if (attempt < goal) {
            System.out.println("uh oh.. " + attempt + " is slightly too low.");
            guessAssess(goal);
        } else if (attempt > goal) {
            System.out.println("uh oh.. " + attempt + " is slightly too high.");
            guessAssess(goal);
        } else {
            System.out.println("well done! " + attempt + " was the correct guess!");
        }
    }

}
