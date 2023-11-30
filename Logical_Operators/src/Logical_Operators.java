
public class Logical_Operators {
	public static void main(String [] args) 
	{
		int x = 50; int y = 60;
		if(x>10 && y>50) 
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		if(x>10 || y >100) 
		{
			System.out.println("True");
		}
		

		System.out.println((100>1 && 100<200));
		
		System.out.println(!(100>1 && 100<200));
		
		if(!(x<10)) 
		{
			System.out.println("True");
		}
	}
}
