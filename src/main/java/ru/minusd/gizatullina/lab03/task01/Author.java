package ru.minusd.gizatullina.lab03.task01;

public class Author {
    public Author(String name,String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
