package ru.mirea.task10.opt14;

import java.util.Scanner;

public class Task1014 {
    public static int quantNum(int num) {
        int res=0;
        int k = 0;
        if (num>0) {
            res = quantNum(num/10);
            k++;
            k += res;
        }
        else return num;
        //System.out.print(num + " ");
        return k;
    }

    public static void func (int num, int k) {
        if (k>0){
            System.out.println((int)(num/(Math.pow(10,k))));
            func((int) (num%(Math.pow(10,k))), k-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int g = quantNum (num);
        func(num, g-1);
        System.out.print(g);
    }
}


