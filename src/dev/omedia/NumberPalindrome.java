package dev.omedia;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reversed = 0, lastDigit = 0;
        int startingNumber = number;
        while (startingNumber > 0) {
            lastDigit = startingNumber % 10;
            reversed = reversed * 10;
            reversed += lastDigit;
            startingNumber = startingNumber / 10;

        }
        return number == reversed;
    }
}
