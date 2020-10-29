package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int start = 11;
        boolean first = false;
        System.out.println("На столе 11 спичек, можно взять не больше 3,\nвыиграет тот, кто заберет последние спички");
        while (run) {
            System.out.println("Сколько спичек убрать, от 1 до 3: ");
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select < 4) {
                if (start - select >= 0) {
                    start -= select;
                    first = !first;
                } else {
                    System.out.println("Вы хотите слишком многого, попробуйте еще");
                }
            } else {
                System.out.println("Введено неверное количество");
            }
            System.out.println("Количество спичек на столе " + start);
            if (start == 0) {
                String name = first ? "Один" : "Два";
                System.out.println("Игра окончена. Выиграл игрок " + name);
                run = false;
            }
        }
    }
}
