
public class ComparisionOperatorsExample 
{
	public static void main(String [] args) 
	{
		
		for(int i=0;i<=25;i++) 
		{
			double a = Math.random();
			double b = Math.random();

			if(a>b) 
			{
				System.out.println("A is Greater than B");
			}else if(a<b) 
			{
				System.out.println("A is Less than B");
			}
			else if(a<=b) {
				System.out.println("A is less than or Equal to B");
			}
			else {
				System.out.println("A is Greater than or Equal to B");
			}

		}
	}

}
