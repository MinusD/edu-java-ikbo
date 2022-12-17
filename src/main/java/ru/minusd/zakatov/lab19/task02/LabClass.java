package ru.minusd.zakatov.lab19.task02;

import ru.minusd.zakatov.lab19.task02.exceptions.EmptyStringException;
import ru.minusd.zakatov.lab19.task02.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String name) throws StudentNotFoundException, EmptyStringException {
        if (name.isEmpty()) {
            throw new EmptyStringException("The name can't be empty!");
        }

        for (Student s : students) {
            if (s.getName().trim().contains(name)) {
                return s;
            }
        }

        throw new StudentNotFoundException(String.format("Student with name %s not found", name));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < students.size(); i++) {
            sb.append(String.format("%d: %s\n", i + 1, students.get(i)));
        }

        return sb.toString();
    }
}
