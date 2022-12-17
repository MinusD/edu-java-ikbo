package ru.minusd.gizatullina.lab17.task02;

public class EmployeeView {
    public void print(String name, int rate, int hours){
        System.out.println("Employee " + name + " earned " + rate * hours);
    }
}
