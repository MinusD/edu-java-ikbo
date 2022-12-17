package lab02.task03;

public class Tester {

    private static int l = 5;
    private static Circle[] arr = new Circle[l];

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 3));
        arr[0] = circle;
        System.out.println(arr);
        System.out.println(l);
    }

}
