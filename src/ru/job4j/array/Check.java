package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean i : data) {
            if (i != data[0]) {
                return false;
            }
        }
        return true;
    }
}
