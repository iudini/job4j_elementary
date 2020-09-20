package ru.job4j.condition;

public class SqArea {
    public static double height(int p, int k) {
        return p / (2 * (k + 1));
    }

    public static double length(double h, int k) {
        return h * k;
    }

    private static double square(double l, double h) {
        return l * h;
    }

    public static void main(String[] args) {
        int k = 2;
        int p = 6;
        double h = SqArea.height(p, k);
        double l = SqArea.length(h, k);
        double s = SqArea.square(l, h);
        System.out.println(" p = 6, k = 2, s = " + s + ", height = " + h + ", length = " + l);
    }
}