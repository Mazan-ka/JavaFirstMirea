package ru.mirea.task2.opt2;

public class task_2_2 {
     public static void main(String[] args) {
         Ball myach = new Ball (22.2, 44.4);
         testBall test = new testBall();
         test.Cout();
         test.testMove();
         test.Cout();
     }
}

class Ball {
    private double x = 0.0;
    private  double y = 0.0;

    public Ball (double x, double y) {
        setXY(x,y);
    }
    public Ball () {
        this.x = getX();
        this.y = getY();
    }

    public void setX (double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void move(double xDisp, double yDisp) {
        x =+ xDisp;
        y =+ yDisp;
    }

    public String toString() {
        return "Ball @(" + x + "," + y + ")";
    }
}

class testBall extends Ball{
    private double x1;
    private double x2;

    public testBall() {
        x1 = getX();
        x2 = getY();
    }

    public void Cout() {
        System.out.println(toString());
    }

    public void testMove() {
        move(2.5, 3.7);
    }
}


