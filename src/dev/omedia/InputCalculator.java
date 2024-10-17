package dev.omedia;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        long avg = 0;
        while (true) {
            boolean nextEntry = scanner.hasNextInt();
            if (!nextEntry) {
                break;
            }

            sum += scanner.nextInt();
            counter++;
            scanner.nextLine();


        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
    }
}
