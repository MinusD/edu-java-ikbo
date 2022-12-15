package ru.minusd.zakatov.lab19.task02;

import ru.minusd.zakatov.lab19.task02.exceptions.EmptyStringException;
import ru.minusd.zakatov.lab19.task02.exceptions.StudentNotFoundException;

import java.util.Scanner;

public class LabClassUI {
    private static Scanner in;
    private static LabClass labClass;

    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        in = new Scanner(System.in);
        labClass = new LabClass();
        labClass.addStudent(new Student(3, "Igor", 19, 100));
        labClass.addStudent(new Student(1, "Sveta", 19, 80));
        labClass.addStudent(new Student(5, "Dima", 20, 180));
        labClass.addStudent(new Student(8, "Katya", 18, 120));

        int command;
        do {
            System.out.println("\nStudents");
            System.out.println(labClass);
            System.out.print("Enter command (0 - exit, 1 - search, 2 - sort): ");
            command = in.nextInt();

            switch (command) {
                case 1 -> search();
                case 2 -> sort();
            }
        } while (command != 0);
    }

    private static void search() throws EmptyStringException, StudentNotFoundException {
        System.out.print("Enter name: ");
        in.nextLine();
        String name = in.nextLine();

        Student student = labClass.getStudent(name);
        System.out.println("Student: " + student);
    }

    private static void sort() {
        System.out.print("Enter sort's type (1 - name, 2 - gpa): ");
        int sortType = in.nextInt();
        LabClassDriver driver = new LabClassDriver(sortType == 1 ? "name" : "gpa");
        labClass.getStudents().sort(driver);
    }
}
