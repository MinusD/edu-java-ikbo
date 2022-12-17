import java.util.Scanner;

public class Converter {

    public static double RubblesToDollars(double x)
        {
            return x/=60.87;
        };
    public static double RubblesToEuro(double x)
    {
        return x/=60.21;
    };
    public static double DollarsToRubles(double x)
    {
        return x*=60.87;
    };
    public static double DollarsToEuro(double x)
    {
        return x/=0.9913;
    };
    public static double EuroToDollars(double x)
    {
        return x*=0.9913;
    };
    public static double EuroToRubbles(double x)
    {
        return x/=60.21;
    };
    public static void main(String[] args) {
        System.out.println("Choose valuta: ");
        System.out.println("1) Rubles");
        System.out.println("2) Dollars");
        System.out.println("3) Euro");
        int chose;
        double x;
        Scanner s = new Scanner(System.in);
        chose = s.nextInt();
        System.out.print("Count of money: ");
        x = s.nextDouble();
        System.out.println("Convert to: ");
        System.out.println("1) Rubles");
        System.out.println("2) Dollars");
        System.out.println("3) Euro");
        String[] valuts = {
                " Rubles", " Dollars", " Euro"
        };
        int chose2 = s.nextInt();
        if (chose == chose2) {
            System.out.println(x + valuts[chose-1]);
        }
        if (chose == 1 && chose2 == 2)
        {
            x = RubblesToDollars(x);
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
        if (chose == 1 && chose2 == 3)
        {
            x *= 60.21;
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
        if (chose == 2 && chose2 == 1)
        {
            x /= 60.87;
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
        if (chose == 2 && chose2 == 3)
        {
            x *= 0.9913;
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
        if (chose == 3 && chose2 == 2)
        {
            x /= 0.9913;
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
        if (chose == 3 && chose2 == 1)
        {
            x /= 60.21;
            System.out.printf("%.3f",x);
            System.out.println(valuts[chose2-1]);
        }
    }
}
