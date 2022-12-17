package ru.minusd.gizatullina.lab10.task01;

public class Student {
    private String name;
    private String lastName;
    private String studies;
    private Integer course;
    private Integer group;

    public Student(String name, String lastName, String studies, Integer course, Integer group) {
        this.name = name;
        this.lastName = lastName;
        this.studies = studies;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudies() {
        return studies;
    }

    public Integer getCourse() {
        return course;
    }

    public Integer getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studies='" + studies + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
