package ru.minusd.vasiliev.lab03.task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (var employee: employees) {
            System.out.printf("%30.30s \t %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
