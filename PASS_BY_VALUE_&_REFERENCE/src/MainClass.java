
public class MainClass {
	public static void main(String [] Args) 
	{
		int a = 10;
		int b = 50;
		
		Pass_by_value pbv = new Pass_by_value();
		Pass_by_Ref pbr = new Pass_by_Ref();
		
		System.out.println("Before Calling The Method : " + (a+b));
		pbv.add(a,b);
		System.out.println("After Calling The Method : " + (a+b));
		
		System.out.println("==========================================");
		
		pbr.x = 10;
		pbr.y = 20;
		System.out.println("Before Calling The Method : " + (a+b));
		pbr.add(pbr, pbr);
		System.out.println("After Calling The Method : " + (pbr.x+pbr.y));
	}
}

class Pass_by_value
{
	int x;
	int y;
	
	public void add(int x,int y) 
	{
		x = 100;
		System.out.println("The Output of PassByValue Method is : " + (x+y));
	}
}

class Pass_by_Ref
{
	int x;
	int y;
	
	public void add(Pass_by_Ref x,Pass_by_Ref y) 
	{
		x.x= 100;
		System.out.println("The Output of PassByRef Method is : " + (x.x+y.y));
	}
}