import Day18.BossBattle;

import javax.crypto.Cipher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ManticoreHP = 10;
        int ConsolasHP = 15;
        int round = 1;

        BossBattle.bossBattling(ManticoreHP, ConsolasHP, round);
    }
}
