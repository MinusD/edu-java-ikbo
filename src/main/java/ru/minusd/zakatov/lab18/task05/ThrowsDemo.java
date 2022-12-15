package ru.minusd.zakatov.lab18.task05;

public class ThrowsDemo {
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }

        return "data for " + key;
    }

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.printMessage("goitu");
        } catch (Exception e) {
            System.out.println("key is null");
        }
    }
}
