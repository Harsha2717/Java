import java.lang.Math;
public class MathExamples {
	public static void main(String [] args) 
	{
		//Math 
		System.out.println("Math.abs() Returns ( + )number: "+ Math.abs(-50));
		double Random_value = Math.random();
		System.out.println("Math.random() Returns Random value between 0 and <1 : "+Random_value);
		
		System.out.println("math.sqrt() Returns square root value : "+ Math.sqrt(64));
		
		System.out.println("math.ceil() Returns large interger : "+ Math.ceil(56.98));
		
		System.out.println("Math.floor() Returns small interger : "+ Math.floor(56.98));
		
		System.out.println("Math.min(x,y) Returns Minimum value : "+Math.min(150, 200));

		System.out.println("Math.max(x,y) Returns Large Value : "+Math.max(150,200));
		
		//Based on the Value it returns to either Smallest or Largest
		System.out.println("Math.round(x) Returns to closest number : " + Math.round(56.45));
		
		System.out.println("Math.pow(x,y) Returns x to power y : " + Math.pow(2,2));
		
		System.out.println("Math.sin(x) Returns sin(Angle) value : " + Math.sin(90));
		
		System.out.println("Math.tan(x) Returns tan(Angle) value : " + Math.tan(90));
		
	}
}
