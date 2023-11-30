import java.util.Scanner;

public class BuilderMain {
	public static void main(String[] args) 
	{		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
	
		//System.out.print("Enter Name : ");
		//String name = sc.nextLine();

		//System.out.print("Enter Num : ");
		//long Num = sc.nextLong();
		
		String name = "Harsha";
		long num = 9346867305L;
		
		sb.append("Name : ");	//Appending String
		sb.append(name);		//Appending Object
		
		sb.append("\nNumb : ");
		sb.append(num);		
		
		sb.append('N');			//Appending Char
		sb.capacity();			// Get the Capacity of the StringBuilder
		sb.charAt(0);	//Get charAt position
		
		System.out.println(sb.indexOf("Harsha"));	//Works only for Strings
		
		sb.insert(32, "BYE");
		
		int capcity = sb.capacity();
		
		String Details = sb.toString();		//Assigning StringBuffer object to String by converting in toString 
		
		System.out.println(Details);
		
		System.out.println("\nCapacity of StringBuilder: " + capcity + "\n");
		
		sb.delete(32,35);							//Delete from Index_Start to Index_End
		System.out.println(sb.deleteCharAt(31));	//Delete Specific CharAt(index);
		
		System.out.println(sb.replace(14, 18, "Number"));	//Replacing with index start end and details
		sc.close();
	}
}

