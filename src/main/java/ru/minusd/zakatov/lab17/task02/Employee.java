package ru.minusd.zakatov.lab17.task02;

public class Employee {
    private String name;
    private String role;
    private int id;
    private int salary;

    public Employee(String name, String role, int id, int salary) {
        this.name = name;
        this.role = role;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
