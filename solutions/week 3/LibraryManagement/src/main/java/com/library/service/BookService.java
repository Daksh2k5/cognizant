package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected via Setter!");
    }

    public void addBook() {
        System.out.println("Service: Delegating to repository...");
        bookRepository.save();
    }
}
