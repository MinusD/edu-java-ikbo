package ru.minusd.vasiliev.lab31.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Address {
    private final String cityName;
    private final int zipCode;
    private final String streetName;
    private final int buildingNumber;
    private final char buildingLetter;
    private final int apartmentNumber;

    public static final Address EMPTY_ADDRESS = new Address(null, 0, null, 0, ' ', 0);

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public static Address fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return Address.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Address fromString(String state) {
        return new Address(
                state.split("cityName=")[1].split(",")[0],
                Integer.parseInt(state.split("zipCode=")[1].split(",")[0]),
                state.split("streetName=")[1].split(",")[0],
                Integer.parseInt(state.split("buildingNumber=")[1].split(",")[0]),
                state.split("buildingLetter=")[1].split(",")[0].charAt(0),
                Integer.parseInt(state.split("apartmentNumber=")[1].split("}")[0])
        );
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", buildingLetter=" + buildingLetter +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}
