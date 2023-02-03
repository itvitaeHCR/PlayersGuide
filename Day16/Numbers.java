package Day16;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        takingANumber();
    }

    public static void takingANumber() {
        Scanner prepAskNumber = new Scanner(System.in);
        System.out.println("please provide text\t:");
        String text = prepAskNumber.nextLine();
        System.out.println("please provide a range start\t:");
        int start = prepAskNumber.nextInt();
        System.out.println("please provide a range end\t:");
        int end = prepAskNumber.nextInt();
        askForNumber(text, start, end);
    }

    public static int askForNumber(String text, int start, int end) {
        Scanner askNumber = new Scanner(System.in);
        System.out.println(text + "\nYour given range is between " + start + " and " + end);
        int givenNr = askNumber.nextInt();
        if (givenNr < start || givenNr > end) {
            System.out.println("please try again and stay in range..");
            askForNumber(text, start, end);
        }
        return givenNr;
    }

}
