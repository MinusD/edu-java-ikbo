package pack3;

import java.util.Scanner;


public class Main {
    private static int size;
    private static Employee[] employees;

    public static void main(String[] args) {
        String name;
        double salary;
        System.out.print("Input count of employees: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        employees = new Employee[size];
        for(int i = 0; i<size; i++)
        {
            Employee employee = new Employee();
            System.out.print("Input name: ");
            name = s.next();
            employee.setFullname(name);
            System.out.print("Input salary: ");
            salary = s.nextDouble();
            employee.setSalary(salary);
            employees[i] = employee;
        }
        Report r = new Report();
        r.generateReport(employees,size);
    }
}