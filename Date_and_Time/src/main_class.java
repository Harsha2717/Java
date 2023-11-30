
import java.time.LocalDate;
import java.time.LocalTime;

public class main_class {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		System.out.println("==========Before Formattting ==============");
		System.out.println("Today Time : " + time);
		System.out.println("Today Date : " + date);
		System.out.println("==========After Formattting ==============");
		/*
		 * DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		 * String Myformat = date.format(formater); System.out.println("Today Date : " +
		 * Myformat);
		 */
		long start = System.currentTimeMillis();
	
		for (int i = 0; i < 100; i++) 
		{
			
		}
		

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		// System.out.println(Time_Date);
	}
}
