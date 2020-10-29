package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (var str : strings) {
            rsl.putIfAbsent(str.substring(0, 1), new ArrayList<>());
            var strs = rsl.get(str.substring(0, 1));
            strs.add(str);
        }
        return rsl;
    }
}