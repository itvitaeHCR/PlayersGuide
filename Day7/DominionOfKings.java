package Day7;

import java.util.Scanner;

public class DominionOfKings {
    public static void main(String[] args) {
        challengeTheDominionOfKings();
    }

    private static void challengeTheDominionOfKings() {
        Scanner nr = new Scanner(System.in);
        String[] kings = {"Melik", "Casik", "Balik"};
        for (String king : kings) {
            System.out.println(king + ": How many estates are there\t: ");
            int a = nr.nextInt();
            System.out.println(king + ": How many duchies are there\t: ");
            int b = a + (nr.nextInt() * 3);
            System.out.println(king + ": How many provinces are there\t: ");
            int c = b + (nr.nextInt() * 6);
            System.out.println(king + "'s score is " + c);
        }
    }

}
