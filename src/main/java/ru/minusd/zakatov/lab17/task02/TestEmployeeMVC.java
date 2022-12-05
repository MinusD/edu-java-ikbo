package ru.minusd.zakatov.lab17.task02;

import java.util.Scanner;

public class TestEmployeeMVC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee employee = retrieveEmployee();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(employee, view);

        System.out.print("Enter period for calculation: ");
        int period = in.nextInt();

        controller.calculateSalary(period);
        controller.updateView();
    }

    private static Employee retrieveEmployee() {
        Employee employee = new Employee();
        employee.setName("Igor");
        employee.setRole("Back-end developer");
        employee.setId(1);
        employee.setSalary(1500);

        return employee;
    }
}
