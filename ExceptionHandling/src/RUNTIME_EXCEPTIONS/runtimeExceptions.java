package RUNTIME_EXCEPTIONS;
//Runtime Exceptions are the Exceptions that cannot be identified at the compiler time 
//This are mostly need to be needed to be handled.
//This are need to be Handled to avoid Termination of Program
//This are Easy to Identify
public class runtimeExceptions {
	public static void main(String[] args) {
	
		//Throws Arithmetic Exception 
		int a = 10, d = 0;
		System.out.println(a + " , " +d);
		//int c = a/d;
		
		//Throws Null Pointer Exception
		String str = null;
		//System.out.println(str.length());
		
		System.out.println(str);
		//Throws IndexOutOfBound Exception
		
		//StringIndexOutOfBound Exception
		String [] str_arr = {"Harsha","Sirisha","Vaibu","Sindhuu"};

		//System.out.println(str_arr[4]);
		System.out.println(str_arr[1]);
		
		//ArrayIndexOutOfBoundException
		int [] arr = {1,2,3,4};
		//System.out.println(arr[4]);
		System.out.println(arr[3]);
		
		try 
		{
			String [] str_arr1 = {"Harsha","Sirisha","Vaibu","Sindhuu"};
			System.out.println(str_arr1[3]);			
			System.out.println(str_arr1[4]);			
		}
		catch(RuntimeException e) 
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}
}
