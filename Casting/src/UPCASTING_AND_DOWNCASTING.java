class Machine
{
	public void Start() 
	{
		System.out.println("Machine Started..");
	}
	public void Stop() 
	{
		System.out.println("Machine Stopped..");
	}
}

class Camera extends Machine
{
	public void Start() 
	{
		System.out.println("Camera Started..");
	}
	public void Snap() 
	{
		System.out.println("Picture Taken..");
	}
}
public class UPCASTING_AND_DOWNCASTING 
{
	public static void main(String[] args) throws ClassCastException
	{
		Machine mac = new Machine();
		System.out.println("\n==========Machine Class Methods==========\n");
		mac.Start();
		mac.Stop();
		
		Camera cam  = new Camera();
		System.out.println("\n=========Camera Class Methods=============\n");
		cam.Start();
		cam.Snap();
		cam.Stop();	//Machine Methods can be called because it inherits all the methods of the Parent Class
		
		
		Machine mac4 = new Camera();
		mac4 = cam;	//Up Casting
		mac4.Start();
		cam = (Camera)mac4;	//Down Casting
		cam.Snap();
		//Up Casting
	
		System.out.println("\n=========Upcasting Cam Class =============\n");
		Machine mac1 = cam;
		mac1.Start();	//Calls the camera Start method
		mac1.Stop();	//Calls the Machine Stop method
	
		//Down Casting
		
		System.out.println("\n=========Downcasting Machine Class =============\n");
		Machine mac2 = new Camera();
		if(mac2 instanceof Camera) 
		{
			Camera cam2 = (Camera)mac2;
			cam2.Stop();		//can access the method of Base class
			cam2.Snap();		//Can also access the method  of Sub class
		}
		
		try  
		{
			if(mac2 instanceof Camera) 
			{
				Camera cam3 = (Camera)mac2;
				cam3.Start();
			}else
				throw new ClassCastException("Unable to perform DownCast As The object is Not instance of class");
		}catch(ClassCastException e) 
		{
			System.err.println(e.getMessage());
		}
		
		if(mac2 instanceof Camera) 
		{
			Camera cam4 = (Camera)mac2;
			cam4.Stop();
		}
		else 
		{
			throw new ClassCastException("Exception Thrown using Throws");
		}
	}
}
