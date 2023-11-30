package UsingCustomObjectsinSetsandAsKeysinMaps;
import java.util.*;

class Students
{
	private int id;
	private String name;
	
	Students(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	
	@Override
	public String toString() 
	{
		return "{" + id + ": "+name + "}";
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(id,name);
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Students stu = (Students)o;
		return id == stu.id && Objects.equals(name, stu.name);
	}
}

public class Practise 
{
	public static void main(String [] args)
	{
		Students s1 = new Students(0,"Peter");
		Students s2 = new Students(1,"Lois");
		Students s3 = new Students(2,"Stewie");
		Students s4 = new Students(3,"Brain");
		Students s5 = new Students(4,"Meg");
		Students s6 = new Students(5,"Chirs");
		Students s7 = new Students(0,"Peter");
		Students s8 = new Students(3,"Stewie");
		
		Set<Students> list = new LinkedHashSet<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		
		System.out.println(list);

		Map<Integer,Students> list1 = new LinkedHashMap<Integer,Students>();
		list1.put(0, s1);
		list1.put(1, s2);
		list1.put(2, s3);
		list1.put(3, s4);
		list1.put(4, s5);
		list1.put(5, s6);
		list1.put(0, s7);
		
//		for(Integer ss : list1.keySet()) 
//		{
//			System.out.print(list1.get(ss) + " ");
//		}
//		
		////////OR///////////
		for(Map.Entry<Integer,Students> map : list1.entrySet()) 
		{
			System.out.print(map.getKey() + " " + map.getValue() + " ");
		}
	}
}
