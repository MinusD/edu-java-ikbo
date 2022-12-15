package ru.minusd.budkov.lab05.task03;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;

// C:\\Users\\144\\OneDrive\\Рабочий стол\\картиночки\\3.jpg

public class Command{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}
class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("Main frame");
        setSize(300, 200);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel{
    private Image im;
    public MyPanel(){
        try {
            Scanner in = new Scanner(System.in);
            String s;
            s = in.nextLine();
            im = ImageIO.read(new File(s));
        }
        catch (IOException ex){}
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(im, 22, 22, null);
    }
}