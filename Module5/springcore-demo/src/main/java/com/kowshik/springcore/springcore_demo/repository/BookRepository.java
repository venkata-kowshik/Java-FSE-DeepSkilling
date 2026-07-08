package com.kowshik.springcore.springcore_demo.repository;
import java.util.ArrayList;
import java.util.List;
import com.kowshik.springcore.springcore_demo.model.Book;

public class BookRepository {

	private List<Book> books=new ArrayList<>();
	public void saveBook(Book book)
	{
		books.add(book);
		 System.out.println("Book Saved Successfully...");
	}
	public void displaybooks()

	{
		if(books.isEmpty())
		{
			System.out.println("No Books Available...");
			return;
		}
		else
		{
			for(Book i:books)
			{
				System.out.println(i);
			}
		}
	}
	public Book findBookById(int id)
	{
		for(Book i:books)
		{
			if(i.getId()==id)
			{
				return i;
			}
		}
		return null;
		
	}
	public void  deleteBookById(int id)
	{
		Book book=findBookById(id);
		if (book != null) {
            books.remove(book);
            System.out.println("Book Deleted Successfully...");
        } else {
            System.out.println("Book Not Found...");
        }
		
		
	}
	public void updateBook(Book newBook) {

        Book oldBook = findBookById(newBook.getId());

        if (oldBook != null) {

            oldBook.setTitle(newBook.getTitle());
            oldBook.setAuthor(newBook.getAuthor());
            oldBook.setPrice(newBook.getPrice());

            System.out.println("Book Updated Successfully...");
        } else {
            System.out.println("Book Not Found...");
        }
    }
	public void init() {
	    System.out.println("Repository Initialized");
	}

	public void destroy() {
	    System.out.println("Repository Destroyed");
	}
	

}
