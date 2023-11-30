
public class StringMain {
	public static void main(String[] args) {
		
		String [] array1 = new String [2];
		
		array1[0]  = "Hi";
		array1[1]  = "Hello";
		
		System.out.println("Array1[0] : " + array1[0]);
		System.out.println("Array1[0] : " + array1[1]);
		
		
		String [] Array2 = {"HARSHA","SIRISHA","VAIBU","SINDHU"};
		for(String s : Array2) 
		{
			System.out.println("Array2 : " + s); 
		}
	}
}
