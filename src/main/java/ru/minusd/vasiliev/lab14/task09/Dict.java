package ru.minusd.vasiliev.lab14.task09;

import java.util.HashMap;

public class Dict {
    public static void main(String[] args) {
        var dict = new HashMap<Character, Integer>();
        var text = "Пельмени. Хорошие пельмени — это очень вкусно. На самом деле, рецепт простой — много мяса, мало теста. Сперва готовим тонкое яичное тесто, с добавлением сливочного масла. Лук сладких сортов, для образования бульончика, и перец — совсем немного. Щедро выкладываем великолепный рубленый фарш, много мяса, мало теста. Вот он — настоящий пельмень, а внутри много сочной начинки; грудинка индюшки с курицей или телятина со свининой. Думаю, многие и забыли, как это может быть вкусно. Выбирайте и наслаждайтесь — пельмени флопские. Много мяса, мало теста.";
        for (var c : text.toCharArray()) {
            if (!Character.isAlphabetic(c)) continue;
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
            } else {
                dict.put(c, 1);
            }
        }
        System.out.println(dict);
    }
}
