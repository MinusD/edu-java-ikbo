package ru.minusd.zakatov.lab27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> names = createMap();
        System.out.println(getSameFirstNameCount(names));
        System.out.println(getSameSecondNameCount(names));
    }

    public static Map<String, String> createMap() {
        String[] names = new String[] {
                "Харитонов Дмитрий",
                "Шубин Гордей",
                "Михайлов Андрей",
                "Савин Максим",
                "Матвеева Зоя",
                "Федотов Андрей",
                "Петрова Диана",
                "Третьяков Руслан",
                "Комиссаров Игорь",
                "Парфенов Глеб"
        };
        Map<String, String> map = new HashMap<>();
        for (String name : names) {
            String[] s = name.split(" ");
            map.put(s[0], s[1]);
        }

        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> names) {
        int countUniqueNames = 0;
        Collection<String> values = names.values();

        for (var name : names.entrySet()) {
            if (values.stream().filter(firstName -> firstName.equals(name.getValue())).count() == 1) {
                countUniqueNames++;
            }
        }

        return names.size() - countUniqueNames;
    }

    public static int getSameSecondNameCount(Map<String, String> names) {
        int countUniqueNames = 0;
        Collection<String> keys = names.keySet();

        for (var name : names.entrySet()) {
            if (keys.stream().filter(secondName -> secondName.equals(name.getKey())).count() == 1) {
                countUniqueNames++;
            }
        }

        return names.size() - countUniqueNames;
    }
}
