package Spliting_String_and_LEXIOGRAPHICAL_Comparision;

//import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String [] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			String s = "welcometojava";
			int k = 3;
			String smallest =	s.substring(0,k); 
			String largest = s.substring(0,k);
			String substring = null;
			
			

			
			for(int i=1;i<s.length()-k;i++) 
			{		
				substring = s.substring(i, i+k);
				
				if(substring.compareTo(smallest) < 0) 
				{
					smallest = substring;
				}
				if(substring.compareTo(largest) > 0) 
				{
					largest = substring;
				}
			}
			System.out.println(smallest + "\n" + largest);
		}
	}
/*
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			String Smallest = "";
			String Largest = "";
			
			String s = "welcometojava";
			int length = s.length();

			String substr = null;

			ArrayList<String> substrings = new ArrayList<>();

			for (int start = 0; start < length; start++) {
				for (int end = start + 1; end <= length; end++) {
					substr = s.substring(start, end);

					if (substr.length() == 3) {
						substrings.add(substr);
					}
				}
			}
			substrings.sort(null);
			Smallest = substrings.get(0);
			Largest = substrings.get(substrings.size()-1);
			
			System.out.println(Smallest +  "\n" + Largest);
		}
	}
*/
}