package Practice;

public class MainLibrary 
{
	public static void main(String [] args) 
	{
		Library lib = new Library();
		
		Book book1 = new Book("To Kill a Mockingbird","Harper Lee",1960,Gener.FICTION);
		Book book2 = new Book("1984","George Orwell",1949,Gener.HORROR);
		lib.addBook(book1);
		lib.addBook(book2);
		System.out.println();
		lib.displayListofBooks();
		System.out.println();
		
		
		lib.searchBook("1984");
		System.out.println();
		
		lib.removeBook(book2);
		System.out.println();
		
		
	}
}
