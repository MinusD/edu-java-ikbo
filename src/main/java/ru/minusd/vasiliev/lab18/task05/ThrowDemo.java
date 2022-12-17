package ru.minusd.vasiliev.lab18.task05;

public class ThrowDemo {
    public static void main(String[] args) {
        printMessage("id0");
        printMessage(null);
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println("null key in getDetails");
        }
    }
    public static String getDetails(String key) {
        if(key == null)
        {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
