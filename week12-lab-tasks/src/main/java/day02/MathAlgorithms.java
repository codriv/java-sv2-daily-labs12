package day02;

public class MathAlgorithms {

    public static int divisor(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Number can not be 0!");
        }
        int num = Math.max(Math.abs(a), Math.abs(b));
        int divisor = 1;
        for (int i = 1; i < num / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
