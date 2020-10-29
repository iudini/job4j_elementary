package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rides on the rails");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " has an electric engine");
    }
}
