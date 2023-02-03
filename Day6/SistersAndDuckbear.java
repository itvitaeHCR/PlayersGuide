package Day6;

import java.util.Scanner;

public class SistersAndDuckbear {
    public static void main(String[] args) {
        theFourSistersAndTheDuckbear();
        // wanneer krijgt de Duckbear meer dan de Sisters?
    }

    private static void theFourSistersAndTheDuckbear() {
        Scanner nr = new Scanner(System.in);
        System.out.println("how many eggs are there\t: ");
        int a = nr.nextInt();
        int b = a / 4;
        int c = a % 4;
        System.out.println("Each sister gets " + b + " eggs and the Duckbear gets " + c + " eggs.");
    }

}
