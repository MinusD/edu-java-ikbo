package ru.minusd.bajdak.lab02.task05;

public class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAhe() {
        return age * 7;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
