package ru.minusd.vasiliev.lab13.task03;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int house;
    private int corpus;
    private int apartment;

    public void setAddressOnlyComma(String addr) {
        var address = addr.split(", ");
        country = address[0];
        region = address[1];
        city = address[2];
        street = address[3];
        house = Integer.parseInt(address[4]);
        corpus = Integer.parseInt(address[5]);
        apartment = Integer.parseInt(address[6]);
    }

    public void setAddress(String addr) {
        var tokenizer = new StringTokenizer(addr, ",.;");
        country = tokenizer.nextToken();
        region = tokenizer.nextToken().replaceFirst(" ", "");
        city = tokenizer.nextToken().replaceFirst(" ", "");
        street = tokenizer.nextToken().replaceFirst(" ", "");
        house = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
        corpus = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
        apartment = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
    }

    public String toString() {
        return "Адрес: " + country + ", " + region + ", " + city + ", " + street + ", " + house + ", " + corpus + ", " + apartment;
    }
}
