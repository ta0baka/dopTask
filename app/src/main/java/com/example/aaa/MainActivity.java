package com.example.aaa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Library library = new Library();

        // Создаем авторов
        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Федор Достоевский");

        // Создаем книги
        Book book1 = new Book("Война и мир", author1, "Роман");
        Book book2 = new Book("Анна Каренина", author1, "Роман");
        Book book3 = new Book("Преступление и наказание", author2, "Роман");

        // Добавляем книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Выводим книги и авторов
        library.displayBooks();
        library.displayAuthors();
        library.displayBooksByGenre();
    }
}