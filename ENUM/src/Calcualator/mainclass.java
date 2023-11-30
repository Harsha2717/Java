package Calcualator;

public class mainclass {
	public static void main(String[] args) {
		
		Calculations add = Calculations.ADD;
		
		System.out.println(add.calc(10, 20));
		add.disp();
		
		Calculations div = Calculations.DIV;
		
		System.out.println(div.calc(30,15));
	}

}
