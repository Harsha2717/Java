//This keyword is used to Refer the Instance Variable
//Using This KEyword we can call another method into current method
//this keyword cannot be used for Static values or Methods
public class MainClass {
	String Name;
	int Number ;
	MainClass(String Name , int Number)
	{
		this.Name = Name;
		this.Number = Number;
	}
	
	void display() 
	{
		//another a = new another();
		//a.display1();
		this.display1();	//this can be done in both ways Explicit and Implicit.
		System.out.println("Name : " + this.Name+"\nNumber : " + this.Number);
		display3();
	}
	
	void display1() 
	{
		System.out.println("Hello Hi How are You doing ");
	}
	
	void display2(MainClass obj) 
	{
		System.out.println("Displaying Display 2 obj ");
	}
	
	void display3() 
	{
		display2(this);
	}
	public static void main(String [] Args) 
	{
		MainClass main = new MainClass("Harsha",100);
		main.display();
	}

}
class another
{
	void display1() 
	{
		System.out.println("Calling Another Class Method by creating Object ");
	}
	
	
}
