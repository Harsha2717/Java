package Practise;
import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = -243249764179696819L;

	private int BookId;
	private String Title;
	private String Author;
	private double Price;
	
	
	Book(int id, String Title,String Author,double price)
	{
		this.BookId = id;
		this.Title = Title;
		this.Author = Author;
		this.Price = price;
	}
	
	public int get_id() {
		return BookId;
	}
	public String get_title() 
	{
		return Title;
	}
	
	public String get_author() 
	{
		return Author;
	}
	public double price() 
	{
		return Price;
	}
	
	public String toString() 
	{
		return "[ Book Id : "+this.BookId + " Title : " + this.Title + " Author : " + this.Author + " Price : " + this.Price + " ]";
	}
}
