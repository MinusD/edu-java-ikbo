package ru.minusd.gizatullina.lab19.task02;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);
        try {
            ui.run();
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
