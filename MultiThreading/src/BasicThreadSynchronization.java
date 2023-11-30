import java.util.Scanner;

class App extends Thread
{	
	//private boolean execute = true; //This is a Instance Variable that sarify the condition to execute a Thread
	//This may not be Visible or work with some Applications so we make the Instance Variable as volatile
	
	private volatile boolean execute = true;	//This works every Time
	
	public void stopexecution() 
	{
		execute = false;
	}
	
	//This code runs in one thread and Main Method runs in another Thread
	public void run() 
	{		
		while(execute) 
		{
			System.out.println("Hello ");
			try 
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e) 
			{
				System.err.println(e.getMessage());
			}
		}
	}
}
public class BasicThreadSynchronization 
{
	/*
	 * Threads can have a Instance that can start or Stop the Execution of a Thread and
	 * We can create the Instance as Volatile so that they are Visible to all the Threads and every Thread can Modify them
	 */
	public static void main(String [] args) 
	{
		//The main runs in another Thread
		App app = new App();
		App app1 = new App();
		app.start();
		app1.start();
		
		System.out.println("return Enter to Stop");
		try(Scanner sc = new Scanner(System.in))
		{			
			sc.nextLine();
			app.stopexecution();
			app1.stopexecution();
		}
		
	}

}
