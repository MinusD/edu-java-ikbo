package ru.minusd.gizatullina.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class JPanelApp extends JPanel
{
    JTextField txt1 = null;
    int res = 0;
    String op = "";

    public JPanelApp()
    {
        try
        {
            setLayout(null);
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 25);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 50, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton bRes = new JButton("=");
            bRes.setBounds(110, 270, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);

            JButton bSpace = new JButton("_");
            bSpace.setBounds(60, 270, 50, 50);
            Font bigFontSpace = new Font("serif", Font.BOLD, 22);
            bSpace.setFont(bigFontSpace);

            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bSpace);

            b1.addActionListener(arg1 -> txt1.setText(txt1.getText() + 1));

            b2.addActionListener(arg1 -> txt1.setText(txt1.getText() + 2));

            b3.addActionListener(arg1 -> txt1.setText(txt1.getText() + 3));

            b4.addActionListener(arg1 -> txt1.setText(txt1.getText() + 4));

            b5.addActionListener(arg1 -> txt1.setText(txt1.getText() + 5));

            b6.addActionListener(arg1 -> txt1.setText(txt1.getText() + 6));

            b7.addActionListener(arg1 -> txt1.setText(txt1.getText() + 7));

            b8.addActionListener(arg1 -> txt1.setText(txt1.getText() + 8));

            b9.addActionListener(arg1 -> txt1.setText(txt1.getText() + 9));

            b0.addActionListener(arg1 -> txt1.setText(txt1.getText() + 0));

            bPlus.addActionListener(arg1 -> txt1.setText(txt1.getText() + " + "));

            bMinus.addActionListener(arg1 -> txt1.setText(txt1.getText() + " - "));

            bMulti.addActionListener(arg1 -> txt1.setText(txt1.getText() + " * "));

            bDivision.addActionListener(arg1 -> txt1.setText(txt1.getText() + " / "));

            bRes.addActionListener(arg0 -> {
                MetodCalc calc = new MetodCalc();
                txt1.setText(calc.calc(txt1.getText()) + "");
            });

            bSpace.addActionListener(arg0 -> txt1.setText(txt1.getText() + " "));
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Can not divide by zero ");
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println("Illegal argument");
        }
        catch (EmptyStackException exception)
        {
            System.out.println("Empty stack");
        }
        catch (Exception exception)
        {
            System.out.println("Error");
        }
    }
}