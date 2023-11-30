package Comparator_SortingTheLists;

import java.util.*;
class Product
{
	private String name;
	private double price;
	
	public String getName() {return name;}
	public double getPrice() {return price;}
	
	Product(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		return name + " -- " + price;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(name , price);
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Product p = (Product)o;
		return name.equals(p.getName()) && price == p.getPrice();
	}
	
	
}

public class SortingByPriceandThenByName 
{
	public static void main(String [] args) 
	{
		Product Soap = new Product("Santoor" , 43.35);
		Product Shampoo = new Product("Dove" , 96.49);
		Product ToothPaste = new Product("Dabur" , 127.10);
		Product Brush = new Product("Colgate" , 20.00);
		Product Conditioner = new Product("Chick" , 103.65);
		Product HandWash = new Product("Dettole",43.35);
		
		List<Product> list = new ArrayList<Product>();
		list.add(Soap);
		list.add(Shampoo);
		list.add(ToothPaste);
		list.add(Brush);
		list.add(Conditioner);
		list.add(HandWash);
		
		System.out.println("\n==========  List before Sorting ================\n");
		for(Product p : list) 
		{
			System.out.println(p.getName() + "		:	" + p.getPrice());
		}
		
		
		Collections.sort(list,new lowToHigh());
		
		
		
		System.out.println("\n==========  List After  Sorting ================\n");
		for(Product p : list) 
		{
			System.out.println(p.getName() + "		:	" + p.getPrice());
		}
	
	
	}
}

class lowToHigh implements Comparator<Product>
{
	@Override
	public int compare(Product p1,Product p2) 
	{
		if(p1.getPrice() > p2.getPrice())
		{
			return 1;
		}
		else if(p1.getPrice() < p2.getPrice()) 
		{
			return -1;
		}
		else if(p1.getPrice() == p2.getPrice()) 
		{
			return p1.getName().compareTo(p2.getName());
		}
		return 0;
	}
}