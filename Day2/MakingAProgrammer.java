package Day2;

public class MakingAProgrammer {
    public static void main(String[] args) {
        System.out.println("Something besides 'Hello, World!'");
        theMakingsOfAProgrammer();
        challengeConsolasAndTelim("placeholder name");
    }

    private static void challengeConsolasAndTelim(String name) {
        System.out.println("A bread has been made for " + name);
    }

    private static void theMakingsOfAProgrammer() {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ": A 'program' can contain many statements");
        }
    }

}
