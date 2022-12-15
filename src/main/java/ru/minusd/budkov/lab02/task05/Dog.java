package ru.minusd.budkov.lab02.task05;

public class Dog {
    private int age;
    private String name;

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int manAge(){
        return age * 7;
    }

    public String toString(){
        return "name: " + this.getName() + " age: " + this.getAge();
    }
}