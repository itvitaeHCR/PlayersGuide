package Day5;

import java.util.Scanner;

public class VariableShopReturns {
    public static void main(String[] args) {
        theVariableShopReturns();
        theTriangleFarmer();
    }

    private static void theTriangleFarmer() {
        Scanner nr = new Scanner(System.in);
        System.out.println("give base in cm\t: ");
        int a = nr.nextInt();
        System.out.println("give height in cm\t: ");
        int b = nr.nextInt();
        double area = (a * b) / 2.0;
        System.out.println("the area is " + area + "cm^2");
    }

    private static void theVariableShopReturns() {
        byte aByte = 1;
        short aShort = 2;
        int anInt = 3;
        long aLong = 4;
        float aFloat = 5.0f;
        double aDouble = 6.0;
        boolean aBoolean = true;
        char aChar = 7;
        System.out.println(aByte + 1);
        System.out.println(aShort + 2);
        System.out.println(anInt + 3);
        System.out.println(aLong + 4);
        System.out.println(aFloat + 5);
        System.out.println(aDouble + 6);
        System.out.println(!aBoolean);
        System.out.println(aChar + 8);
    }

}
