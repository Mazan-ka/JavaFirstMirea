package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Начать рисование треугольника с черными рамками");
        rectangle.draw();

        System.out.println("Начать рисование круга с красными рамками");
        redCircle.draw();

        System.out.println("Начать рисование треугольника с красными рамками");
        redRectangle.draw();
    }
}
