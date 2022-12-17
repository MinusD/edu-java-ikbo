package ru.minusd.gizatullina.lab27;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Смирнов", "Сергей");
        map.put("Луковников", "Сергей");
        map.put("Мишин", "Петр");
        map.put("Терентьев", "Сергей");
        map.put("Бабыкин", "Петр");
        map.put("Димидов", "Иван");
        map.put("Цаплин", "Иван");

        return map;
    }
    public static int getSameFirstNameCount(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }
    public static int getSameLastNameCount(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Map<String, String> map;
        map = createMap();
        System.out.println(map);
        System.out.print("Количество людей с именем Иван: ");
        System.out.println(getSameFirstNameCount((HashMap<String, String>) map, "Иван"));
        System.out.print("Количество людей с фамилией Петров: ");
        System.out.println(getSameLastNameCount((HashMap<String, String>) map, "Петров"));
    }
}