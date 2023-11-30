
public class Mainclass 
{
	public static void main(String[] args) 
	{
		//Creating an instance of Robot Class and Calling the method 
		Robot robo1 = new Robot(7);
		robo1.Start();
		
		//Creating the instance of brain Inner class of Robot and implementing with Robot class instance.
		
		Robot.Brain brain = robo1.new Brain();
		brain.work();
	}
}
