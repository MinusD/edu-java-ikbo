package ru.minusd.vasiliev.lab20.task02;

public class GenericClass<T, V, K> {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClasses() {
        System.out.println("Класс T: " + t.getClass().getName());
        System.out.println("Класс V: " + v.getClass().getName());
        System.out.println("Класс K: " + k.getClass().getName());
    }
}
