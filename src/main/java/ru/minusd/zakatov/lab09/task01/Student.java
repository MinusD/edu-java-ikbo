package ru.minusd.zakatov.lab09.task01;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private int gpa;

    public Student(int id, String name, int age, int gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public int getGpa() {
        return gpa;
    }
}
