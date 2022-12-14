package ru.minusd.vasiliev.lab03.task3;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иванов Иван Иванович", 1000);
        employees[1] = new Employee("Петров Петр Петрович", 2000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3000);
        Report.generateReport(employees);
    }
}
