package ru.mirea.task12.opt2;
import java.util.Arrays;
import java.util.Comparator;

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
        return Double.compare(this.studentId, student.studentId);
    }
}

public class Task122 {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Student[] idNumber = new Student[ARRAY_SIZE];
        idNumber[0] = new Student(1, "F", "FF", 15);
        idNumber[1] = new Student(5, "F", "MM", 10);
        idNumber[2] = new Student(4, "LL", "OEO", 21);
        idNumber[3] = new Student(12, "POL", "KORA", 22);
        idNumber[4] = new Student(3, "ER", "FAM", 12);
        idNumber[5] = new Student(11, "", "M", 7);
        System.out.println(Arrays.toString(idNumber));
        quick_sort(idNumber, 0, ARRAY_SIZE);
        System.out.println(Arrays.toString(idNumber));
    }

    private static void quick_sort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high-1)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - 1 - low) / 2;
        Student opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high-1;
        while (i <= j) {
            while (opora.compareTo(array[i]) > 0) {
                i++;
            }

            while (array[j].compareTo(opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quick_sort(array, low, j);

        if (high > i)
            quick_sort(array, i, high);
    }
}
