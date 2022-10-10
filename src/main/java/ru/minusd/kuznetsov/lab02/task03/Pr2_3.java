package ru.minusd.kuznetsov.lab02.task03;
import java.util.*;

/*
Пр№2 Задание №3) ПРОГРАММА ПЕРЕВОДИТ ИЗ ОДНОЙ СС В ДРУГУЮ
На ввод 2 числа
1ое, которое будем переводить в другие СС
2ое в какую СС
Перевести и вывести
(указать также двоичную и шестнадцати)
 */
public class Pr2_3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Вводим СС и число в ней
        System.out.print("Enter a number system (10 is max): ");
        int oldNS = scanner.nextInt();
        if (oldNS < 11)
        {
            System.out.print("Enter a number in " + oldNS + " n.s.: ");
            double oldNum = scanner.nextDouble();

            //Вводим СС, в которую хотим перевести
            System.out.print("Enter a new n.s.: ");
            int newNS = scanner.nextInt();

            LinkedList<String> arrayNewNum = new LinkedList<String>();

            int intOldPart = (int) oldNum; // целая часть числа
            int lenOldPart = String.valueOf(intOldPart).length();
            int lenOldDrobPart = (String.valueOf(oldNum).length()-lenOldPart-1)*(-1);

            int digit;
            int intFullNumber = (int) (oldNum*(int)Math.pow(10,-1*lenOldDrobPart));
            double ns10number = 0;

            for (int multiIndex = lenOldDrobPart; multiIndex < lenOldPart; multiIndex++) {
                digit = intFullNumber%10;
                intFullNumber /= 10;
                ns10number += digit * Math.pow(oldNS, multiIndex);
            }


            //целая в новую СС
            int int10ns = (int) ns10number;
            while (int10ns != 0)
            {
                int x = int10ns%newNS;
                if (x>9)
                    arrayNewNum.addFirst(String.valueOf((char)(x+55)));
                else
                    arrayNewNum.addFirst(String.valueOf(x));
                int10ns /= newNS;
            }

            //дробная в новую СС
            double double10ns = ns10number%1;
            double doubleDigit;
            arrayNewNum.add(",");
            do {
                doubleDigit = double10ns * newNS;
                double10ns = doubleDigit%1;
                doubleDigit = (int)doubleDigit; //ОГРАНИЧЕНИЕ ДО ПЕРВОГО НУЛЯ
                int x = (int)doubleDigit;
                if (x>9)
                    arrayNewNum.add(String.valueOf((char)(x+55)));
                else
                    arrayNewNum.add(String.valueOf(x));

            } while (doubleDigit != 0);

            System.out.print("Result in " + newNS + " n.s.: ");
            if (arrayNewNum.getFirst().equals(","))
                System.out.print("0");
            for (String num :
                    arrayNewNum) {
                System.out.print(num);
            }
        }
        else
            System.out.println("Enter number system no more than 10!");
    }
}