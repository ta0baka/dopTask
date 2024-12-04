package com.example.aaa;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import android.util.Log;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;
    private String genre;

    public Book(String title, Author author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + ", genre='" + genre + "'}";
    }
}


public class Library {
    private List<Book> books;
    private Set<Author> authors;
    private Map<String, List<Book>> booksByGenre;

    public Library() {
        books = new ArrayList<>();
        authors = new HashSet<>();
        booksByGenre = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        authors.add(book.getAuthor());
        booksByGenre.putIfAbsent(book.getGenre(), new ArrayList<>());
        booksByGenre.get(book.getGenre()).add(book);

        Log.d("Library", "Книга добавлена: " + book);
    }

    public void displayBooks() {
        Log.d("Library", "Список всех книг:");
        for (Book book : books) {
            Log.d("Library", book.toString());
        }
    }

    public void displayAuthors() {
        Log.d("Library", "Список уникальных авторов:");
        for (Author author : authors) {
            Log.d("Library", author.toString());
        }
    }

    public void displayBooksByGenre() {
        Log.d("Library", "Список книг по жанрам:");
        for (Map.Entry<String, List<Book>> entry : booksByGenre.entrySet()) {
            Log.d("Library", "Жанр: " + entry.getKey() + ", Книги: " + entry.getValue());
        }
    }
}