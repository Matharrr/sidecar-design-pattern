package com.mr.book_service.service;

import com.mr.book_service.dto.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> getBooks() {
        return books;
    }
}
