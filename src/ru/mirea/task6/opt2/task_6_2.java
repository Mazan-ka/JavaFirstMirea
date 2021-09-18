package ru.mirea.task6.opt2;

public class task_6_2 {
    public static void main(String[] args) {
        Book kniga = new Book(10);
        Phone telefon = new Phone(600);
        T_shirt futbolka = new T_shirt(15);
    }
}

interface priceAble {
    int getPrice();
}

class Book implements priceAble {
    private int price;

    public Book(int price){
        setPrice(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Phone implements priceAble {
    private int price;

    public Phone(int price) {
        setPrice(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class T_shirt implements priceAble {
    private int price;

    public T_shirt(int price) {
        setPrice(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
