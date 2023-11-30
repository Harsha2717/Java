package Types_and_usage;
import java.util.regex.*;


public class mainclass {
	public static void main(String [] args) 
	{
		/*	Matches The Characters
		 * 		[A-Z];	//Matches uppercase
		 * 		[a-z];	//Matches Lower case
		 * 		[0-9];	//matches Numbers
		 * 		[A-Za-z]+;	//Matches all the Upper and Lower Case
		 * 		[A-Za-z0-9];	//matches all the alphanumberic digits
		 * 		[A-Z][a-z];	////Matches First Uppercase and then Lower case strings
		 * 	
		 */
		
		//String valid = "[A-Za-z]+";	//Matches any case Characters
		
		//String valid = "[A-Z]+[a-z]";	//Matches FirstUpperCaseCharacter
	
		//String valid = "[A-Z]+[a-z]+";	//Matches FirstUpperCaseCharacter for whole input by adding Quantifier +
		
		//String valid = "[0-9]+"; Matches only numbers 
		
		
		
		/*	Special Characters
		 	
		 * 		\\s  Matches WhiteSpace
		 * 		\\s+ Matches more than one Whitespace
		 * 		
		 * 		\\w Matches any Words upper and lower case and alphanumeric and even Underscores
		 * 		\\w+ Matches more than one Words upper and lower case and alphanumeric and Underscores
		 * 
		 * 		\\W matches everything except words uppercase and lowercase opposite
		 * 	
		 * 		\\d Matches Numeric Digit 	
		 * 		\\d+ Matches more than one Numeric Digits
		  		
		 */
		
			//String valid = "[\\s]";	//Matches Single WhiteSpace
			//String valid = "[\\s+]";	//Matches More than one
			
			//String valid = "[\\w]";	//Matches all the single words and alphanumeric and underscores
			//String valid = "[\\w]+";	//Matches all the words and alphanumeric and underscores
				
			//String valid = "[\\W+]";		//W means negation opposite of w
		
		
		
		/*	Matching Specific character
		 
		 * [a] //matches for the character
		 * [ab] //matches either a or b
		  
		 */
			//String valid = "[a]+";	//matches all the Digits of char a
			//String valid = "[sh]+";	//matches either a or b
		
		/* 	Quantifiers
		
		 * 		+ Match one or more 
		 * 		* Match zero or more
		 * 		? Match zero or one
		 * 		{n} Match upto size n
		 * 		{n,m} match char or size n and not greater than m
		 
		 */
		
		/*	Anchors
		 * 
		 * 		^ Matches the Pattern is at start
		 * 		$ Matches the Pattern is at end
		 *
		 */
		
		
		//String valid = "^[A-Z]"; //Verify whether the Start of String is UpperCase or not				
		//String valid = "^[a-z]"; //Verify whether the Start of String is LowerCase or not				
		//String valid = "^[0-9]"; //Verify whether the Start of String is Numeric				
		
		//String valid = "[A-Z]$";	//Verify whether the end of String is UpperCase or not
		//String valid = "[a-z]$";	//Verify whether the end of String is lowercase or not
		//String valid = "[0-9]$";	//Verify whether the end char of String is numeric or not
		String valid = "[0-9]+$";	//Verify whether the end string is numeric or not
		
		String Input = "Hi I am Sri @@)*&Harsha.__9346867305";
		
		//This matches all Uppercase letters and LowerCase Letters
		
		Pattern p = Pattern.compile(valid);
		
		Matcher m = p.matcher(Input);
		
		while(m.find()) 
		{
			String matchedWord = m.group();
			System.out.println(matchedWord);
		}			
	}
}
