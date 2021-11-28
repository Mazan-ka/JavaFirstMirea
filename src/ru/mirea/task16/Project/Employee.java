package ru.mirea.task16.Project;

import java.util.Scanner;
import java.util.Vector;

public class Employee {
    private String position;
    private Vector patient = new Vector();

    Employee(String key) {
        position = key;
    }

    public void addPatient (Patient p) {
        patient.addElement(p);
    }

    public void delPatient (int index) {
        patient.remove(index);
    }
}
