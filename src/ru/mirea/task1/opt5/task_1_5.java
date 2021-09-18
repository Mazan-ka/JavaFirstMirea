package ru.mirea.task1.opt5;

import java.util.Scanner;

public class task_1_5 {
    static int factorial(int x) {
        int res=1;
        for (int i = x; i > 1; i--) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(factorial(x));
    }
}
