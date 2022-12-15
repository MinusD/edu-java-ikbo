package ru.minusd.zakatov.lab19.task02;

import java.util.Comparator;

public class LabClassDriver implements Comparator<Student> {
    private String type;

    public LabClassDriver(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (type.equals("name")) {
            return o1.getName().compareTo(o2.getName());
        } else if (type.equals("gpa")) {
            return Integer.compare(o1.getGpa(), o2.getGpa());
        }

        return o1.compareTo(o2);
    }
}
