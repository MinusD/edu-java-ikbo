package pack6;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.setR(10);
        System.out.println(c.Square());
        System.out.println(c.Len());
        Circle s = new Circle();
        s.setR(15);
        if (c.equal(s))
            System.out.println("True");
        else System.out.println("False");
    }
}
