package ru.minusd.vasiliev.lab19.task02;

public class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void findStudent(String name) {
        try {
            var student = labClass.getStudentByName(name);
            System.out.println(student);
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printStudents() {
        for (var student : labClass.getStudents()) {
            System.out.println(student);
        }
    }

    public void sortStudents() {
        labClass.getStudents().sort(Student::compareTo);
    }
}
