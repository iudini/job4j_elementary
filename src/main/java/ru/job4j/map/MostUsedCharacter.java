package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        TreeMap<Character, Integer> map = new TreeMap<>();
        char rsl = ' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            map.computeIfPresent(str.charAt(i), (key, value) -> value + 1);
            map.putIfAbsent(str.charAt(i), 1);
        }
        for (Character key : map.keySet()) {
            if (map.get(key) > count) {
                rsl = key.charValue();
                count = map.get(key);
            }
        }
        return rsl;
    }
}