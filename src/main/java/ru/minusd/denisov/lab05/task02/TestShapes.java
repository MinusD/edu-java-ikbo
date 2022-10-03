package ru.minusd.denisov.lab05.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

public class TestShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Abstraction");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();

        frame.add(panel);
        frame.setVisible(true);

        ArrayList<ShapeItem> shapes = generateShapes(20);
        System.out.println(shapes.size());
        for (ShapeItem shapeItem : shapes) {
            Graphics2D graphics2D = (Graphics2D) panel.getGraphics();
            graphics2D.setColor(shapeItem.getColor());
            graphics2D.draw(shapeItem.getShape());
            graphics2D.fill(shapeItem.getShape());
        }
    }

    public static ArrayList<ShapeItem> generateShapes(int n) {
        Random random = new Random();
        ArrayList<ShapeItem> shapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int shapeType = random.nextInt(0, 3);
            Shape newShape;
            Color newColor = new Color(random.nextInt(0, 255), random.nextInt(0, 255), random.nextInt(0, 255));
            switch (shapeType) {
                case 0:
                    newShape = new Rectangle(random.nextInt(0, 250), random.nextInt(0, 250), random.nextInt(5, 245), random.nextInt(5, 245));
                    break;
                case 1:
                    newShape = new Ellipse2D.Double(random.nextInt(0, 250), random.nextInt(0, 250), random.nextInt(5, 245), random.nextInt(5, 245));
                    break;
                case 2:
                    ArrayList<Integer> xPoints = new ArrayList<>();
                    ArrayList<Integer> yPoints = new ArrayList<>();
                    for (int j = 3; j <= random.nextInt(3, 20); j++) {
                        xPoints.add(random.nextInt(0, 500));
                        yPoints.add(random.nextInt(0, 500));
                    }
                    newShape = new Polygon(xPoints.stream().mapToInt(Integer::intValue).toArray(), yPoints.stream().mapToInt(Integer::intValue).toArray(), xPoints.size());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + shapeType);
            }
            shapes.add(new ShapeItem(newShape, newColor));
        }
        return shapes;
    }
}