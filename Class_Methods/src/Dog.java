
public class Dog {
	int age;
	String Name;
	String Colour;
	String Size;
	
	public  void set_details(int age_val,String Name_val,String Colour_val,String Size_val) 
	{
		age = age_val;
		Name = Name_val;
		Colour = Colour_val;
		Size = Size_val;
	}
	
	public void get_details() {
		System.out.println("Dog Name : " + Name);
		System.out.println("Dog Age : " + age);
		System.out.println("Dog Colour : " + Colour);
		System.out.println("Dog Size : " + Size);
	}
	public void get_Age(int age)
	{
		System.out.println("Dog Age : " + age);
	} 
	
	public void get_name(String name) 
	{
		System.out.println("Dog name : " + name);
	}
	public void get_colour(String colour) 
	{
		System.out.println("Dog Colour : " + colour);
	}

}
