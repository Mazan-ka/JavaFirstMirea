package ru.mirea.task5.opt3;

public class task_5_3 {
    public static void main(String[] args) {
        Bed krovat = new Bed(2, "lether", "brown");
        Table stol = new Table(1, "wood", "red");
        FurnitureShop shop = new FurnitureShop();
        shop.setCell_1(krovat);
        shop.setCell_2(stol);
        System.out.println(shop.getCell_1());
    }
}

abstract class furniture {
    public int size;
    public String material;
    public String color;

    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}

class Bed extends furniture {
    public Bed(int size, String material, String color) {
        setSize(size);
        setMaterial(material);
        setColor(color);
    }

    @Override
    public String toString() {
        return "я стол";
    }
}

class Table extends furniture {
    public Table(int size, String material, String color) {
        setSize(size);
        setMaterial(material);
        setSize(size);
    }
}

class FurnitureShop {
    public Bed cell_1;
    public Table cell_2;

    public void setCell_1(Bed cell_1) {
        this.cell_1 = cell_1;
    }
    public void setCell_2(Table cell_2) {
        this.cell_2 = cell_2;
    }

    public Bed getCell_1() {
        return cell_1;
    }
    public Table getCell_2() {
        return cell_2;
    }

    public void sellThing(int number) {
        if (number==1) cell_1 = null;
        else cell_2 = null;
    }
}
