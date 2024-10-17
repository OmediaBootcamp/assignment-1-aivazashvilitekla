package dev.omedia;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if ((bigCount * 5) >= goal) {
            int remainder = goal % 5;
            if (smallCount >= remainder) {
                return true;
            }
        } else {
            if (smallCount >= goal - (bigCount * 5)) {
                return true;
            }
        }
        return false;
    }
}
