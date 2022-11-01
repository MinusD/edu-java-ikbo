package ru.minusd.vasiliev.lab17.task02;

public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeeSalary(int salary){
        model.setSalary(salary);
    }

    public int getEmployeeSalary(){
        return model.getSalary();
    }

    public void setEmployeeHoursWorked(int hoursWorked){
        model.setHoursWorked(hoursWorked);
    }

    public int getEmployeeHoursWorked(){
        return model.getHoursWorked();
    }

    public int getEmployeeTotalSalary(){
        return model.getSalary() * model.getHoursWorked();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getSalary(), model.getHoursWorked());
    }
}
