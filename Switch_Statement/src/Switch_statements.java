
public class Switch_statements {
	public static void main(String [] args) 
	{
		char Mygrade = 'D';
		switch(Mygrade) //Statement verifies the cases 
		{
		case 'A':	//Verifies whether matches or switches to next case
			System.out.println("You Scored A Grade.");
			break;
		case 'B':
			System.out.println("You Scored B Grade.");
			break;
		case 'C':
			System.out.println("You Scored C Grade.");
			break;
		case 'D':
			System.out.println("You Scored D Grade.");
			break;
			
		default:	//This Occurs When No condition is Satisfied with Statement
			System.out.println("Error Grade");
		}
	}
}
