package Practice;

import java.io.IOException;
import java.util.ArrayList;

public class Book {
	private String Title;
	private String Author;
	private int PublicationYear;
	private boolean Available ;
	private String Gener;
	
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPublicationYear() {
		return PublicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		PublicationYear = publicationYear;
	}

	public boolean isAvailable() {
		return Available;
	}

	public void setAvailable(boolean availability) {
		Available = availability;
	}

	Book(String Title,String Author,int publication,Gener gener)
	{
		this.Title = Title;
		this.Author = Author;
		this.PublicationYear = publication;
		this.Gener = gener.get_gener();
	}	
	ArrayList<Book> books = new ArrayList<>();

	
	
	public void AddBooks(Book book) 
	{
		try 
		{
			if(book.isAvailable() == true) 
			{
				books.add(book);				
			}else 
			{
				throw new IOException("Book Not Available");
			}
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public  void displayListOfBooks() 
	{
		System.out.println(books);
	}
	
	
	public String toString() 
	{
		return "Title : " + this.Title +"\tAuthor : "+this.Author+"\tPublished Year : " + this.PublicationYear+"\tGener : " + this.Gener+ "\tAvailable : " + this.isAvailable();
	}
}

