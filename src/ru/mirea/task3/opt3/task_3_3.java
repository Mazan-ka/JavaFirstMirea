package ru.mirea.task3.opt3;

public class task_3_3 {
    public static void main(String[] args) {
      Book book_1 = new Book("1984", 215, "George Oruell");
        System.out.println(book_1.getAuthor());
        System.out.println(book_1.getNumPages());
        System.out.println(book_1.getTitle());
        book_1.changeAuthor("Tolstoy");
        book_1.changeNumPages(735);
        book_1.changeTitle("War and Piece");
        System.out.println(book_1.getAuthor());
        System.out.println(book_1.getNumPages());
        System.out.println(book_1.getTitle());
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

    public int getNumPages() {
        return numPages;
    }
    public String getAuthor() {
        return Author;
    }
    public String getTitle() {
        return title;
    }

    public void changeNumPages(int change) {
        numPages = change;
    }
    public void changeAuthor(String change) {
        Author = change;
    }
    public void changeTitle(String change) {
        title = change;
    }
}















