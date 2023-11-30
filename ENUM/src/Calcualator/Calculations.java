package Calcualator;

public enum Calculations {
	ADD
	{
		int x;int y;
		
		public void disp() 
		{
			System.out.println("X : " + x );
			System.out.println("Y : " + y);
		}
		public int calc(int x,int y) 
		{
			this.x = x;
			this.y = y;
			
			int z = x+y;
			return z;
		}
		
		
	},
	
	SUB
	{
		int x;int y;
		
		public void disp() 
		{
			System.out.println("X : " + x );
			System.out.println("Y : " + y);
		}
		public int calc(int x, int y) 
		{
			this.x = x;
			this.y = y;
		
			int z =x-y;
			return z;
		}
	},
	
	MUL
	{
int x;int y;
		
		public void disp() 
		{
			System.out.println("X : " + x );
			System.out.println("Y : " + y);
		}
		public int calc(int x,int y) 
		{
			this.x = x;
			this.y = y;
		
			return x*y;
		}
	},
	DIV
	{
int x;int y;
		
		public void disp() 
		{
			System.out.println("X : " + x );
			System.out.println("Y : " + y);
		}
		public int calc(int x, int y) 
		{
			this.x = x;
			this.y = y;
		
			if(y!=0) 
			{
				return x/y;
			}else 
			{
				throw new ArithmeticException("Cannot Divide by 0");
			}
		}
	};
	public abstract int calc(int x,int y);
	public abstract void disp();
}
