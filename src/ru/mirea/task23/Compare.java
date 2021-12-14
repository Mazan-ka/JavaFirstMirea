package ru.mirea.task23;

public class Compare {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();

        System.out.print("Хэш коды объектов: \n");

        System.out.print("Первый объект: " + class1.hashCode() + "\n");

        System.out.print("Второй объект: " + class2.hashCode() + "\n");

        System.out.print("Третий объект: " + class3.hashCode() + "\n");

        System.out.print("Четвертый объект: " + class4.hashCode() + "\n");

        System.out.print("Пятый объект: " + class5.hashCode() + "\n");

        System.out.print("Сравнения объектов: \n");

        System.out.print("Первый и Второй: ");
        System.out.print(class1.hashCode() == class2.hashCode());
        System.out.print("\n");

        System.out.print("Второй и Третий: ");
        System.out.print(class2.hashCode() == class3.hashCode());
        System.out.print("\n");

        System.out.print("Третий и Четвертый: ");
        System.out.print(class3.hashCode() == class4.hashCode());
        System.out.print("\n");

        System.out.print("Четвертый и Пятый: ");
        System.out.print(class4.hashCode() == class5.hashCode());
        System.out.print("\n");

        System.out.print("Пятый и Первый: ");
        System.out.print(class5.hashCode() == class1.hashCode());
        System.out.print("\n");
    }
}
