package ru.mirea.task8.opt2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.*;

public class Task82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Window okno = new Window();
        okno.loadImage(scan.nextLine()); //File path: D:\скачанное\CJSEEF.jpg
        okno.drawIcon();
    }
}

class Window extends JFrame {

    private final int width = 1000;
    private final int height = 600;

    private Image img;

    public Window() {
        setSize(width, height);
        setTitle("Lovely image!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }

    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, width, height, null);
    }
}