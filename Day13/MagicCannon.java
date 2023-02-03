package Day13;

public class MagicCannon {
    public static void main(String[] args) {
        theMagicCannon();
    }

    private static void theMagicCannon() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("\u001B[34m" + i + ": Combo Blast!");
            } else if (i % 3 == 0) {
                System.out.println("\u001B[33m" + i + ": Fire Blast!");
            } else if (i % 5 == 0) {
                System.out.println("\u001B[31m" + i + ": Electric Blast!");
            } else {
                System.out.println("\u001B[0m" + i + ": Regular Boom!");
            }
        }
    }

}
