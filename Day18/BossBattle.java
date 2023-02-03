package Day18;

import Day12.Prototype;
import Day16.Numbers;

import java.util.Scanner;

public class BossBattle {
    public static void main(String[] args) {
        //The first user begins by secretly establishing how far the Manticore is from the city, in the range 0 to 100. The program then
        //allows a second player to repeatedly attempt to destroy the airship by picking the range to target until either the city of Consolas
        //or the Manticore is destroyed. In each attempt, the player is told if they overshot (too far), fell short (not far enough), or hit the
        //Manticore. The damage dealt to the Manticore depends on the turn number. For most turns, 1 point of damage is dealt. But if the
        //turn number is a multiple of 3, a fire blast deals 3 points of damage; a multiple of 5, an electric blast deals 3 points of damage,
        //and if it is a multiple of both 3 and 5, a mighty fire-electric blast deals 10 points of damage. The Manticore is destroyed after
        //taking 10 points of damage.
        //However, if the Manticore survives a turn, it will deal a guaranteed 1 point of damage to the city of Consolas. The city can only
        //take 15 points of damage before being annihilated.
        //Before a round begins, the user should see the current status: the current round number, the city’s health, and the Manticore’s
        //health
    }

    public static void bossBattling(int ManticoreHP, int ConsolasHP, int round) {
        currentStatus(ManticoreHP, ConsolasHP, round);
        int ManticoreRange = Numbers.askForNumber("Player 1, how far away from the city do you want to station the Manticore?\t:", 0, 100);
        guessingTheDistance(ManticoreRange, ManticoreHP, ConsolasHP, round);
    }

    public static void currentStatus(int ManticoreHP, int ConsolasHP, int round) {
        System.out.printf("""
                The current round is %d.
                The Manticore has %s%d hitpoints%s left.
                The city of Consolas has %s%d hitpoints%s left.
                %n""", round, "\u001B[31m", ManticoreHP, "\u001B[0m", "\u001B[32m",ConsolasHP, "\u001B[0m");
    }

    // make function that calls this function IF neither HP's are zero (or below)
    public static void guessingTheDistance(int ManticoreRange, int ManticoreHP, int ConsolasHP, int round) {
        // input estimate
        Scanner aims = new Scanner(System.in);
        System.out.println("Where will you aim the cannon?\t:");
        int aim = aims.nextInt();
        if (aim < ManticoreRange) {
            System.out.println("uh oh.. " + aim + " fell short.");
            // handle result here: change C-HP; round +=1; call (parent-)function again
        } else if (aim > ManticoreRange) {
            System.out.println("uh oh.. " + aim + " overshot.");
            // handle result here: change C-HP; round +=1; call (parent-)function again
        } else {
            System.out.println("well done! " + aim + " was right on target!");
            // handle result here: change C-hp and M-hp (damage dep on round); round +=1; call (parent-)function again
        }
    }

}
