package ru.minusd.vasiliev.lab13.task05;

public class PhoneFormat {
    public static String format(String phone) {
        char code;
        if (phone.startsWith("+")) {
            phone = phone.substring(1);
            code = phone.charAt(0);
        } else {
            code = phone.charAt(0);
            if (code == '8') {
                code = '7';
            }
        }
        var builder = new StringBuilder();
        builder.append("+")
                .append(code)
                .append(phone.substring(1, 4))
                .append("-")
                .append(phone.substring(4, 7))
                .append("-")
                .append(phone.substring(7, 11));
        return builder.toString();
    }
}
