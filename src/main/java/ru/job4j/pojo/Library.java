package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 950);
        Book headFirst = new Book("Head First", 1150);
        Book thinkInJava = new Book("Thinking in Java", 1300);
        Book coreJava = new Book("Core Java", 900);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirst;
        books[2] = thinkInJava;
        books[3] = coreJava;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getTitle())) {
                System.out.println(book.getTitle() + " - " + book.getPages());
            }
        }
    }
}
