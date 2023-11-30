
//Inheritance : In This all The methods and Variables from parent class will be inherited to Sub class
public class Calculator {
	int total;
	
	public void addnumbers(int x,int y) {
		this.total = x+y;
		System.out.println("ADD of Two Numbers : " + total);
	}
}
//In Child class the New methods can be Declared and also The inherited Methods can be Override
class Mycal extends Calculator{
	//Here The Parent class method is Override.
	public void addnumbers(int x,int y) 
	{
		this.total = x+y+10;
		System.out.println("Add of Two numbers override base class : " + total);
	}
	
	
	public void subnumbers(int x, int y) {
		this.total = x-y;
		System.out.println("Sub of Two Numbers : "+ total);
	}

static class calci extends Calculator{
	public void addnumbers(int x,int y,int z) 
	{
		this.total = x+y+z;
		System.out.println("Add of Three Numbres : " + total);
	}}
	
public static void main(String [] args) 
{
	int a = 10;
	int b = 20;
	Calculator calc = new Calculator();
	calc.addnumbers(a, b);

	Mycal cal = new Mycal();
	cal.addnumbers(a, b);
	cal.subnumbers(b, a);
	
	calci call = new calci();
	
	call.addnumbers(a, b , 10);
	call.addnumbers(a, b);
}
}

