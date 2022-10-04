//вывести первые 10 чисел гармонического ряда с 2 цифрами после запятой и их сумму
import java.util.Scanner;


public class Harmony {
    public static void main(String[] args)
    {
        float num = 0;
        System.out.print("Harmony row: ");
        float sum = 0;
        for (float i = 1; i<=10; i++)
        {
            num =1/i+num;
            System.out.printf("%1$03.2f",num);
            if (i!=10)
                System.out.print("; ");
        }
        System.out.println();
        num = 0;
        System.out.print("Harmony row sum: ");
        for (float i = 1; i<=10; i++)
        {
            num =1/i+num;
            System.out.printf("%1$03.2f",num);
            if (i!=10)
                System.out.print(" + ");
        }
        System.out.println();
    }
}
