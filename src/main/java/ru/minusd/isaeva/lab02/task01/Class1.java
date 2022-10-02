package ru.minusd.isaeva.lab02.task01;

public class Class1 {
    private String name;
    private String email;
    private char gender;

    public Class1(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
