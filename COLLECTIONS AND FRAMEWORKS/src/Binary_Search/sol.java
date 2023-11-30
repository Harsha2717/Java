package Binary_Search;

import java.math.BigInteger;

public class sol {
	public static void main(String [] args) 
	{
		String a = "11";
		String b  = "1";
		BigInteger A = new BigInteger(a,2);
		BigInteger B = new BigInteger(b,2);
		BigInteger ans = A.add(B);
		
		System.out.println(ans.toString(2));
		
//		BigInteger B = Integer.parseInt(b,2);	
//		String ans = Integer.toBinaryString(A+B);
//		System.out.println(ans);
	}
}
