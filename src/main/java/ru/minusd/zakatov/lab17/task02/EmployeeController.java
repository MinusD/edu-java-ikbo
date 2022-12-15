package ru.minusd.zakatov.lab17.task02;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    private int period;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeRole(String role) {
        model.setRole(role);
    }

    public String getEmployeeRole() {
        return model.getRole();
    }

    public void setEmployeeId(int id) {
        model.setId(id);
    }

    public int getEmployeeId() {
        return model.getId();
    }

    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    public int getEmployeeSalary() {
        return model.getSalary();
    }

    public void calculateSalary(int period) {
        this.period = period;
        model.setSalary(period * getEmployeeSalary());
    }

    public void updateView() {
        view.printEmployeeSalary(getEmployeeName(), getEmployeeRole(), getEmployeeId(), period, getEmployeeSalary());
    }
}
