package ru.job4j.array;

import java.util.Arrays;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num % prizes.length == 0) {
            return prizes[prizes.length - 1];
        } else {
            return prizes[num % prizes.length - 1];
        }
    }
}
