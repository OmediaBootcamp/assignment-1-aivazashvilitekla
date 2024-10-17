package dev.omedia;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        int sumOfOdd = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println(i);
                sumOfOdd += i;
            }
        }
        return sumOfOdd;
    }
}
