package pack2;

public class Circle {
    Point point = new Point();
    private double R;

    public void setR(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setPoint(double x, double y) {
        point.setX(x);
        point.setY(y);
    }

    public Point getPoint() {
        return point;
    }
}
