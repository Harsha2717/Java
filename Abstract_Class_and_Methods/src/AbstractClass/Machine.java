package AbstractClass;

public abstract class Machine {
	private int id;
	
	void set_id(int id) 
	{
		this.id = id;
	}
	
	int get_id() 
	{
		return id;
	}
	
	abstract void Start();
	abstract void Stop();
	abstract void Move();
	abstract void Brake();

	void run() 
	{
		Start();
		Move();
		Brake();
		Stop();
	}
}
