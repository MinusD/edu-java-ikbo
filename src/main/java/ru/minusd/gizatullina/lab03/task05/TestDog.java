package ru.minusd.gizatullina.lab03.task05;

public class TestDog {
    public static void main(String[] args) {
        var dog1 = new Dog("Rocky", 5);
        var dog2 = new Dog("Gav", 7);
        var dog3 = new Dog("Dzerzh", 3);
        var dog4 = new Dog("UwU", 2);
        var dog5 = new Dog("Filip", 4);

        System.out.println(dog4.toHumanAge());

        DogKennel dogKennel = new DogKennel();
        dogKennel.add(dog1);
        dogKennel.add(dog2);
        dogKennel.add(dog3);

        System.out.println(dogKennel);
    }
}

