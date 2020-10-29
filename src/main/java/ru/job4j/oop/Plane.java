package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + "  is flying in the sky");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " has a turbo fun engine");
    }
}
