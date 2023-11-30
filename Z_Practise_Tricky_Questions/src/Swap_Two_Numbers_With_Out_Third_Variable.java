
public class Swap_Two_Numbers_With_Out_Third_Variable {
	public static void main(String [] args) 
	{
		int a =10; int b = 20;
		System.out.println("Before");
		System.out.println("a : " + a+ "  b : " +b);
		System.out.println("After");
		//Using BitWise XOR operator
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("a : " + a+ "  b : " +b);
		
		
		int c = 30 , d=40;
	
		System.out.println("Before");
		System.out.println("c : " + c+ "  d : " +d);
		System.out.println("After");
		//Using Arithmetic operator add total and substracting each
		c = c+d;
		d = c-d;
		c = c-d;
		System.out.println("c : " + c+ "  d : " +d);
		
		int e = 30 , f = 40;
		
		System.out.println("Before");
		System.out.println("e : " + e+ " f : " +f);
		System.out.println("After");
		//Using Arithmetic operator Mulitply total and divide each
		
		e = e*f;
		f = e/f;
		e = e/f;
		System.out.println("e : " + e+ " f : " +f);
		
	}

}
