
public class Methods {

	public static void main(String[] args) 
	{	
		String obj1 = "Harsha";
		String obj2  = "Sri";
		String obj3 = "harsha";
		System.out.println(obj1.charAt(0)); //to get char at certain index
		System.out.println(obj1.lastIndexOf('h'));	//Returns of index position of char
		System.out.println(obj1.contains("Har"));	//Returns boolean if Sequence of char is found	
		System.out.println(obj1.length());	//Returns length	
		System.out.println(obj1.endsWith("ha"));//	return true if ending with the string value
		System.out.println(obj1.replace('H', 'h'));	//replace old char with new char
		System.out.println(obj1.toUpperCase());	//to upper case
		System.out.println(obj1.toLowerCase());	//to lower case
		System.out.println(obj1.concat(obj2));
		System.out.println(obj1.substring(3));	//start printing from index value
		
		System.out.println(obj1.equals(obj2));	//Check if obj1 == obj2 
		System.out.println(obj1.equalsIgnoreCase(obj3));	//checks ignoring uppercase and lowercase
		System.out.println(obj1.isEmpty());	//checks if it is empty
		System.out.println(obj1.trim());//Removes all the white spaces before and after in obj
	}

}
