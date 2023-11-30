
public class PrimitiveTypes_Formatting 
{
	public static void main(String[] args) 
	{
		//This can be Done c Style
		//Formatting Integers
	
		//Basic
		System.out.printf("The formating of int : %d %d \n",3,5);
		
		System.out.println();
		
		//Width
		System.out.printf("The Width is set to 15 : %15d %15d \n" ,5,6);
		
		//Right Justify
		System.out.printf("This is Right Justfication  : %15d %15d \n",5,6);
		
		//Left Justify
		System.out.printf("This is Left  Justfication  : %-15d %-15d \n",5,6);
		
		
		System.out.println("\n=========Floating Point==========\n");
		
		//Floating Number formatting
		System.out.printf("The formating of float	: %f %f \n",5.6,6.7);
		
		//Precision setting
		System.out.printf("The Presicion is Set to 2 : %.2f %.2f \n",5.6,6.7);
		
		//Width and precision
		System.out.printf("The Width is set to 15 : %15.1f %15.1f \n" ,5.6,6.7);
		
		//Right Justify and precision
		System.out.printf("This is Right Justfication  : %15.1f %15.1f \n",5.6,6.7);
		
		//Left Justify and Precision
		System.out.printf("This is Left Justification : %15.1f %15.1f \n",5.6,6.7);
		
		//Char formatting
		System.out.println("\n=========Char Formating==========\n");
		System.out.printf("The Formating of char %c\n",'H');
		System.out.printf("Right Justify of char %5c\n",'a');
		System.out.printf("Left  Justify of char %-5c\n",'r');
		
		
		//Boolean formatting
		System.out.println("\n=========Boolean Formating==========\n");
		System.out.printf("Boolean Formating %5b\n",true);
		System.out.printf("Right Justify %10b\n",false);
		System.out.printf("Left  Justify %-10b\n",true);
	}
}
