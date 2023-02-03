package Day10;

import java.util.Scanner;

public class Watchtower {
    public static void main(String[] args) {
        watchtower();
    }

    private static void watchtower() {
        Scanner coordinates = new Scanner(System.in);
        System.out.println("please provide us with the coordinates:\tx:");
        int x = coordinates.nextInt();
        System.out.println("please provide us with the coordinates:\ty:");
        int y = coordinates.nextInt();

        String enemyCoordinates = "The enemy is to the " + northOrSout(y) + eastOrWest(x);
        System.out.println(enemyCoordinates);
    }

    private static String eastOrWest(int x) {
        if (x > 0) {
            return "west";
        } else if (x < 0) {
            return "east";
        } else {
            return "";
        }
    }

    private static String northOrSout(int y) {
        if (y > 0) {
            return "south";
        } else if (y < 0) {
            return "north";
        } else {
            return "";
        }
    }

}
