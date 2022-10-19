package ru.minusd.vasiliev.lab13.task04;

public class Test {
    public static void main(String[] args) {
        var shirts = new String[] {
                "S001, Black Polo Shirt, Black, XL",
                "S002, Black Polo Shirt, Black, L",
                "S003, Blue Polo Shirt, Blue, XL",
                "S004, Blue Polo Shirt, Blue, M",
                "S005, Tan Polo Shirt, Tan, XL",
                "S006, Black T-Shirt, Black, XL",
                "S007, White T-Shirt, White, XL",
                "S008, White T-Shirt, White, L",
                "S009, Green T-Shirt, Green, S",
                "S010, Orange T-Shirt, Orange, S",
                "S011, Maroon Polo Shirt, Maroon, S"
        };
        for (var shirt : shirts) {
            var shirtData = new Shirt(shirt);
            System.out.println(shirtData);
            System.out.println("--------");
        }
    }
}
