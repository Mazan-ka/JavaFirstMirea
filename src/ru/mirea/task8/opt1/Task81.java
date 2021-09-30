package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public class Task81 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUI gui = new GUI();
        frame.add(gui);
        frame.setSize(1000, 700);
        frame.setVisible(true);
    }
}

abstract class Shape {
    protected String color;
    protected int positionX;
    protected int positionY;
}

class Circle extends Shape {
    public Circle (String color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

class Rectangle extends Shape {
    public Rectangle (String color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

class Triangle extends Shape {
    public Triangle (String color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

//class Window extends JFrame {
//    //JTextField jtf = new JTextField(15);
//    //Font fn = new Font("Times New Roman", Font.BOLD, 20);
//    JFrame frame = new JFrame("Programm");
//    GUI gui = new GUI();
//    Window() {
//        super("Programm");
//        setSize(400,200);
//        setBackground(Color.PINK);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.add(gui);
//        /* setLayout(new FlowLayout());
//        add(jtf);
//        jtf.setForeground(Color.BLACK);
//        jtf.setFont(fn);*/
//        setVisible(true);
//    }
//}

class GUI extends JPanel {
    public void paintComponent(Graphics g) {
        for (int i=0; i<20; i++) {
            switch ((int) (Math.random() * 3)) {
                case (0):
                    Circle krug = new Circle("black", (int) (Math.random() * 1000), (int) (Math.random() * 700));
                    g.setColor(Color.getHSBColor((int) (Math.random() * 200), (int) (Math.random() * 200), (int) (Math.random() * 200)));
                    g.drawOval(krug.positionX, krug.positionY, 100, 80);
                    break;
                case (1):
                    Rectangle treug = new Rectangle("black", (int) (Math.random() * 1000), (int) (Math.random() * 700));
                    g.setColor(Color.getHSBColor((int) (Math.random() * 200), (int) (Math.random() * 200), (int) (Math.random() * 200)));
                    g.drawRect(treug.positionX, treug.positionY, 100, 80);
                    break;
                case (2):
                    Triangle triug = new Triangle("black", (int) (Math.random() * 400), (int) (Math.random() * 100));
                    g.setColor(Color.getHSBColor((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
                    int x1 = (int) (Math.random() * 400);
                    int y1 = (int) (Math.random() * 400);
                    int x2 = (int) (Math.random() * 400);
                    int y2 = (int) (Math.random() * 400);
                    int x3 = (int) (Math.random() * 400);
                    int y3 = (int) (Math.random() * 400);
                    g.drawLine(x1, y1, x2, y2);
                    g.drawLine(x2, y2, x3, y3);
                    g.drawLine(x3, y3, x1, y1);
                default:
                    break;
            }
        }
        int k = (int)(Math.random()*10);
        Circle krug = new Circle("black", 40, 60);
        g.setColor(Color.black);
        g.drawOval((int)(Math.random()*100), (int)(Math.random()*100), 100, 80);
    }
}