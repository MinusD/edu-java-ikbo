package ru.minusd.zakatov.lab21.task5;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestSolution {
    public static void main(String[] args) {
        Solution<String, Integer, Double> three = new Solution<>("Hello, world!", 3, 1.4);
        System.out.println(three);

        List<Integer> nums = Solution.newArrayList(4, 1, 4, 1, 41, -1, 3);
        Set<Character> chars = Solution.newHashSet('a', '-', '_', '3');
        Map<Integer, String> english = Solution.newHashMap(
                Map.entry(10, "ten"),
                Map.entry(5, "five"),
                Map.entry(15, "fifteen"),
                Map.entry(1, "one")
        );

        System.out.print("Nums: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }

        System.out.print("\nChars: ");
        for (var i : chars)
            System.out.print(i + " ");

        System.out.println("\nMap:");
        for (var entry : english.entrySet()) {
            System.out.printf("%d -> %s\n", entry.getKey(), entry.getValue());
        }
    }
}
