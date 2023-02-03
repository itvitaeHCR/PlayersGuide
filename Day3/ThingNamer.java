package Day3;

import java.util.Scanner;

public class ThingNamer {
    public static void main(String[] args) {
        theThingNamer3000();
    }

    private static void theThingNamer3000() {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of thing are we talking about?\t: ");
        String a = input.next();                                                        // stores object type
        System.out.println("How would you describe it? Big? Azure? Tattered?\t: ");
        String b = input.next();                                                        // stores object description
        String c = "of Doom";
        String d = "3000";
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!");             // removed redundant "of"
    }
}
