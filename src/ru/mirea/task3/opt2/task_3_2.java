package ru.mirea.task3.opt2;

public class task_3_2 {
    public static void main(String[] args) {
        Human chel = new Human("Maks", 19);
        System.out.println(chel);
        chel.setHuman();
    }
}

class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }
    public Human() {}

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public void setHuman() {
        Head golova = new Head("Brown", "Blue");
        System.out.println(golova);

        Legs nogi = new Legs("white", 100);
        System.out.println(nogi);

        Hands ruki = new Hands("white", "black");
        System.out.println(ruki);
    }
}

class Head extends Human {
    private String hairColor;
    private String eyeColor;

    public Head (String hairColor, String eyeColor) {
        setEyeColor(eyeColor);
        setHairColor(hairColor);
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" + "hairColor='" + hairColor + '\'' + ", eyeColor='" + eyeColor + '\'' + '}';
    }
}

class Legs extends Human {
    private String color;
    private int length;

    public Legs (String color, int length) {
        setColor(color);
        setLength(length);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Legs{" + "color='" + color + '\'' + ", length=" + length + '}';
    }
}

class Hands extends Human {
    private String color;
    private String nailsColor;

    public Hands (String color, String nailsColor) {
        setColor(color);
        setNailsColor(nailsColor);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setNailsColor(String nailsColor) {
        this.nailsColor = nailsColor;
    }

    @Override
    public String toString() {
        return "Hands{" + "color='" + color + '\'' + ", nailsColor='" + nailsColor + '\'' + '}';
    }
}













