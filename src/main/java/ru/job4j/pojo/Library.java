package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book history = new Book("History", 100);
        Book roman = new Book("Roman", 200);
        Book cleanCode = new Book("Clean code", 120);
        Book fantastic = new Book("Fantastic", 140);
        Book[] books = new Book[4];
        books[0] = history;
        books[1] = roman;
        books[2] = cleanCode;
        books[3] = fantastic;
        System.out.println("First cycle" + System.lineSeparator());
        for (Book array : books) {
            System.out.println(array.getName() + " - " + array.getPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println(System.lineSeparator() + "Second cycle" + System.lineSeparator());

        for (Book array : books) {
            System.out.println(array.getName() + " - " + array.getPages());

        }

        System.out.println(System.lineSeparator() + "Third cycle" + System.lineSeparator());

        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }

        }

    }
}


