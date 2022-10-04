package pack2;

public class Ball {
    private double x = 0;
    private double y = 0;

    public Ball(double X, double Y) {
        x = X;
        y = Y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double X) {
        this.x = X;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double Y) {
        this.y = Y;
    }

    public void setXY(double X, double Y)
    {
        this.x = X;
        this.y = Y;
    }
    public void move(double xDisp, double yDisp)
    {
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }
    public String toString()
    {
        return this.x+" " +this.y;
    }
}

