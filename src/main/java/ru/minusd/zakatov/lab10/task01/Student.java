package ru.minusd.zakatov.lab10.task01;

public class Student {
    private String firstName;
    private String lastName;
    private String specialization;
    private int course;
    private String group;
    private int gpa;

    public Student(String firstName, String lastName, int course, int gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = "software engineering";
        this.course = course;
        this.group = "ИКБО-01-" + (23 - course);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + firstName + ' ' + lastName + '\'' +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() { return firstName + ' ' + lastName; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
