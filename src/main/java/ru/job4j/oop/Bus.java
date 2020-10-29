package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving on highways");
    }

    @Override
    public void engine() {
        System.out.println(getClass().getSimpleName() + " has an internal combustion engine");
    }
}
