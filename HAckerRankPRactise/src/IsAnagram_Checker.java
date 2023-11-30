

import java.util.Scanner;

public class IsAnagram_Checker{

    static boolean isAnagram(String a, String b) 
    {
    	if(a.length() != b.length()) 
    	{
    		return false;
    	}
    	
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	
    	a = sortString(a);
    	b = sortString(b);
    	
    	return a.equals(b);
    }
    
	static String sortString(String str) 
	{
		char [] charArray = str.toCharArray();
		java.util.Arrays.sort(charArray);
		return new String(charArray);
	}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
