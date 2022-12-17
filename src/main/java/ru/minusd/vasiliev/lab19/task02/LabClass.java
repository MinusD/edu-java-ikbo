package ru.minusd.vasiliev.lab19.task02;

import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByName(String name) throws EmptyStringException, StudentNotFoundException {
        if (name.equals("")) {
            throw new EmptyStringException("Имя не может быть пустой строкой");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + name + " не найден");
    }
}
