package ru.mirea.task22;

enum ChairsType {
    VICTORIAN,
    MULTIFUNCTIONAL,
    MAGIC
}

public class Task22 {
    public Chair chooseChair (ChairsType type) {
        Chair chair = null;

        switch (type) {
            case VICTORIAN:
                chair = new Victorian();
                break;
            case MULTIFUNCTIONAL:
                chair = new Multifunctional();
                break;
            case MAGIC:
                chair = new Magic();
                break;
        }
        return chair;
    }
}
