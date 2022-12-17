package ru.minusd.gizatullina.lab17.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase(){
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter employee name:");
        String n= scan.nextLine();
        employee.setName(n);
        System.out.println("Enter employee rate:");
        Integer b= scan.nextInt();
        employee.setRate(b);
        System.out.println("Enter employee hours:");
        Integer c= scan.nextInt();
        employee.setHours(c);
        return employee;
    }

}