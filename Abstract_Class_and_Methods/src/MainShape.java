
/*
 * An Abstract class is defined as a Base class or Blueprint which consists of methods 
 * and Parameters which are hidden from user and the implementation should be done in Sub class
 * The Abstract class can consists of abstract methods and non abstract methods and attributes
 * The Abstract Method doesn't contains any body it must be implemented in Subclass.
 * The Abstract Method can only be declared in abstract class
 * If the Abstract Method is Not Implemented in Sub Class Error will be Thrown
 * The Abstract Class can be defined as varibale and can be Used directly 
 * i.e The Abstract class Shape can be used to Call the methods by declaring the Shape as varible type
 */
abstract class Shape	//Abstract Class
{
	abstract double calculateArea();	//Abstract method
	abstract double calculatePerimeter();
	public void printDetails() 	//Concrete Method or Non Abstract method
	{
		System.out.println("Area : \n Perimeter :");
	}
}
class Circle extends Shape{	//Sub Class or Child Class
	double area;
	double perimeter;
	double radius;
	
	//Constructor for Circle with one Argument used for initializing the Parameter.
	Circle(double radius_value)
	{
		this.radius = radius_value;
	}
	
	//Abstract method Implementation
	
	double calculateArea() 
	{
		area = (3.14*(radius*radius));
		return area;
	}
	double calculatePerimeter() 
	{
		perimeter = 2*3.14*radius;
		return perimeter;
	}
	
	public void printDetails() 
	{
		System.out.println("Circle Area : "+area + "\nCircle Perimeter : "+ perimeter);
	}
}
class Rectangle extends Shape
{
	double area;
	double perimeter;
	double length;
	double bredth;
	
	Rectangle(double length_value,double bredth_value)
	{
		this.length = length_value;
		this.bredth = bredth_value;
	}
	double calculateArea() 
	{
		area = length*bredth;
		return area;
	}
	double calculatePerimeter() 
	{
		perimeter = (2*(length+bredth));
		return perimeter;
	}
	public void printDetails() 
	{
		System.out.println("Area of Rectangle : " + area + "\nPerimeter of Rectangle : "+perimeter);
	}
}


public class MainShape {
	public static void main(String [] args) {
		
	Shape circle = new Circle(2.5);	//Uses Constructor to initialize the Value
	
	circle.calculateArea();//Invokes circle calculate Area method
	circle.calculatePerimeter(); //Invokes circle calculate Perimeter method
	
	circle.printDetails(); //Invokes circle Print Method
	
		
	Shape rectangle = new Rectangle(25,35);
	System.out.println("\n------------------------\n");
	
	rectangle.calculateArea();	//Invokes Rectangle calculateArea Method
	rectangle.calculatePerimeter();	//Invokes Rectangle CalculatePerimeter Method
	rectangle.printDetails();
	}
}
