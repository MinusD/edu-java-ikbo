package ru.minusd.gizatullina.lab13.task03;

import java.util.StringTokenizer;

public class task3 {
    private String country;
    private String district;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public task3(String country, String district, String city, String street, String house, String building, String flat) {
        this.country = country;
        this.district = district;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "address{" +
                "country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public task3(String address, boolean method) {
        if (method) {
            String[] parts = address.split(", ");
            this.country = parts[0];
            this.district = parts[1];
            this.city = parts[2];
            this.street = parts[3];
            this.house = parts[4];
            this.building = parts[5];
            this.flat = parts[6];
        }
        else {
            StringTokenizer parts = new StringTokenizer(address, " ,.;");
            this.country = parts.nextToken();
            this.district = parts.nextToken();
            this.city = parts.nextToken();
            this.street = parts.nextToken();
            this.house = parts.nextToken();
            this.building = parts.nextToken();
            this.flat = parts.nextToken();
        }
    }

    public static void main(String[] args) {
        String str1 = "Russia, Bashkortostan, Bakaly, Kirillovoy, 64, 2, 3";
        task3 addr1 = new task3(str1, true);
        String str2 = "England, Buryatia; Azov, Podolskaya. 89; 5. 6";
        task3 addr2 = new task3(str2, false);
        String str3 = "Estonia, Kalmykia. Aksai. Lenina. 3. 8. 1";
        task3 addr3 = new task3(str3, false);
        String str4 = "Finland; Dagestan; Aznakayevo; Stalina. 34. 6; 4";
        task3 addr4 = new task3(str4, false);
        System.out.println(addr1.toString());
        System.out.println(addr2.toString());
        System.out.println(addr3.toString());
        System.out.println(addr4.toString());
    }
}
