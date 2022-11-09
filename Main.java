import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");                                            // Day 1
        System.out.println("Something besides 'Hello, World!'");                        // Day 2
        theMakingsOfAProgrammer();
        challengeConsolasAndTelim("placeholder name");
        //theThingNamer3000();                                                            // Day 3
        theVariableShop();                                                              // Day 4
        theVariableShopReturns();
    }

    private static void theVariableShopReturns() {
        byte abyte = 1;
        short ashort = 2;
        int anint = 3;
        long along = 4;
        float afloat = 5.0f;
        double adouble = 6.0;
        boolean aboolean = true;
        char achar = 7;
        System.out.println(abyte +1);
        System.out.println(ashort +2);
        System.out.println(anint + 3);
        System.out.println(along +4);
        System.out.println(afloat +5);
        System.out.println(adouble +6);
        System.out.println(!aboolean);
        System.out.println(achar +8);
    }

    private static void theVariableShop() {
        byte abyte = 1;
        short ashort = 2;
        int anint = 3;
        long along = 4;
        float afloat = 5.0f;
        double adouble = 6.0;
        boolean aboolean = true;
        char achar = 7;
        System.out.println(abyte);
        System.out.println(ashort);
        System.out.println(anint);
        System.out.println(along);
        System.out.println(afloat);
        System.out.println(adouble);
        System.out.println(aboolean);
        System.out.println(achar);
    }

    private static void theThingNamer3000() {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of thing are we talking about?\t: ");
        String a = input.next();    // stores object type
        System.out.println("How would you describe it? Big? Azure? Tattered?\t: ");
        String b = input.next();    // stores object description
        String c = "of Doom";
        String d = "3000";
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!"); // removed redundant "of"
    }

    private static void challengeConsolasAndTelim(String name) {
        System.out.println("A bread has been made for " + name);
    }

    private static void theMakingsOfAProgrammer() {
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ": A 'program' can contain many statements");
        }
    }
}
