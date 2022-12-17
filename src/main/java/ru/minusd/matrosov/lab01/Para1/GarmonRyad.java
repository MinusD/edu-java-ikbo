package lab01.Para1;
public class GarmonRyad {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 11; i++) {
            double output = 1.0 / i;
            System.out.printf("%.2f%n", output);
            sum += output;

        }
        System.out.printf("%.2f%n", sum);
    }
}
