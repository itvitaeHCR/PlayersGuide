package Day14;

import java.util.Scanner;

public class Replicator {
    public static void main(String[] args) {
        theReplicatorOfDTo();
    }

    private static void theReplicatorOfDTo() {
        int[] baseArray = new int[5];
        Scanner replicate = new Scanner(System.in);
        for (int i = 0; i < baseArray.length; i++) {
            System.out.println("please provide a nr\t:");
            int x = replicate.nextInt();
            baseArray[i] = x;
        }
        int[] copyArray = new int[baseArray.length];
        for (int i = 0; i < baseArray.length; i++) {
            int y = baseArray[i];
            copyArray[i] = y;
        }

        for (int i = 0; i < baseArray.length; i++) {
            System.out.println(baseArray[i] + "( copy: " + copyArray[i] + " )");
        }

    }

}
