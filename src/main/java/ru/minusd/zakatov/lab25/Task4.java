package ru.minusd.zakatov.lab25;

public class Task4 {
    public static void main(String[] args) {
        String exp = "(3+2) + ()()";

        System.out.println(checkRightBraces(exp));
    }

    private static boolean checkRightBraces(String s) {
        return 0 == s.chars()
                .mapToObj(Character::toString)
                .filter("()"::contains)
                .map("("::equals)
                .mapToInt(b -> b ? 1 : -1)
                .reduce(0, (x, y) -> (x >= 0 && x + y >= 0) ? x + y : -1);
    }
}

