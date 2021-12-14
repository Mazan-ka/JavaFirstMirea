package ru.mirea.task23;

public class Task23 {}

class Class1 {
    public String str = "Я класс 2!";
    public int num = 1;
    public int favouriteNum = 9;

    @Override
    public int hashCode() {
        int result = str == null ? 0 : str.hashCode();
        result = 31 * result + num;
        result = 31 * result + favouriteNum;
        return result;
    }
}

class Class2 {
    private String str = "Я класс 2!";
    private int num = 1;
    private int favouriteNum = 9;

    @Override
    public int hashCode() {
        int result = str == null ? 0 : str.hashCode();
        result = 31 * result + num;
        result = 31 * result + favouriteNum;
        return result;
    }
}

class Class3 {
    private String str = "Я класс 3!";
    private int num = 3;
    private int favouriteNum = 17;

    @Override
    public int hashCode() {
        int result = str == null ? 0 : str.hashCode();
        result = 31 * result + num;
        result = 31 * result + favouriteNum;
        return result;
    }
}

class Class4 {
    private String str = "Я класс 4!";
    private int num = 4;
    private int favouriteNum = 14;

    @Override
    public int hashCode() {
        int result = str == null ? 0 : str.hashCode();
        result = 31 * result + num;
        result = 31 * result + favouriteNum;
        return result;
    }
}

class Class5 {
    private String str = "Я класс 5!";
    private int num = 5;
    private int favouriteNum = 21;

    @Override
    public int hashCode() {
        int result = str == null ? 0 : str.hashCode();
        result = 31 * result + num;
        result = 31 * result + favouriteNum;
        return result;
    }
}
