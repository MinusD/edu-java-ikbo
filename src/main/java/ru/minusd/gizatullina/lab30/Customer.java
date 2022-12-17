package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public final class Customer implements Serializable {
    private String firstName;
    private String secondName;
    private Address address;
    private int age;
    private static Customer MATURE_UNKNOWN_CUSTOMER = new Customer("Unknown", "Unknown", Address.EMPTY_ADDRESS, 21);
    private static Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("Unknown", "Unknown", Address.EMPTY_ADDRESS, 17);
    public Customer(String firstName, String secondName, Address address, int age) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if (secondName == null || secondName.isEmpty()) {
            throw new IllegalArgumentException("Second name cannot be empty");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be less than or equal to zero");
        }
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public Address getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
}