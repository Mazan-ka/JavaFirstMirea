package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <String> list = new ArrayList<>();
        list.add ("Сокольническая");
        list.add ("Солнцевская");
        list.add ("Серпуховско-Тимирязевкая");
        list.add ("Большая Кольцевая");
        list.add ("Арбатско-Покровская");
        list.add ("Кольцевая");
        list.add ("Филевская");
        String str = scan.nextLine();
        printList(str.equals("t"),list);
    }
    public static void printList (boolean flag, List<String> list) {
        //Scanner scan = new Scanner(System.in);
            for (int i=0; i<7; i++) {
                if (flag) {
                    if (i%2 == 0) {
                        System.out.println(list.get(i));
                    }
                } else {
                    if (i%2 != 0) {
                        System.out.println(list.get(i));
                }
            }
        }
    }
}

