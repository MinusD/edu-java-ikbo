package ru.minusd.gizatullina.lab04.task03;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Gizatullina Alsu Ilnurovna", 9000);
        employees[1] = new Employee("Lupominodin Misha Himanovich", 3974);
        employees[2] = new Employee("Nanitovarin Ilya Maratovich", 854);
        Report.generateReport(employees);
    }
}
