package ru.minusd.gizatullina.lab17.task02;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }
    public void setEmployeeRate(int rate){
        model.setRate(rate);
    }
    public int getEmployeeRate(){
        return model.getRate();
    }
    public void setEmployeeHours(int hours){
        model.setHours(hours);
    }
    public int getEmployeeHours(){
        return model.getHours();
    }
    public void updateView(){
        view.print(model.getName(),
                model.getRate(), model.getHours());
    }
}