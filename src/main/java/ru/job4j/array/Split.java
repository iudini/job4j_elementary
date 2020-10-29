package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int start = 0;
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[index] = splitInner(str, start, i);
                start = i + 1;
                index++;
            } else if (i == str.length - 1) {
                result[index] = splitInner(str, start, i + 1);
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    private static char[] splitInner(char[] str, int start, int finish) {
        char[] result = new char[finish - start];
        int j = 0;
        for (int i = start; i < finish; i++) {
            result[j] = str[i];
            j++;
        }
        return result;
    }
}
