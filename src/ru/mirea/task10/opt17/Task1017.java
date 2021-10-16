package ru.mirea.task10.opt17;

import java.util.Scanner;

public class Task1017 {
    public static int maxNumber() {
        int a = 1, max = 0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if (a != 0)  max = maxNumber();
        return Math.max(a, max);
    }
    public static void main(String[] args) {
        System.out.println(maxNumber());
    }
}
