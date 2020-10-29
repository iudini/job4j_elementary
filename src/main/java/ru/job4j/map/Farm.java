package ru.job4j.map;

import java.util.*;
import java.util.stream.Stream;

public class Farm {
    public static int sumLegs(Map<Animal, Integer> data) {
        List<Integer> re = Arrays.asList(3, 2, 1, null);
        re.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        int sum = 0;
        for (var cow : data.entrySet()) {
            sum += cow.getValue() * cow.getKey().legs;
        }
        return sum;
    }

    public static class Animal {
        private String name;

        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}