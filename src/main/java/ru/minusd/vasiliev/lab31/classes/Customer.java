package ru.minusd.vasiliev.lab31.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Customer {
    private final String firstName;
    private final String secondName;
    private final int age;
    private final Address address;

    public static final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 18, Address.EMPTY_ADDRESS);
    public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 16, Address.EMPTY_ADDRESS);

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public static Customer fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return Customer.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Customer fromString(String state) {
        return new Customer(
                state.split("firstName='")[1].split("'")[0],
                state.split("secondName='")[1].split("'")[0],
                Integer.parseInt(state.split("age=")[1].split(",")[0]),
                Address.fromString(state.split("address=Address\\{")[1].split("}")[0])
        );
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
