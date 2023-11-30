
//Buffer and Builder are same Except Buffer Provides Thread Safety and Builder Doesn't Provide Thread Safety

public class BufferMain { 
	public static void main(String[] args) 
	{	
		StringBuffer buffer = new StringBuffer();
		buffer.append("Nc");
		buffer.append("Harsha");
		System.out.println(buffer);
		System.out.println(buffer.toString());		
	}
}	

