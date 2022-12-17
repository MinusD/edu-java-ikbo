package ru.minusd.gizatullina.lab10.task01;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Egor","Abramov","proramIngineering",3,8);
        Student student2 = new Student("Alsu","Gizatullina","proramIngineering",2,1);
        Student student3 = new Student("Katya","Goncharova","proramIngineering",1,30);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
