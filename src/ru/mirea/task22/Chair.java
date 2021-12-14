package ru.mirea.task22;

public interface Chair {}

class Victorian implements Chair {
    Victorian() {
        System.out.print("Викторианский стул");
    }
}

class Multifunctional implements Chair {
    Multifunctional() {
        System.out.print("Мультифункциональный");
    }
}

class Magic implements Chair {
    Magic() {
        System.out.print("Магический");
    }
}
