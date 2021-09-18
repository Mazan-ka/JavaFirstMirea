package ru.mirea.task4.opt1;

public class task_4_1 {
    public static void main(String[] args) {
        Author avtor = new Author("Ivanov", "ivanov.d@gmail.com", 'm');
        System.out.println(avtor);
    }
}

class Author {
    private String name;
    private  String email;
    private char gender;

    public  Author(String name, String email, char gender){
        this.name = name;
        this.gender = gender;
        setEmail(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
}
