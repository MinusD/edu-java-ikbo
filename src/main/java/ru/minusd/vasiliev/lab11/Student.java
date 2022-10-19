package ru.minusd.vasiliev.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthdate;
    private int id;
    private int average;

    public Student(String name, int id, int average, Date birthdate) {
        this.name = name;
        this.id = id;
        this.average = average;
        this.birthdate = birthdate;
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

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", average=" + average +
                '}';
    }

    public String toString(String dateFormat) {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", average=" + average +
                ", birthdate='" + new SimpleDateFormat(dateFormat).format(birthdate) +
                "'}";
    }
}
