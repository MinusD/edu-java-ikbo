package ru.minusd.vasiliev.lab03.task1;

public class PractTwo {
    public static void main(String[] args) {
        PractOne testObj = new PractOne("Author", "aaa@yyy.ru", 'm');
        System.out.println(testObj.getName());
        System.out.println(testObj.getEmail());
        System.out.println(testObj.getGender());
        testObj.setEmail("bbb@zzz.com");
        System.out.println(testObj.getEmail());
        System.out.println(testObj);
    }
}
