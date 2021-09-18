package ru.mirea.task2.opt2;

public class task_2_2 {
     public static void main(String[] args) {
        Ball myach = new Ball(12, "football");
        System.out.println(myach);
     }
}

class Ball {
    private int size;
    private String type;

    public Ball (int size, String type) {
        setSize(size);
        setType(type);
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" + "size=" + size + ", type='" + type + '\'' + '}';
    }
}



