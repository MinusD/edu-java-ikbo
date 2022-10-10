package ru.minusd.marov.lab03.task05;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int DageH(){
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
