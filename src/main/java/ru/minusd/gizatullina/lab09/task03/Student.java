package ru.minusd.gizatullina.lab09.task03;

public class Student implements Comparable<Student> {
    private final Integer id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student st) {
        return this.id.compareTo(st.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "}\n";
    }
}