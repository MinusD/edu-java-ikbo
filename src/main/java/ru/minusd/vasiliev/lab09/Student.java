package ru.minusd.vasiliev.lab09;

public class Student{
    private String name;
    private int id;
    private int average;

    public Student(String name, int id, int average) {
        this.name = name;
        this.id = id;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", average=" + average +
                '}';
    }
}
