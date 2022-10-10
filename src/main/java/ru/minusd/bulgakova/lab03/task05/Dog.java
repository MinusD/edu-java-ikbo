package ru.minusd.bulgakova.lab03.task05;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int humanAge(){
        return age*7;
    }

    @Override
    public String toString(){
        return "Dog: name - "+name+", age - "+age+", humanAge - "+humanAge()+";";
    }
}

