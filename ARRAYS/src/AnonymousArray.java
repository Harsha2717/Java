//Anonymous Array Are the Arrays that are Used for Temporary storage of the arrays or for temporary condition
public class AnonymousArray 
{
	public static void ArrayPrinter(int [] arr) 	//Static Hence no object Required to Access
	//public void ArrayPrintter(int [] arr)	//non static hence object required to access
	{
		System.out.println("Ananomus - Array Created in Method ");
		for(int i:arr) 
		{ 
			System.out.print(i  + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		//AnonymousArray aa = new AnonymousArray();	//When method is non Static obj is created 
		//aa.ArrayPrinter(new int[] {1,2,3,4,5});	//object to access method with class name
		
		ArrayPrinter(new int[] {1,2,3,4,5});
		System.out.println("Ananomus - Array created in Condition ");	//Created Temporary array after loop The memory is Released
		for(int i : new int[] {10,20,30,40,50})
		{
			System.out.print(i + " ");
		}
	}
}

