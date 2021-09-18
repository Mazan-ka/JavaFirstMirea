package ru.mirea.task5.opt1;

public class task_5_1 {
    public static void main(String[] args) {
        Mug kruzhka = new Mug(13, "grey");
        Plate tarelka = new Plate(17, "white");

        kruzhka.washed(true);
        tarelka.washed(false);

        kruzhka.filled(false);
        tarelka.filled(true);

        kruzhka.displayInfo();
        tarelka.displayInfo();
    }
}

abstract class Dishes {
    public int size;
    public String color;
    public boolean condi;

    public void washed (boolean Condi) {
        condi = Condi;
    }

    public int sizeOut () {
        return size;
    }
    public String colorOut() {
        return color;
    }
    public boolean washedOut() {
        return condi;
    }
}

class Mug extends Dishes {
    public boolean condi;

    public Mug (int Size,String Color) {
        size = Size;
        color = Color;
    }

    public void filled (boolean Condi) {
        condi = Condi;
    }

    public void displayInfo() {
        System.out.println("Размер: " + size + " Цвет: " + color);
    }
}

class Plate extends Dishes{
    public boolean condi;

    public Plate (int Size,String Color) {
        size = Size;
        color = Color;
    }

    public void filled (boolean Condi) {
        condi = Condi;
    }
    public void displayInfo() {
        System.out.println("Размер: " + size + " Цвет: " + color);
    }
}


