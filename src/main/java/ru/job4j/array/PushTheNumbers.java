package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < row; i++) {
            array[i][column] = array[i + 1][column];
        }
        for (int i = array.length - 1; i > row; i--) {
            array[i][column] = array[i - 1][column];
        }
        for (int i = 0; i < column; i++) {
            array[row][i] = array[row][i + 1];
        }
        for (int i = array.length - 1; i > column; i--) {
            array[row][i] = array[row][i - 1];
        }
        array[row][column] = 0;
    }

}
