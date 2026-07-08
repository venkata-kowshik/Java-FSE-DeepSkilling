package com.kowshik.springcore.springcore_demo.service;

import com.kowshik.springcore.springcore_demo.model.Book;
import com.kowshik.springcore.springcore_demo.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Correct setter for Spring injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        if (book.getPrice() < 0) {
            System.out.println("❌ Price cannot be negative");
            return;
        }
        bookRepository.saveBook(book);
    }

    public void viewBooks() {
        bookRepository.displaybooks();
    }

    public void searchBook(int id) {
        Book book = bookRepository.findBookById(id);
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book Not Found...");
        }
    }

    public void updateBook(Book book) {
        bookRepository.updateBook(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteBookById(id);
    }
}
