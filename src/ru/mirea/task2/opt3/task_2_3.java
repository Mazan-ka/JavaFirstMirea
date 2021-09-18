package ru.mirea.task2.opt3;

public class task_2_3 {
    public static void main(String[] args) {
        Book book_1 = new Book("1984", 215, "George Oruell");
        System.out.println(book_1);
    }
}

class Book {
    private String title;
    private int numPages;
    private String Author;

    public Book (String title, int numPages, String Author) {
        setNumPages(numPages);
        setTitle(title);
        setAuthor(Author);
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        Author = author;
    }

    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", numPages=" + numPages + ", Author='" + Author + '\'' + '}';
    }
}
