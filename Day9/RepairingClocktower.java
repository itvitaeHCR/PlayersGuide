package Day9;

import java.util.Scanner;

public class RepairingClocktower {
    public static void main(String[] args) {
        repairingTheClocktower();
    }

    private static void repairingTheClocktower() {
        Scanner seconds = new Scanner(System.in);
        System.out.println("what is the current seconds status?\t:");
        int currentSecond = seconds.nextInt();
        String ticktock;
        if (currentSecond % 2 == 0) {
            ticktock = "tick";
        } else {
            ticktock = "tock";
        }
        System.out.println(ticktock);
    }

}
