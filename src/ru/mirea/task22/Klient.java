package ru.mirea.task22;

import java.util.Scanner;

public class Klient extends Task22 {
    public void Sit() {
        Chair chair = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите какой стул вы хотите выбрать (\"Вик\" -- Викторианский, \"Мул\" -- Мультифункциональный, \"Маг\" -- Магический)\n");
        String str = scan.nextLine();
        switch (str) {
            case("Вик"):
                chair = chooseChair(ChairsType.VICTORIAN);
                break;
            case("Мул"):
                chair = chooseChair(ChairsType.MULTIFUNCTIONAL);
                break;
            case("Маг"):
                chair = chooseChair(ChairsType.MAGIC);
                break;
        }
    }

    public static void main(String[] args) {
        Klient klient = new Klient();
        klient.Sit();
    }
}
