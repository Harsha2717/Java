package AbstractClass;

public class Car extends Machine
{
	void Start() 
	{
		System.out.println("Car Starting....");
	}

	@Override
	void Stop()
	{
		System.out.println("Car Stopped.");
	}

	@Override
	void Move() {
		
		System.out.println("Car Moving...");
	}

	@Override
	void Brake() {
		System.out.println("Car Slowing Down...");
	}

}
