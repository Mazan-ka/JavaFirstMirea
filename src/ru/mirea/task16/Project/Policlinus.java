package ru.mirea.task16.Project;

import java.util.Scanner;

public class Policlinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Добро пожаловать в медицинское приложение Policlinus!\n");
        System.out.print("Укажите свою роль ('П'-- пациент; 'С' -- сотрудник): \n Если хотите выйти нажмите любую кнопку\n");
        boolean coutIsFalse = true;
        while (coutIsFalse) {
            String role = scan.next();
            switch (role) {
                case ("П"):
                    Patient patient = new Patient();
                    boolean f = true;
                    while (f) {
                        System.out.print("Выберите что вы хотите сделать ('сз'-- сделать запись на приём; 'б' -- купить бахилы; 'оз' -- отменить запись на приём; 'зп' -- заказать платную услугу; 'пк' -- процедурный кабинет; 'пб' -- показать баланс):\n Если хотите выйти нажмите любую кнопку\n");
                        String key = scan.next();
                        switch (key) {
                            case ("сз"):
                                patient.appointment();
                                break;
                            case ("б"):
                                patient.buyCrocs();
                                break;
                            case ("оз"):
                                patient.delAppointment();
                                break;
                            case ("зп"):
                                patient.paidService();
                                break;
                            case ("пк"):
                                patient.treatmentRoom();
                                break;
                            case ("пб"):
                                patient.showBalance();
                                break;
                            default:
                                f = false;
                                break;
                        }
                    }
                    break;
                case ("С"):
                    System.out.print("Введите свою должность \n");
                    String position = scan.next();
                    Employee employee = new Employee(position);
                    break;
                default:
                    //System.out.print("Вы указали неверный символ! Пожалуйста повторите попытку ещё раз.\n");
                    coutIsFalse = false;
                    break;
            }
        }

    }
}
