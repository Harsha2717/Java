class name 
{
	private String name; 
	private Long Number;
	
	name(String name,Long Number)
	{
		this.name = name;
		this.Number = Number;
	}
	
	public void stringp()
	{
		System.out.println(this.toString());
	}
	//When We call any object directly in output this is invoked
	//public String toString() 
	//{
		//Normal return  inefficient Creates Multiple String Objects
		//return "=====DefaultMethod======\nName : " + this.name + "\nNumber : " + Number;
	//}
	
	
	public String toString_StringBuffer() {
		//using String Buffer	//Creates and Single object and appends every thing to it.
		StringBuffer sb = new StringBuffer();
		sb.append("=====StringBuffer Method=====\n").append("Name : ").append(name).append("\nNumber : ").append(Number);
		return sb.toString();
	}
	
	
	public String toString_StringForamting()
	{	
	//using String Formatting 
		String formatted = String.format("=====StringFormat Method=====\n%-10s : %s \n%-10s : %d","Name",name,"Number",Number);
		return formatted; 
	}
}

public class toStringmain 
{
	public static void main(String[] args) 
	{
		name Harsha = new name("Harsha",9346867305l);
		Harsha.stringp();
		System.out.println(Harsha);
		System.out.println(Harsha.toString_StringBuffer());
		System.out.println(Harsha.toString_StringForamting());
	}
}
