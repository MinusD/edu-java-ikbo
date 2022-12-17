package ru.minusd.vasiliev.lab17.task01;

public class MVCDemo {
    public static void main(String[] args) {
        StudentModel model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("amogus");

        controller.updateView();
    }

    private static StudentModel retrieveStudentFromDatabase() {
        StudentModel student = new StudentModel();
        student.setName("Aboba");
        student.setRollNo("99");
        return student;
    }
}
