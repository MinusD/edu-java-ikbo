package ru.minusd.gizatullina.lab10.task02;

public class Student implements Comparable<Student> {
    private final Integer id;
    private final Integer gpa;
    public Student(int id, int gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Integer getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student st) {
        return this.id.compareTo(st.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                "}\n";
    }
}
