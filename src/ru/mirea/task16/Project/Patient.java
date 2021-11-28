package ru.mirea.task16.Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Patient {
    private int[][] schedule = new int[6][8];
    private int balance = 350;
    private String vaccinationStatus;
    private boolean putOnCrocs = false;
    private Vector time = new Vector();
    Employee specialist = new Employee("");
    int time_appoint;
    Scanner scan = new Scanner(System.in);

    Date date = null;

    private  final  String  TIMEZONE_utc    = "UTC";
    private  final  String  TIMEZONE_msc    = "Europe/Moscow";
    private  final  String  DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS";

    /*enum doctors {
        Офтальмолог, ЛОР, Кардиолог, Хирург, Уролог,Гастроэнтеролог;
    }*/

    public void appointment() { //сделать запись
        for (int i=0; i<8; i++) {
            time.addElement(7 + i);
        }

        System.out.print("Выберите нужного специалиста ('Of' -- офтальмолог, 'Lo' -- ЛОР, 'Ka' -- кардиолог, 'Hi' -- хирург, 'Ur' -- уролог, 'Ga' -- гастроэнтеролог): \n");
        try {
            String key = scan.next();
            switch (key) {
                case ("Of"):
                    specialist = new Employee("Офтальмолог");
                    break;
                case ("Lo"):
                    specialist = new Employee("ЛОР");
                    break;
                case ("Ka"):
                    specialist = new Employee("Кардиолог");
                    break;
                case ("Hi"):
                    specialist = new Employee("Хирург");
                    break;
                case ("Ur"):
                    specialist = new Employee("Уролог");
                    break;
                case ("Ga"):
                    specialist = new Employee("Гастроэнтеролог");
                    break;
                default:
                    throw new Exception();
            }
        } catch (Exception e) { //TASK 19
            System.out.print("Вы ввели неверный идентификатор!");
            //System.out.println(e.getMessage());
        }
        System.out.print("Текущее время: \n");

        date = new Date(); //TASK 20
        Date dt_msk = null;
        TimeZone tm_curr = TimeZone.getDefault();
        TimeZone tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);
        DateFormat df_msk = new SimpleDateFormat(DATETIME_format);

        df_msk.setTimeZone(tm_msk);
        String date_msk = df_msk.format(date);

        try { //TASK 18
            dt_msk = df_msk.parse(date_msk);
        } catch (ParseException e) {
            System.out.print("Error 404");
        }

        System.out.println ("Moscow\n" + dt_msk);

        System.out.print("\nВыберите доступное время приёма: \n");

        Enumeration vEnum = time.elements(); //вывод времени приёма из вектора
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        System.out.print("Введите нужно время: \n");
        time_appoint = scan.nextInt();

        schedule[0][0] = (int) time.get(time_appoint - 7); //запись выбранного времени в поле пользователя

        specialist.addPatient(this); //Сообщаем врачу что у него появился пациент

        System.out.print("Вы успешно произвели запись! \n");
    }

    public void buyCrocs () { //купить бахилы
        balance = balance - 15;
        putOnCrocs = true;
        System.out.print("Вы купили бахилы");
    }

    public void delAppointment() { //удалить запись
        schedule[0][0] = 0;
        specialist.delPatient(time_appoint - 7); //Сообщаем у врача больше нет пациента
    }

    public void paidService() { //приобрести платную услугу
        String key1;
        System.out.print("Выберите какую платную услугу вы бы хотели приобрести ('пп' -- поставить пломбу; 'вз' -- вырвать зуб): \n");
        key1 = scan.next();
        specialist = new Employee("Зубной врач");
        specialist.addPatient(this); //сообщаем врачу о новом пациенте
        switch (key1) {
            case ("пп"):
                System.out.print("Вам поставили пломбу! \n");
                balance -= 5250;
                break;
            case ("вз"):
                System.out.print("Вам вырвали зуб! \n");
                balance -= 6600;
                break;
            default:
                break;
        }
    }

    public void treatmentRoom() { //обратиться в процедурный кабинет
        String key;
        System.out.print("Выберите что вы хотите в процедурном кабинете ('п' -- сделать прививку; 'а' -- сдать анализы): \n");
        key = scan.next();
        switch (key) {
            case ("п"):
                vaccinationStatus = "Привит первым компонентом";
                System.out.print("Прививка успешно сделана! \n");
                break;
            case ("а"):
                String key2;
                int res;
                System.out.print("Выберите какие анализы вы хотите сдать ('кр' -- кровь; 'м' -- моча; 'ка' -- калл;) \n");
                key2 = scan.next();
                switch (key2) {
                    case("кр"):
                        res = (int) (Math.random() * 10);
                        if (res >= 5) System.out.print("В ваших анализах всё хорошо! \n");
                        else System.out.print("Ваши анализы показали, что вам нужно пройти дополнительное обследование! \n");
                        break;
                    case("м"):
                        res = (int) (Math.random() * 10);
                        if (res <= 5) System.out.print("В ваших анализах всё хорошо! \n");
                        else System.out.print("Ваши анализы показали, что вам нужно пройти дополнительное обследование! \n");
                        break;
                    case("кл"):
                        res = (int) (Math.random() * 10);
                        if (res != 5) System.out.print("В ваших анализах всё хорошо! \n");
                        else System.out.print("Ваши анализы показали, что вам нужно пройти дополнительное обследование! \n");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    public void showBalance() {
        System.out.print("Ваш баланс: " + balance + "\n");
    }
}



