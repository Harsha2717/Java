/*Polymorphism:
 * Basically Polymorphism is Oops concept which is used to make the Code More Effective 
 * and Efficient while used.It consists of two methods Overloading and Overriding
 * Overloading is Static Polymorphism and Overriding is Dynamic Polymorphism
 * Static Polymorphism is Binding at compile time 
 * Dynamic Polymorphism is Late Binding or Run time Binding
 */
public class MethodOverloading {
	public int add_num(int a,int b) 
	{
		return (a+b);
	}
	//Method Add_num is taking multiple forms in the Class and When the method is called
	//the method which is satisfy the parameters will in invoked.
	public int add_num(int a,int b,int c) 
	{
		return (a+b+c);
	}
	public double add_num(double a,double b) 
	{
		return (a+b);
	}

	public static void main(String [] args) 
	{
		MethodOverloading add = new MethodOverloading();
		
		System.out.println("Adding Two int numbers : " + add.add_num(10, 30 , 30));

		System.out.println("Adding Two double numbers : " + add.add_num(1.0, 3.0));
	}
}
