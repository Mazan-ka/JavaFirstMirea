package ru.mirea.task7.opt1;

public class Task71 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
       // System.out.println(s1.getRadius());
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
       // Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
       // System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
       // System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
      //  System.out.println(r2.getSide());
      // System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
     //   System.out.println(sq1.getSide());
       // System.out.println(sq1.getLength());
    }
}

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();


    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}

class Circle extends Shape {
    protected double Radius;

    public Circle(double Radius) {
        setRadius(Radius);
    }
    public Circle(double Radius, String color, boolean filled) {
        setRadius(Radius);
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getArea() {
        return 3.14*Radius*Radius;
    }
    public double getPerimeter() {
        return 2*3.14*Radius;
    }
    public double getRadius() {
        return Radius;
    }

    public String toString() {
        return "Circle{" + "color='" + color + '\'' + ", filled=" + filled + ", Radius=" + Radius + '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }
    public Rectangle() {}

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" + "color='" + color + '\'' + ", filled=" + filled + ", width=" + width + ", length=" + length + '}';
    }
}

class Square extends Rectangle {
    public Square(double side){
        setLength(side);
        setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        setLength(side);
        setWidth(side);
        setColor(color);
        setFilled(filled);
    }

    public void setLength(double length) {
        super.setLength(length);
    }
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString() {
        return "Square{" + "color='" + color + '\'' + ", filled=" + filled + ", width=" + width + ", length=" + length + '}';
    }
}

