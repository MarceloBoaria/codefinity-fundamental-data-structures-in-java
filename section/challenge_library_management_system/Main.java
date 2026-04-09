package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1, "1984", "George Orwell");
        Book book2 = new Book(2, "Brave New World", "Aldous Huxley");
        Book book3 = new Book(3, "Fahrenheit 451", "Ray Bradbury");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayAllBooks();
        List<Book> orwellBooks = library.findBooksByAuthor("George Orwell");
        System.out.println("Books by George Orwell: " + orwellBooks.size());
    }
}