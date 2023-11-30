package Practice;

public enum Gener 
{
	ACTION("Action"),FICTION("Fiction"),HORROR("Horror");
	private String gener;
	
	Gener(String string) 
	{
		this.gener = string;
	}
	public String get_gener() 
	{
		return gener;
	}
	
	

}