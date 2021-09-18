package ru.mirea.task5.opt2;

public class task_5_2 {
    public static void main(String[] args) {
        Labrador dog_1 = new Labrador("Jake", 4, "Grey");
        Bulldog dog_2 = new Bulldog("mark", 5, "ginger");
    }
}

abstract class Dog {
    public String name;
    public int age;
    public String color;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String breed) {
        this.color = breed;
    }
}

class Labrador extends Dog {
    public Labrador(String name, int age, String breed) {
        setName(name);
        setAge(age);
        setColor(breed);
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age, String breed) {
        setName(name);
        setAge(age);
        setColor(breed);
    }
}