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
    protected Color color;
    protected int positionX;
    protected int positionY;
}

class Circle extends Shape {
    public Circle (Color color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

class Rectangle extends Shape {
    public Rectangle (Color color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

class Triangle extends Shape {
    public Triangle (Color color) {
        this.color = color;
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
                    Circle krug = new Circle(Color.getHSBColor((int) (Math.random() * 360), (int) (Math.random() * 200), (int) (Math.random() * 200)), (int) (Math.random() * 700), (int) (Math.random() * 700));
                    g.setColor(krug.color);
                    g.drawOval(krug.positionX, krug.positionY, 100, 80);
                    break;
                case (1):
                    Rectangle treug = new Rectangle(Color.getHSBColor((int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 700), (int) (Math.random() * 700));
                    g.setColor(treug.color);
                    g.drawRect(treug.positionX, treug.positionY, 100, 80);
                    break;
                case (2):
                    Triangle triug = new Triangle(Color.getHSBColor((int) (Math.random() * 800), (int) (Math.random() * 800), (int) (Math.random() * 800)));
                    g.setColor(triug.color);
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
    }
}