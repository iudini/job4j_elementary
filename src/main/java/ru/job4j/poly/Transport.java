package ru.job4j.poly;

public interface Transport {
    void ride();

    void pax(int paxNumbers);

    double fill(int fuelAmount);
}
