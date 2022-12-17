package ru.minusd.gizatullina.lab13.task05;

public class task5 {
    private String code;
    private String first3;
    private String second3;
    private String four;

    public task5(String number) {
        this.code = number.substring(1, number.length() - 10);
        this.first3 = number.substring(number.length() - 10, number.length() - 7);
        this.second3 = number.substring(number.length() - 7, number.length() - 4);
        this.four = number.substring(number.length() - 4, number.length());
    }

    @Override
    public String toString() {
        return "number: " +
                "+" + code + '-' +
                first3 + '-' +
                second3 + '-' +
                four;
    }

    public static void main(String[] args) {
        String num1 = "+79961065764";
        task5 numm1 = new task5(num1);
        System.out.println(numm1.toString());
    }
}
