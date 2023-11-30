package AbstractClass;

public class Bike extends Machine
{
	void Start() 
	{
		System.out.println("Bike Starting....");
	}

	@Override
	void Stop()
	{
		System.out.println("Bike Stopped.");
	}

	@Override
	void Move() {
		
		System.out.println("Bike Moving...");
	}

	@Override
	void Brake() {
		System.out.println("Bike Slowing Down...");
	}
}
