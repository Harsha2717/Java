package enumMethods_and_concepts;

public enum Animals
{
	DOG("Spike",3),CAT("Tom",2),MOUSE("Jerry",1);
	
	private String name;
	private int age;
	
	Animals(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString() 
	{
		return "Name of Animal : " + name +"\nAge of Animal : " + age;	
	}

}