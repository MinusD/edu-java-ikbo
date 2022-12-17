package ru.minusd.vasiliev.lab02.task1;

public class Test {
    public static void main(String[] args) {
        Author testObj = new Author("Author", "aaa@yyy.ru", 'm');
        System.out.println(testObj.getName());
        System.out.println(testObj.getEmail());
        System.out.println(testObj.getGender());
        testObj.setEmail("bbb@zzz.com");
        System.out.println(testObj.getEmail());
        System.out.println(testObj);
    }
}
