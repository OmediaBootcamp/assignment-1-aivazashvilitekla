package dev.omedia;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int numberCopy = number;

        int lastDigit = 0, firstDigit = 0;
        lastDigit = number % 10;
        while (numberCopy > 0) {
            if (numberCopy <= 9) {
                firstDigit = numberCopy;
            }
            numberCopy /= 10;
        }
        return firstDigit + lastDigit;

    }
}
