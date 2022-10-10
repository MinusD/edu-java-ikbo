package lab02.task06;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,3,2);
        Circle c2 = new Circle(2,5,4);

        System.out.println(c1.getY());
        System.out.println(c1.getX());
        System.out.println(c1.getR());

        System.out.println("Сравнение окружностей: c2 < c1");
        System.out.println(c2.compare(c1));

    }
}
