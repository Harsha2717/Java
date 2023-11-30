	enum Direction
	{
		NORTH(0,"North"),SOUTH(180,"South"),EAST(90,"East"),WEST(360,"West");
		
		private int degree;
		private String direction;
		
		Direction(int degree,String direction)
		{
			this.degree = degree;
			this.direction = direction;
		}
		
		public int get_degree() 
		{
			return degree;
		}
		public String get_direction() 
		{
			return direction;
		}
		
	}

public class Practice
{
	public static void main(String [] args) 
	{
		Direction east = Direction.EAST;
		System.out.println(east);	
		
		Direction west = Direction.WEST;
		
		System.out.println(west);
	}
}