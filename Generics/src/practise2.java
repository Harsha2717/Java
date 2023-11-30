class Box<T>
{
	private T box;
	public void set(T things) 
	{
		this.box = things;
	}
	
	public T get() 
	{
		return this.box;
	}
	
	public String toString() 
	{
		return "The Box Contains : " + this.box;
	}
	
}
public class practise2 
{
	public static void main(String[] args) 
	{
		Box<String> name = new Box<>();
		
		name.set("Harsha");
		name.set("Sirisha");
		
		System.out.println(name);
	}

}
