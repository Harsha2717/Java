 import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainClass 
{
	public static void main(String [] args) 
	{
		//creating a object and passing parameters and calling method using object
		Library lib = new Library("Central Library","123 Main st");
		lib.get_details();
		
		//Creating two genre objects and passing the parameters
		Genre fiction = new Genre("Fictional");
		Genre non_fiction = new Genre("Non Fictional");
		
		///Creating two book objects with details
		Book book1 = new Book("123456789", "Book 1", "Author 1", fiction);
		Book book2 = new Book("556655959", "Book 2", "Author 2" ,non_fiction);
		
		//Using library object adding the book to library 
		lib.add_book(book1);
		lib.add_book(book2);
		
		int choice ;	//creating a option
		System.out.println("Available Actions :");
		System.out.println("1. Borrow a Book\n2. Return a Book\n3. List all the Available books\n4. Exit");
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
					System.out.println("Option 1");	
					
					break;
				case 2:
					System.out.println("Option 2");
					break;
				case 3:
					System.out.println("Option 3");
					System.out.println("Books Available are : ");
					lib.List_all_the_books();
					break;
				case 4:
					System.out.println("Good Bye");
					break;
				default:
					System.out.println("Out Of the choice Please Try Again");
					choice = 0;
					//choice = sc.nextInt();
			}
		}while(choice!=4 && choice<=4&& choice >= 0) ;
		sc.close();
	}
} 
class Genre{
	private String name;
	
	Genre(String Name)
	{
		this.name = Name;
	}
	
	String get_gener() {
		return this.name;
	}
}
class Book
{
	private String ISBN;
	private String Title;
	private String Author;
	boolean Availablility;
	private Genre genre;
	
	public Book(String isbn,String title,String author,Genre genre)
	{
		this.ISBN = isbn;
		this.Title = title;
		this.Author = author;
		this.genre = genre;
		this.Availablility = true;
	}

	public String get_ISBN() 
	{
		return this.ISBN;
	}
	
	public String get_title() 
	{
		return this.Title;
	}
	
	public String get_author() 
	{
		return this.Author;
	}
	
	public Genre get_genre() 
	{
		return this.genre;
	}
	
	public boolean get_Availability() 
	{
		return this.Availablility;
	}
	

	public void Mark_book_as_borrowed() 
	{
		this.Availablility = false;
	}
	
	public void Mark_book_as_returned() 
	{
		this.Availablility = true;
	}
	public boolean Availability_check() 
	{
		if(Availablility) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
class Library
{
	private String Name;
	private String Address;
	private List<Book>Inventory;
	
	Library(String name , String address)
	{
		this.Name = name;
		this.Address = address;
		this.Inventory = new ArrayList<Book>();
	}
	
	public void add_book(Book book) 
	{
		Inventory.add(book);
	}
	public void return_book(Book book) 
	{
		Inventory.remove(book);
	}
	public void List_all_the_books() 
	{
		for(Book books : Inventory) 
		{
			System.out.println( "[ ISBN : " + books.get_ISBN() +" ] [ Title : " + books.get_title() 
					+ " ] [ Author : "+books.get_author() + " ] [ Genre : "+books.get_author() 
					+ " ] [ Availability : " + books.Availability_check() + " ]");
		
		}
	}
	public void get_details() 
	{
		System.out.println("Library System\n--------------");
		System.out.println("Library Name: " + this.Name);
		System.out.println("Library Address: " + this.Address + "\n");
	}
	
	
	
}

