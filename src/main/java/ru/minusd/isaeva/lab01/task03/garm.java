package ru.minusd.isaeva.lab01.task03;

public class garm {
    public static void main(String[] arg) {
    double[] mas = new double[10];
    int i = 0;
    double sum = 0;

    for( i=0; i<10; i++){
        mas[i]=1/Double.valueOf(i+1);
    }
    for( i=0; i<10; i++){
        sum+=mas[i];
        //System.out.println(mas[i]);
        System.out.println(String.format("%.2f", mas[i]));
    }
    System.out.println("Сумма гармонического ряда: "+ String.format("%.2f",sum));
}
}