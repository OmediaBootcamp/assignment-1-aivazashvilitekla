package dev.omedia;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2) {
        int firstRounded = (int) (parameter1 * 1000);
        int secondRounded = (int) (parameter2 * 1000);

        return firstRounded == secondRounded;
    }
}
