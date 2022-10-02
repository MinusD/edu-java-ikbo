package ru.minusd.isaeva.lab02.task09;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Boolean[][] mas = new Boolean[13][4];
        for(int i=0; i<13;i++)
            for(int j=0; j<4;j++)
                mas[i][j]=true;

        char[] k1 = {'♥', '♦', '♣', '♠'};
        char[] k2 = {'В','Д', 'К', 'Т'};
        System.out.println("Введите количество игроков: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>10) {
            System.out.println("Карт на всех не хватит");
            System.exit(1);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                boolean isFind = false;
                while (!isFind){
                           int mast = (int) (Math.random()*4);
                    int nam = (int) (Math.random()*13);
                    if (mas[nam][mast]){
                        isFind=true;
                        mas[nam][mast]=false;
                       if (nam>9)
                            System.out.print(k2[nam-9]);
                        else
                           System.out.print(nam+2);
                        System.out.println(" "+k1[mast]);
                    }
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}