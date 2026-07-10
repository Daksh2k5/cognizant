package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Loading Spring Context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Fetching BookService bean...");
        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("Testing the service...");
        bookService.addBook();
        
        System.out.println("LibraryManagementApplication executed successfully.");
    }
}
