package ru.minusd.kuznetsov.lab03.task06;

public class Circle {
    private Point circleCentre;
    private Point circlePoint;
    private double radius;
    private double square;
    private double perimeter;

    private double calcRadius() {
        radius = Math.abs(circlePoint.getX() - circleCentre.getX());
        return radius;
    }

    private double calcSquare() {
        square = Math.PI * radius * radius;
        return square;
    }

    private double calcPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public Circle(double centreX, double centreY, double pointX, double pointY) {
        this.circleCentre = new Point("Centre", centreX, centreY);
        this.circlePoint = new Point("Circle Point", pointX, pointY);
        calcRadius();
        calcSquare();
        calcPerimeter();
    }

    public Point getCircleCentre() {
        return circleCentre;
    }

    public Point getCirclePoint() {
        return circlePoint;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle: " +
                getCircleCentre() +
                " " +
                getCirclePoint() +
                "\nSquare = " + square +
                " Perimeter = " + perimeter;
    }

    public void compareCircle(Circle circle2) {
        System.out.println("Distance between the centers of circles: " +
                        Math.sqrt(Math.pow(this.getCircleCentre().getX() - circle2.getCircleCentre().getX(),2) + Math.pow(this.getCircleCentre().getY() - circle2.getCircleCentre().getY(),2)) +
                        "\nThe difference between the squares: " +
                        Math.abs(this.getSquare() - circle2.getSquare()) +
                        "\nThe difference between the perimeters: " +
                        Math.abs(this.getPerimeter() - circle2.getPerimeter())
                );

    }
}
