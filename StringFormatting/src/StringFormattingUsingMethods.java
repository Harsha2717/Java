class Formater
{
	String name;
	Long Num;
	
	Formater(String name ,Long RollNum)
	{
		this.name = name;
		this.Num = RollNum;
	}
	
	String get_name() 	{return this.name;}
	Long get_rollnum() {return this.Num;}
}

class Output extends Formater
{

	Output(String name, Long RollNum) {
		super(name, RollNum);
	}
	
	public void output() {
		String out = String.format("%-7s : %-1s " +"\n" +"%-7s : %-1d\n","Name",name,"RollNum",Num);
		//String output = "Name	: "+name+"\nRollNum : "+RollNum;	//String Concatenation   
		System.out.println(out);
		
		//	System.out.println(output + "\n");	//
	}	
}
public class StringFormattingUsingMethods {
	public static void main(String[] args) 
	{
		Output Harsha = new Output("Harsha",9346867305L);
		Output Vaibu = new Output("Vaibu",6302992372L);
		
		Output Siri = new Output("Sirisha",8919305680L);
		
		Harsha.output();
		Vaibu.output();
		Siri.output();	
		
	}
}
