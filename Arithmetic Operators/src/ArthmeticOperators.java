
public class ArthmeticOperators 
{
	public static void main(String [] Args) 
	{
		int a = 10;
		int b = 20;
		//long l = 9223372036854775807L;
		//short s = 32767;
		//byte by = 126;
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		int remainder = a%b;	//a divided by b and remainder is stored.
		
		int post_increment = a++;
		int post_decrement = a--;
		
		int pre_increment = ++a;
		int pre_decrement = --a;
		
		System.out.println("a + b = " + add);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + div);
		System.out.println("a % b = " + remainder);
		System.out.println("post increment a++ : " + post_increment);
		System.out.println("post decrement a-- : " + post_decrement);
		System.out.println("pre increment ++a : " + pre_increment);
		System.out.println("pre decrement --a : " + pre_decrement);
	}
}
