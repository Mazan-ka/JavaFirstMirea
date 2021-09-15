package ru.mirea.task1.opt4;
import  java.util.Random;
import java.util.Scanner;

public class task_1_4 {
    public static void swap(int[] mas, int ind1, int ind2) {
        int tmp = mas[ind1];
        mas[ind1] = mas[ind2];
        mas[ind2] = tmp;
    }

    public static void sort(int[] mas){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    swap(mas, i, i-1);
                    needIteration = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mas1 = new int[scan.nextInt()];
        for (int i=0; i< mas1.length; i++){
            mas1[i]= (int)(Math.random()*10);
        }
        System.out.println("Первый массив: ");
        for (int k : mas1) {
            System.out.println(k);
        }
        int[] mas2 = new int[scan.nextInt()];
        Random rand = new Random();
        for (int i=0; i< mas2.length; i++){
            mas2[i]= rand.nextInt(10);
        }
        System.out.println("Второй массив: ");
        for (int j : mas1) {
            System.out.println(j);
        }
        sort(mas1);
        sort(mas2);
        System.out.println("Первый массив после сортировки: ");
        for (int k : mas1) {
            System.out.println(k);
        }
        System.out.println("Второй массив после сортировки: ");
        for (int j : mas1) {
            System.out.println(j);
        }
    }
}

