package ru.minusd.vasiliev.lab17.task02;

public class MVCEmployee {
    public static void main(String[] args) {
        EmployeeModel model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("aboba1337");
        controller.updateView();
    }

    private static EmployeeModel retrieveEmployeeFromDatabase() {
        EmployeeModel employee = new EmployeeModel();
        employee.setName("Vasiliev");
        employee.setSalary(1000);
        employee.setHoursWorked(160);
        return employee;
    }
}
