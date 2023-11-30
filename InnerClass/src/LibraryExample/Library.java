package LibraryExample;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public void DisplayLibraryContents() 
	{
		System.out.println("Available Books : " + books.size() + "\n");
		
		int booknum = 1;

		// Method - 1
		for (Book book : books) 
		{
			System.out.println("Book number : " + booknum);
			book.DisplayBook();
			System.out.println("\n");
			booknum++;
		}
		// Method - 2
		for (int i = 0; i < books.size(); i++) 
		{
			System.out.println("Book number : " + (i + 1));
			Book b = books.get(i);
			b.DisplayBook();
			System.out.println("\n");
		}
	}

	class Book {
		private String Title;
		private String Author;

		Book(String title, String author) {
			this.Title = title;
			this.Author = author;
		}

		public void DisplayBook() {
			System.out.println("Title : " + this.Title + "\nAuthor : " + this.Author);
		}
	}
 
	public static void main(String[] args) {
		Library lib = new Library();
		Library.Book book1 = lib.new Book("Java: The Complete Reference", "Herbert Schildt");
		Library.Book book2 = lib.new Book("Head First Java", "Kathy Sierra and Bert Bates");

		lib.addBook(book1);
		lib.addBook(book2);
		lib.DisplayLibraryContents();

	}
}
