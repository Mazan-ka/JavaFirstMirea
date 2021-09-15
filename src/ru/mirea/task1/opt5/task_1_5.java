package ru.mirea.task1.opt5;

public class task_1_5 {
    public static int factorial(int x) {
        int res=0;
        if (x<0){
            res = x*(x-1);
            x = x-2;
        }
        return x; //фигня
    }
}
