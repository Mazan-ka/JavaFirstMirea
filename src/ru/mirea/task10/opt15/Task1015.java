package ru.mirea.task10.opt15;

import java.util.Scanner;

public class Task1015 {
    public static void func (int num) {
        if (num>0){
            System.out.println(num%10);
            func(num/10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        func(num);
    }
}
