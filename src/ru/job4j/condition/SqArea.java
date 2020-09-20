package ru.job4j.condition;

public class SqArea {
    public static double height(int p, int k) {
        return p / (2 * (k + 1));
    }

    public static void main(String[] args) {
        int k = 2;
        int p = 6;
        double h = SqArea.height(p, k);
        double l = h * k;
        double s = l * h;
        System.out.println(" p = 6, k = 2, s = " + s + ", height = " + h + ", length = " + l);
    }
}