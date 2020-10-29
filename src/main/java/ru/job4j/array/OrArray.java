package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rst = new int[left.length + right.length];
        int i = 0;
        for (int j : left) {
            rst[i] = j;
            i++;
        }
        for (int k : right) {
            boolean exist = false;
            for (int j = 0; j <= i; j++) {
                if (k == rst[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rst[i] = k;
                i++;
            }
        }
        return Arrays.copyOf(rst, i);
    }
}
