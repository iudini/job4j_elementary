package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int i = 0;
        for (int leftNum : left) {
            for (int rightNum : right) {
                if (leftNum == rightNum) {
                    rsl[i] = leftNum;
                    i++;
                }
            }
        }
        return Arrays.copyOf(rsl, i);
    }
}
