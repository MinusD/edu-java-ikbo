package ru.minusd.zakatov.lab13.task03;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String address) {
        String[] tokens = Arrays.stream(address.split(",")).map(String::trim).toArray(String[]::new);
        country = tokens[0];
        region = tokens[1];
        city = tokens[2];
        street = tokens[3];
        house = tokens[4];
        building = tokens[5];
        apartment = tokens[6];
    }

    public Address(String address, String delim) {
        StringTokenizer tokens = new StringTokenizer(address, delim);
        country = tokens.nextToken().trim();
        region = tokens.nextToken().trim();
        city = tokens.nextToken().trim();
        street = tokens.nextToken().trim();
        house = tokens.nextToken().trim();
        building = tokens.nextToken().trim();
        apartment = tokens.nextToken().trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
