package ru.minusd.bulgakova.lab01.task02;

public class Main {
    public static void main(String[] args) {
        double sum=0;
        for(double i=1; i<11; i++){
            double value = 1/i;
            System.out.printf("%.2f", value);
            System.out.printf(" ");
            sum+=value;
        }
        System.out.printf("\n%.2f",sum);
    }
}
