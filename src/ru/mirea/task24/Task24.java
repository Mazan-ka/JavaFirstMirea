package ru.mirea.task24;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task24 {
    public static void main(String[] args) {
        List <String> ipAdress = new ArrayList<>();
        ipAdress.add("255.255.255.0");
        ipAdress.add("127.0.0.1");

        //Неправильные ip-адреса:
        ipAdress.add("1300.6.7.8");
        ipAdress.add("abc.def.gha.bcd");

        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);

        for(String ip : ipAdress){
            Matcher matcher = pattern.matcher(ip);
            System.out.println(ip +" : "+ matcher.matches());
        }
    }
}
