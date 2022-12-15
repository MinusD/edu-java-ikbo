package ru.minusd.zakatov.lab13.task05;

public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            countryCode = String.valueOf(phoneNumber.charAt(1));
            number = phoneNumber.substring(2);
        } else if (phoneNumber.startsWith("8")) {
            countryCode = "7";
            number = phoneNumber.substring(1);
        }
    }

    @Override
    public String toString() {
        String string = "+" + countryCode;
        string += number.substring(0, 3);
        string += '-' + number.substring(3, 6);
        string += '-' + number.substring(6);
        return string;
    }
}
