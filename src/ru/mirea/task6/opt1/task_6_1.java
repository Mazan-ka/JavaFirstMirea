package ru.mirea.task6.opt1;

public class task_6_1 {
    public static void main(String[] args) {
        class1 planet = new class1("planet");
        class2 car = new class2("car");
        class3 animal = new class3("animal");

        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}

interface nameAble {
    String getName();
}

class class1 implements nameAble {
    private final String name;

    public class1(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}

class class2 implements nameAble {
    private final String name;

    public class2(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}

class class3 implements nameAble {
    private final String name;

    public class3(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
