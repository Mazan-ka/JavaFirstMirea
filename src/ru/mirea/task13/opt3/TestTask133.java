package ru.mirea.task13.opt3;

import java.lang.*;

public class TestTask133 {
    public static void output(Task133 list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        Task133<StudentData> list = new Task133<>();
        list.add(new StudentData("Владимир", 3.4, 2345));
        list.add(new StudentData("Олег", 4.3, 213));
        list.add(new StudentData("Игорь", 3.7, 1673));
        list.add(new StudentData("Виктор", 3.1, 1613));

        output(list);

        list.add(3, new StudentData("Дмитрий", 4.5, 1000));

        output(list);

        list.remove(2);

        output(list);

        list.set(1, new StudentData("Андрей", 4.1, 321));

        output(list);

        list.clear();
        System.out.println("Список очищен, размер списка: " + list.size());
    }
}
