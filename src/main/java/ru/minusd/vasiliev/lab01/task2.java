package ru.minusd.vasiliev.lab01;

public class task2 {
    public static void main(String[] args) {
        float sum = 0;
        float currentNum = 0f;
        for (int i = 1; i <= 10; i++){
            currentNum = 1/(float)i;
            System.out.printf("%.2f\n", currentNum);
            sum += currentNum;
        }
        System.out.printf("Сумма: %.2f", sum);
    }
}
