import java.io.Serializable;

public class Student implements Serializable
{
	private static final long serialVersionUID = 373700937382603549L;
	
	private String name;
	private int age;
	private int RollNumber;
	private transient String College_code;
	private static Long mobile;
	
	
	Student(String name,int age,int roll,String college)
	{
		this.name = name;
		this.age = age;
		this.RollNumber = roll;
		this.College_code = college;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public int getRollNumber() 
	{
		return RollNumber;
	}
	
	public String getCollegeCode() 
	{
		return College_code;
	}
	
	public static void set_mobile(long num) 
	{
		mobile = num;
	}
	
	public static long get_mobile() 
	{
		return mobile;
	}
	
	public String toString() 
	{
		String formatted = String.format("Name %-10c%-5s\nAge %-10c %-6d \nRollNumber %-3c %-5d \nCollegeCode %-2c %-5s \nStaticMobile %1c %-5s\n",':',name,':',age,':',RollNumber,':',College_code,':',mobile);
		return formatted;
	}
	
}
	