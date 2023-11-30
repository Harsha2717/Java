
public class StringFormatting 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b =20;
		//Basic formatting
		String format = String.format("Formatting Integer : %d ", a);
		System.out.println(format);
		
		//width formatting
		format = String.format("Width is 20 : %20d ", a);
		System.out.println(format);
		
		//left and right justification	
		format = String.format("Left justify and width is 20 : %-20d %d", a,b);
		System.out.println(format);

		format = String.format("Left justify and width is 20 : %20d %d", a,b);
		System.out.println(format);
		
		//String Formatting
		format = String.format("This is a String formatting : %-5s %10s" ,"hello There","Harsha");
		System.out.println(format);
	}
}
