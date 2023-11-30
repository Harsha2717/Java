
public class enums {
	
	public static void main(String[] args) 
	{
	
		Days day = Days.WEDNSDAY;
		day.displayday();
		
		System.out.println(day.toString());
		Days day2 = Days.WEDNSDAY;
		
		System.out.println(day == day2);
		switch (day) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		case WEDNSDAY:
			System.out.println("Today is Wednsday");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday");
			break;
		case FRIDAY:
			System.out.println("Today is Friday");
			break;
		case SATURDAY:
			System.out.println("Today is Saturday");
			break;
		case SUNDAY:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Day not Found");
			break;

		}
	}
}


enum Days 
{
	SUNDAY
	{
		public void displayday() 
		{
			System.out.println("Today is Sunday");
		}
	},
	MONDAY{
		public void displayday() 
		{
			System.out.println("Today is Monday");
		}
	},
	TUESDAY{
		public void displayday() 
		{
			System.out.println("Today is Tuesday");
		}
	},
	WEDNSDAY{
		public void displayday() 
		{
			System.out.println("Today is Wednsday");
		}
	}, 
	THURSDAY{
		public void displayday() 
		{
			System.out.println("Today is Thursday");
		}
	}, 
	FRIDAY{
		public void displayday() 
		{
			System.out.println("Today is Friday");
		}
	},
	SATURDAY{
		public void displayday() 
		{
			System.out.println("Today is Saturday");
		}
	};
	
	public abstract void displayday(); 
}