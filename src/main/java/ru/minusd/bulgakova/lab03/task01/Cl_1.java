package ru.minusd.bulgakova.lab03.task01;

public class Cl_1 {
    private String name;
    private String email;
    private char gender;
    public Cl_1(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName() {return name;}

    public String getEmail() {return email;}

    public char getGender() {return gender;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Name: "+name+"\nEmail: "+email+"\nGender: "+gender;
    }
}

