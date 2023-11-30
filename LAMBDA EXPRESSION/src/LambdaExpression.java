/****************  Valid Lambda Expressions **********************
 * 
 * Lambda Expression can only be used in the Functional Interface which only contain a single method(SAM)
 * SAM Single Abstract method
 * The lambda Expression can be used to call the method inline without any Anonymus inner Class 
 * 
 *  When we have a method with no parameters and single output Statement
 
  	 ////////// for Void type and No Parameters ////////////
  	   
  	   
 	instance of Object name call the method and then pass the lambda expression in RoundBrackets of method call
 
 * () -> System.out.println("Hello There!");
  
 * () -> 
  		{
  			System.out.print("hello");
  			System.out.print " World!");			
		};
 
 		\\\For return type and No Parameter\\\\\
 
 *	()	-> return 8;
 *	() -> 8;
 *	() -> a;	//here a is declared in main method
 * 
 
  		\\\\\\\ With Parameter  \\\\\\\\
 
 * 	(int a) -> return a;
 * 	(int a) -> return a+10;
 * 	(int a) ->
 * 				{
 * 					System.out.println("A : " + a); //A : 10
 * 					return a;
 * 				};
  
 		\\\\\ With parameter but not DataType Specifies \\\\\\
 		
 		//we may need to use the variable hence we need to give it a name 
 		  but when we have two Functional interfaces With same Method Signature and parameters
 		  then we need to Explicitly declare the Type to avoid Ambigity
 		  which Method to call 
 		  error : The method run(Executable) is ambiguous for the type Runnable
 	
 * 	(a) -> return a;
 * 	(a) -> return a+10;
 * 	(a) ->
  			{
  				System.out.println("A : " + a); //A : 10
  				return a;
 			};
 			
 	// if there is no ambiguos type then we can directly use LamdaExpression as
 	 * a -> return a; 
 	 *\\\ only when there is one parameter the round brackets are not neccesary
 		
 		//////////   Multiple Parameters /////////////
 	(a,b) ->
 		{
			System.out.println("a : " + a +" b : " + b) ;
			return a+b;
		});
 			
   
 * 
 * 
 */


@FunctionalInterface
interface Executable
{
	int execute(int a,int b);
}

@FunctionalInterface
interface StringExecutable
{
	String execute(String a);
}

class Runnable
{
	public void run(Executable e) 
	{
		//System.out.println("I am A run Method in Runnable class");
		int value = e.execute(10,20);
		System.out.println("Return value is : " + value);
	}
	
//	public void run(StringExecutable e) 
//	{
//		//System.out.println("I am A run Method in Runnable class");
//		String value = e.execute("String Executable...");
//		System.out.println("Return value is : " + value);
//	}
//	
	

}

public class LambdaExpression 
{
	public static void main(String [] args) 
	{
		Runnable runnable = new Runnable();
		
		System.out.println("\n=================  Using Anonymus Class  ====================\n");
		runnable.run(new Executable() {
			public int execute(int a,int b) 
			{	
				//We can Only return the value if required
				//System.out.println("I am a Anonymus Implementation of Interface method execute");
				System.out.println("a : " + a + " b : " + b) ;
				return a+b;
			}
		});
				
//		runnable.run(new StringExecutable() 
//		{
//			public String execute(String a) 
//			{
//				//System.out.println("I am a Anonymus Implementation of Interface method execute");
//				return "Namaste";
//			}
//		});

		System.out.println("\n=================  Using Lambda Expression  ====================\n");
		
		runnable.run( (a,b) ->
		{
			//System.out.println("i am a Lambda Expression in Runnable Instance") ;
			System.out.println("a : " + a +" b : " + b) ;
			return a+b;
		});
		
//		runnable.run((String b) -> {
//			return "Namaste";
//			});
	}
}