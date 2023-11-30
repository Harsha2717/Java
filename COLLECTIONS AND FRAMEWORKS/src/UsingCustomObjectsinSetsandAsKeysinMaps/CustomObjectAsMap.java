package UsingCustomObjectsinSetsandAsKeysinMaps;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Student
{
	private String name;
	private int id;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public int getId() 
	{
		return this.id;
	}
	
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(id,name);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(this == obj) 
		return true;
	
		if(obj == null || getClass() != obj.getClass()) 
		{
			return false;
		}
		Student student = (Student)obj;
		return id == student.id && Objects.equals(name, student.name);
	}
	@Override
	public String toString() 
	{
		return "Id : " + id + " Name : " + name;
	}

}


class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	@Override
	public String toString() 
	{
		return "Name : "+name;
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Person p = (Person)o;
		return name == p.getName();
	}
	
}
public class CustomObjectAsMap
{
	public static void main(String [] args) 
	{
		Student s1 = new Student(0,"harsha");
		Student s2 = new Student(1,"sirisha");
		Student s3 = new Student(2,"vaibu");
		Student s4 = new Student(1,"sirisha");
		Student s5 = new Student(0,"harsha");
		
		
		Map<Student,Integer> map = new LinkedHashMap<Student,Integer>();
		
		map.put(s1,1);
		map.put(s2,2);
		map.put(s3,3);
		map.put(s4,1);
		map.put(s5,3);
		
		for(Student key : map.keySet()) 
		{
			System.out.println( key +" \tKey : " + map.get(key) );
		}
		
		
		
		System.out.println("\n=========== Set ================\n");
		
		Set<Student> set = new LinkedHashSet<Student>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		for(Student key : set) 
		{
			System.out.println(key);
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		Person p1 = new Person("Peter");
		Person p2 = new Person("Lois");
		Person p3 = new Person("Brain");
		Person p4 = new Person("Stewie");
		
		Set<Person> set1 = new LinkedHashSet<Person>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		
		System.out.println(set1);
		
		Map<Person,Integer> map1 = new LinkedHashMap<Person,Integer>();
		map1.put(p1, 1);
		map1.put(p1, 2);
		map1.put(p2, 3);
		map1.put(p2, 4);
		map1.put(p3, 5);
		map1.put(p3, 6);
		map1.put(p4, 7);
		map1.put(p4, 8);
	
		for(Person p : map1.keySet()) 
		{
			System.out.println(map1.get(p));
		}
	}
}