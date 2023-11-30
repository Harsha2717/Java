package ArraySerializing;
import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String get_name() 
	{
		return name;
	}
	public int get_age() 
	{
		return age;
	}
	
	public String toString() 
	{
		return "[ Name\t: " + name + "  , Age : " + age + " ]";
	}
}
	
