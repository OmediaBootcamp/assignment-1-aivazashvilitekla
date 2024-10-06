package dev.omedia;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesInYear = 60 * 24 * 365;
            long minutesInDay = 60 * 24;
            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / minutesInDay;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
