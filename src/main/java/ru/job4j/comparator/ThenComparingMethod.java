package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {

    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return this.name.compareTo(o.name);
        }
    }

    public static Comparator<User> thenComparing() {
        Comparator<User> comparator = ascByName();
        Comparator<User> merged = comparator.thenComparing(descByAge());
        return merged;
    }

    public static Comparator<User> ascByName() {
        Comparator<User> comparator = Comparator.naturalOrder();
        return comparator;
    }

    public static Comparator<User> descByAge() {
        Comparator<User> comparator = Comparator.reverseOrder();
        return comparator;
    }

}
