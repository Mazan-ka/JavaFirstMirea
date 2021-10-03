package ru.mirea.task9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;

public class Task91
{
    public static void run() {
        //Создадим окно и установим заголовок
        final JFrame window = new JFrame("Football match");
        final int[] x = { 0, 0 };
        final int[] y = { 0, 0 };
        final String[] result = {"Result "+ x[0] +" : "+ y[0] +"", "Last Scorer: N/A", "Winner: DRAW"};

        //Подключаем иконку из корня папки проекта
        ImageIcon img = new ImageIcon("Java.png");
        window.setIconImage(new ImageIcon(Task91.class.getResource("Java.png")).getImage());

        //Событие "закрыть" при нажатии по крестику окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Создадим панель
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);

        //Создадим кнопки
        JButton firstTeamButton = new JButton("Madrid");
        firstTeamButton.setBackground(Color.RED);
        JButton secondTeamButton = new JButton("Milan");
        secondTeamButton.setBackground(Color.GREEN);

        //Создадим выводные панели
        JTextArea OutputScore = new JTextArea(result[0]);
        JTextArea LastScorer = new JTextArea(result[1]);
        JTextArea Winner = new JTextArea(result[2]);

        //Событие для кнопки "Первая команда"
        firstTeamButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                if (secondTeamButton.isEnabled()) {
                    x[0]++;
                    x[1]++;
                    result[0] = Arrays.toString(new String[]{"Result " + x[0] + " : " + y[0] + ""});
                    result[1] = "Last Scorer: Madrid";
                    if (x[1]>y[1]) result[2] = "Winner: Madrid";
                    if (x[1]==y[1]) result[2] = "Winner: DRAW";
                }
                OutputScore.setText(result[0]);
                LastScorer.setText(result[1]);
                Winner.setText(result[2]);
            }
        });

        //Событие для кнопки "Вторая команда"
        secondTeamButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                if (secondTeamButton.isEnabled()) {
                    y[0]++;
                    y[1]++;
                    result[0] = Arrays.toString(new String[]{"Result " + x[0] + " : " + y[0] + ""});
                    result[1] = "Last Scorer: Milan";
                    if (y[1]>x[1]) result[2] = "Winner: Milan";
                    if (y[1]==x[1]) result[2] = "Winner: DRAW";
                }
                OutputScore.setText(result[0]);
                LastScorer.setText(result[1]);
                Winner.setText(result[2]);
            }
        });

        //Добавим кнопки и поля на панель
        panel.add(firstTeamButton);
        panel.add(OutputScore);
        panel.add(secondTeamButton);
        panel.add(LastScorer);
        panel.add(Winner);

        //Добавим панель в окно
        window.getContentPane().add(panel);

        window.pack();

        //Разместим программу по центру
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    //Запускаем
    public static void main(String[] args) {
        run();
    }
}