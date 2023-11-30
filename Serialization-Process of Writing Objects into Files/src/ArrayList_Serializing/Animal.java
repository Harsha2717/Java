package ArrayList_Serializing;
import java.io.Serializable;

public class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name ;
	private String Type;
	private int num;
	
	Animal(String name,String Type,int num)
	{
		this.name = name;
		this.num = num;
		this.Type = Type;
	}
	public String get_name() 
	{
		return name;
	}
	public int get_num() 
	{
		return num;
	}
	
	public String toString() 
	{
		//String Format = String.format("Name	: %-5s \nID	: %-5d\nType	: %-5s\n",name,num,Type);
		
				//OR
			
		return String.format("Name	: %-5s \nID	: %-5d\nType	: %-5s\n",name,num,Type);
	}
}
