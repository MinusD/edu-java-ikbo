package ru.minusd.bajdak.lab02.task05;

public class Tester {
    public static void main(String[] args) {
        var dog1 = new Dog("Adnray", 2);
        var dog2 = new Dog("Dani", 6);
        var dog3 = new Dog("Loxsc", 12);
        var dog4 = new Dog("Podra", 8);

        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog3.getHumanAhe());

        var dogKennel = new DogKennel();
        dogKennel.add(dog1, dog2, dog3, dog4);

        System.out.println(dogKennel.toString());

    }
}
