package pack3;

public class Circle {
    Point point = new Point();
    public void setPoint(double x, double y)
    {
        point.setX(x);
        point.setY(y);
    }
    public void getPoint()
    {
        System.out.println(point.getX() + " " + point.getY());
    }
}
