package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rst = new int[left.length + right.length];
        int size = 0;
        for (int i = 0; i < left.length; i++) {
            boolean exist = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    exist = !exist;
                    break;
                }
            }
            if (exist) {
                rst[size] = left[i];
                size++;
            }
        }
        return Arrays.copyOf(rst, size);
    }
}
