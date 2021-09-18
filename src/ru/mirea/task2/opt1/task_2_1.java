package ru.mirea.task2.opt1;

public class task_2_1 {
    public static void main(String[] args) {
        Shape triangle = new Shape("triangle", "red");
        System.out.println(triangle.toString());
    }
}

class Shape {
    private String typeFigure;
    private String color;

    public Shape (String typeFigure, String color) {
        setColor(color);
        setTypeFigure(typeFigure);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setTypeFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    @Override
    public String toString() {
        return "Shape{" + "typeFigure='" + typeFigure + '\'' + ", color='" + color + '\'' + '}';
    }
}
