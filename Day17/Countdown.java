package Day17;

public class Countdown {
    public static void main(String[] args) {
        countDown(10);
    }

    private static void countDown(int highest) {
        System.out.println(highest);
        if (highest > 0) {
            countDown(highest - 1);
        }
    }

}
