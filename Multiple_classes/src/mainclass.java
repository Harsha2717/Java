
class Student
{
	protected String StudentName;
	
	void set_name(String name) 
	{
		this.StudentName = name;
	}
	String get_name() 
	{
		return this.StudentName;
	}
	class course
	{
		private String courseName;
		
		void set_course(String name) 
		{
			this.courseName = name;
		}
		String get_course() 
		{
			return this.courseName;
		}
	}
}

class college {
	String college_name;
	
	void set_name(String name) 
	{
		this.college_name = name;
	}
	String get_name() 
	{
		return this.college_name;
		}

}
public class mainclass {
	public static void main(String [] args) 
	{
		Student stu = new Student();
		stu.set_name("HARSHA");
		Student.course cr = stu.new course();
		cr.set_course("ECE");
		System.out.println(stu.get_name());
		System.out.println(cr.get_course());
		college clg = new college();
		clg.set_name("MREM");
		System.out.println(clg.get_name());
}

}
