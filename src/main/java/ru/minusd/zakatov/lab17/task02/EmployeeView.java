package ru.minusd.zakatov.lab17.task02;

public class EmployeeView {
    public void printEmployeeSalary(String name, String role, int employeeId, int period, int salary) {
        System.out.println("Employee " + employeeId + ":");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary for the period " + period + ": " + salary + "$");
    }
}
