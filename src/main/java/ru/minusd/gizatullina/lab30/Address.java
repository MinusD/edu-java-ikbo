package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public final class Address implements Serializable {
    private String cityName;
    private String streetName;
    private int buildingNumber;
    private int apartmentNumber;
    private int zipCode;
    private char buildingLetter;
    public static Address EMPTY_ADDRESS = new Address("", "", 0, 0, 0, ' ');
    public Address(String cityName, String streetName, int buildingNumber, int apartmentNumber, int zipCode, char buildingLetter) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.zipCode = zipCode;
        this.buildingLetter = buildingLetter;
    }
    public String getCityName() {
        return cityName;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getBuildingNumber() {
        return buildingNumber;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public int getZipCode() {
        return zipCode;
    }
    public char getBuildingLetter() {
        return buildingLetter;
    }
}