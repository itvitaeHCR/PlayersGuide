package Day8;

import java.awt.*;
import java.util.Scanner;

public class DefenseOfConsolas {
    public static void main(String[] args) {
        theDefenseOfConsolas();
    }

    private static void theDefenseOfConsolas() {
        Scanner location = new Scanner(System.in);
        System.out.println("please provide the row of the attack\t: ");
        int row = location.nextInt();
        System.out.println("please provide the column of the attack\t: ");
        int column = location.nextInt();
        System.out.println("the locations to send your troops to in order to protect (" + row + "," + column + " are:");
        System.out.println("(" + (row + 1) + "," + (column + 1) + ")");
        System.out.println("(" + (row - 1) + "," + (column + 1) + ")");
        System.out.println("(" + (row + 1) + "," + (column - 1) + ")");
        System.out.println("(" + (row - 1) + "," + (column - 1) + ")");
        Toolkit.getDefaultToolkit().beep();
    }

}
