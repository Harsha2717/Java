public class Spliting_the_String_ 
{
	public static void main(String[] args) 
	{
		String name = "This is a     sample sentence with spaces";
		name = name.replaceAll("\\s+", "\n");
		System.out.println(name);
	}
}
