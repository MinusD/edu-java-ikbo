package ru.minusd.gizatullina.lab07.task05;

public class Main implements ProcessString{
    @Override
    public int countOfSymbols(String str) {
        int c = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != ' ')
                c++;
        }
        return c;
    }

    @Override
    public String oddPosition(String str) {
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            x += str.charAt(i);
            x += " ";
        }
        return x;
    }

    @Override
    public String revers(String str) {
        String x = "";
        for(int i = str.length() - 1; i >= 0; i--){
            x += str.charAt(i);
        }
        return x;
    }

    public static void main(String[] args) {
        ProcessString test = new Main();
        System.out.println(test.countOfSymbols("j g7 hs9 y"));
        System.out.println(test.oddPosition("Alsu"));
        System.out.println(test.revers("hello"));
    }
}
