package Practice;

import java.io.IOException;
import java.util.ArrayList;

public class Library 
{
	ArrayList<Book> books = new ArrayList<>();
	int count =0;
	
	public void addBook(Book book) 
	{
		count++;
		books.add(book);
		book.setAvailable(true);
	}
	
	public void removeBook(Book book) 
	{
		if(count > 0 ) 
		{
			books.remove(book);
			count--;			
			System.out.println("Book : " + book.getTitle() + "\tRemoved Successfully\n");
			book.setAvailable(false);
		}else 
		{
			System.out.println("There Are No Books Present");
		}
	}
	
	public void displayListofBooks() 
	{
		if(books.size() > 0 ) 
		{
			System.out.println("Available Books \n");
			int num = 1;
			for(Book book : books) 
			{
				System.out.println( num + " : " + book);
				num++;
			}
		}else 
		{
			System.out.println("No Books Available");
		}
	}
	
	public void searchBook(String title) 
	{
		for(Book book : books) 
		{		
			if(book.getTitle() == title) 
			{
				if(book.isAvailable() == true) 
				{
					System.out.println("Book : " + book.getTitle() + " is Available.");
				}else 
				{					
					System.out.println("Book : " + book.getTitle() + " is Not Available.");
				}
			}
		}
	}
	
	public void takeAbook(String title) 
	{
		for(Book book : books) 
		{
			try
			{
				if(books.size() > 0) 
				{
					if(book.isAvailable()) 
					{
						if(book.getTitle() == title) 
						{
							removeBook(book);
							System.out.println("Book : " + book + " is taken Successfully....");
							book.setAvailable(false);
						}
					}
					
				}
				else 
				{
					throw new IOException("Books are Not Available");
				}
			}catch(IOException e) 
			{
				
			}
		}
	}
}
