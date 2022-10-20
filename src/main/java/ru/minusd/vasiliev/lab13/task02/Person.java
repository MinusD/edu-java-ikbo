package ru.minusd.vasiliev.lab13.task02;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFullName() {
        if (lastName == null) return "";
        var stringBuilder = new StringBuilder();
        stringBuilder.append(lastName).append(' ');
        if (firstName != null) {
            stringBuilder.append(firstName.charAt(0)).append('.');
        }
        if (middleName != null) {
            stringBuilder.append(middleName.charAt(0)).append('.');
        }
        return stringBuilder.toString();
    }
}
