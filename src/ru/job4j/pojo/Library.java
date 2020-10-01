package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 234);
        Book foundation = new Book("Foundation", 523);
        Book war = new Book("War", 107);
        Book guitar = new Book("Guitar", 1234);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = foundation;
        books[2] = war;
        books[3] = guitar;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getSheets());
        }
        System.out.println("Replace 1 and 4 books");
        books[0] = guitar;
        books[3] = cleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getSheets());
        }
        System.out.println("Print only Clean Code book");
        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getSheets());
            }
        }
    }
}
