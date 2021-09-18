package ru.mirea.task3.opt1;

public class task_3_1 {
    public static void main(String[] args) {
        Circle krug = new Circle(22, "green");
        System.out.println(krug.getColor());
        System.out.println(krug.getRadius());
        krug.changeRadius(11);
        krug.changeColor("red");
        System.out.println(krug.getColor());
        System.out.println(krug.getRadius());
    }
}

class Circle {
    private int radius;
    private String color;

    public Circle (int radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void changeRadius(int change) {
        radius = change;
    }
    public void changeColor(String change) {
        color = change;
    }
}