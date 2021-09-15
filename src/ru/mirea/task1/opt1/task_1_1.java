package ru.mirea.task1.opt1;

import java.util.Scanner;

public class task_1_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива ");
        int mas1[] = new int[scan.nextInt()];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < mas1.length; i++) {
            scan = new Scanner(System.in);
            int x = scan.nextInt();
            mas1[i] = x;
        }
        for (int i = 0; i < mas1.length; i++){
            sum = sum + mas1[i];
        }
        System.out.println("1-ый способ " + sum);
        sum = 0;
        int i = 0;
        while (i < mas1.length) {
            sum = sum + mas1[i];
            i++;
        }
        System.out.println("2-ый способ " + sum);
        sum = 0;
        i = 0;
        do {
            sum = sum + mas1[i];
            i++;
        } while (i < mas1.length);
        System.out.println("2-ый способ " + sum);
    }
}
