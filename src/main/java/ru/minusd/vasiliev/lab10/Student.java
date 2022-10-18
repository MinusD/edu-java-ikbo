package ru.minusd.vasiliev.lab10;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setId(int id) {
        this.id = id;
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
