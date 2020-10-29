package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int count = 0;
        for (var i : data) {
            if (i > 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return false;
        } else if ((data.length - count) % 2 != 0) {
            return true;
        }
        return false;
    }
}