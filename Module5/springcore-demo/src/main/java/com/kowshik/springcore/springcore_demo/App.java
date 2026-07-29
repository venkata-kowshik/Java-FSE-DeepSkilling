package com.kowshik.springcore.springcore_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kowshik.springcore.springcore_demo.model.Book;
import com.kowshik.springcore.springcore_demo.service.BookService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = (BookService) context.getBean("bookService");

        Book book1 = new Book(101, "Java Programming", "James Gosling", 500.0);
        Book book2 = new Book(102, "Spring Framework", "Rod Johnson", 750.0);

        service.addBook(book1);
        service.addBook(book2);
 
        service.viewBooks();
        service.searchBook(101);

        Book updatedBook = new Book(101, "Spring Boot", "Rod Johnson", 900.0);
        service.updateBook(updatedBook);

        service.viewBooks();
        service.deleteBook(102);
        service.viewBooks();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
