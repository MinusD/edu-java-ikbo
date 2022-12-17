package ru.minusd.vasiliev.lab18.task06;

public class ThrowDemo {
    public static void main(String[] args) {
        printMessage("id0");
        printMessage(null);
    }

    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        if(key == null)
        {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
