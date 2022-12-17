package ru.minusd.vasiliev.lab17.task02;

public class EmployeeView {
    public void printEmployeeDetails(String employeeName, int employeeSalary, int employeeHoursWorked){
        System.out.println("Employee: ");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Hours worked: " + employeeHoursWorked);
        System.out.println("Total salary: " + employeeSalary * employeeHoursWorked);
    }
}
