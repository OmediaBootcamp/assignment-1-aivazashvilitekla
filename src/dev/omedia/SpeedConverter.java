package dev.omedia;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long calculatedMilesPerHour = toMilesPerHour(kilometersPerHour);
        if (calculatedMilesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + calculatedMilesPerHour + " mi/h");
        }
    }
}
