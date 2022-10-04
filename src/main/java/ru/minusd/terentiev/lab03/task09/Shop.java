import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What u wanna to bye (cost in Rubbles): ");
        System.out.println("1) Xolodilnik (7999.9)");
        System.out.println("2) Microvolnovka (4990.99)");
        System.out.println("3) Chainik (1000,50)");
        double[] cost = {
          7999.9 , 4990.99 , 1000,50
        };
        int chose1 = s.nextInt();
        System.out.println("Choose valuta: ");
        System.out.println("1) Rubles");
        System.out.println("2) Dollars");
        System.out.println("3) Euro");
        int chose2 = s.nextInt();
        Converter c = new Converter();
        double x;
        String[] valuts = {
                " Rubles", " Dollars", " Euro"
        };
        switch (chose2) {
            case 1: {
                x = cost[chose1 - 1];
                x = c.RubblesToDollars(x);
                System.out.print("You will pay ");
                System.out.printf("%.3f", x);
                System.out.print(" " + valuts[chose2-1]);
            }
            case 2:
            {
                x = cost[chose1 - 1];
                x = c.RubblesToEuro(x);
                System.out.print("You will pay ");
                System.out.printf("%.3f", x);
                System.out.print(" " + valuts[chose2-1]);
            }
        }
    }
}
