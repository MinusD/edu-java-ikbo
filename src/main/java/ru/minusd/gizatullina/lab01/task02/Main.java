package ru.minusd.gizatullina.lab01.task02;

public class Main {
    public static void main(String[] args){
        double sum =0,a=0;
        for (double i=1;i<=10;i++){
            a=1/i;
            sum+=a;
            System.out.println(String.format("%.3f",a));
        }
        String str = String.format("%.3f",sum);
        System.out.println(str);
    }
}