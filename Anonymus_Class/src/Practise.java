class anonymous implements Runnable
{
	@Override
	public void run() {
		System.out.println("Hello! World");
		
	}
}

public class Practise {
	public static void main(String[] args) 
	{
		anonymous anon = new anonymous();
		anon.run();
		
		anonymous AnoymousClass = new anonymous() 
		{
			@Override
			public void run() 
			{
				System.out.println("Hello World");
			}
		};
		AnoymousClass.run();
	}
}
