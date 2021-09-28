package ru.mirea.task7.opt2;

public class Task72 {
    public static void main(String[] args) {
        MoveableRectangle adc = new MoveableRectangle(5, 7, 10, 15);
        System.out.println(adc.sameSpeed());
    }
}

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        setX(x);
        setY(y);
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }

    public void moveDown() {
        y -= 10;
    }
    public void moveUp() {
        y += 10;
    }
    public void moveLeft() {
        x -= 10;
    }
    public void moveRight() {
        x += 10;
    }

    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
}

class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center ;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        setRadius (radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveDown() {
        center.moveDown();
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
       center.moveRight();
    }

    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}

class MoveableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft = new MovablePoint(5, 6, 10, 15);
    private MovablePoint bottomRight = new MovablePoint(2, 7, 10, 15);

    public MoveableRectangle (int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);

    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean sameSpeed() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.ySpeed) return true;
        return false;
    }
}
