package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int k : name.keySet()) {
            name.computeIfPresent(k, (key, value) -> value + " " + surname.get(k));
        }
        return name;
    }
}