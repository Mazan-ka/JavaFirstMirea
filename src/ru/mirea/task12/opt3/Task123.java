package ru.mirea.task12.opt3;

import java.util.Arrays;

class Student implements Comparable<Student> {
    private final int studentId;
    private final String firstName;
    private final String lastName;
    private final double gpaScore;

    public Student(int studentId, String firstName, String lastName, double gpaScore) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpaScore = gpaScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpaScore() {
        return gpaScore;
    }

    @Override
    public String toString() {
        return "{" + this.studentId + " ," + this.gpaScore + "}";
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.studentId, student.studentId);
    }
}

public class Task123 {
    private static final int ARRAY_SIZE = 5;

    public static void mergeSort(Student[] first, Student[] second, Student[] merged) {
        Arrays.sort(first);
        Arrays.sort(second);
        int left = 0, right = 0;
        int i = 0;
        for (; i < merged.length && left < first.length && right < second.length; ++i) {
            merged[i] = first[left].compareTo(second[right]) > 0 ? second[right++] : first[left++];
        }
        if (left == first.length) {
            for (; right < second.length; ++right) {
                merged[i++] = second[right];
            }
        }
        if (right == second.length) {
            for (; left < first.length; ++left) {
                merged[i++] = first[left];
            }
        }
    }
    public static void main(String[] args) {
        Student[] firstArr = new Student[ARRAY_SIZE];
        Student[] secondArr = new Student[ARRAY_SIZE];
        Student[] mergedArr = new Student[ARRAY_SIZE * 2];
        firstArr[0] = new Student(1, "F", "FF", 12);
        firstArr[1] = new Student(5, "F", "MM", 10);
        firstArr[2] = new Student(4, "LL", "OEO", 21);
        firstArr[3] = new Student(12, "POL", "KORA", 22);
        firstArr[4] = new Student(3, "ER", "FAM", 12);
        secondArr[0] = new Student(23, "F", "FF", 15);
        secondArr[1] = new Student(10, "F", "MM", 10);
        secondArr[2] = new Student(14, "LL", "OEO", 21);
        secondArr[3] = new Student(9, "POL", "KORA", 22);
        secondArr[4] = new Student(2, "ER", "FAM", 12);
        System.out.println("1) " + Arrays.toString(firstArr));
        System.out.println("2) " + Arrays.toString(secondArr));
        mergeSort(firstArr, secondArr, mergedArr);
        System.out.println("Общий ряд: " + Arrays.toString(mergedArr));
    }
}
