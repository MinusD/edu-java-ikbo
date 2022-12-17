package ru.minusd.gizatullina.lab20.task03;

import java.io.Serializable;

public class Main<T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;

    public Main(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "task3{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        Main<Integer, Dog, String> Main = new Main<Integer, Dog, String> (5, new Dog("Rocky", 3, "red"), "Hello");
        System.out.println(Main);
    }
}
