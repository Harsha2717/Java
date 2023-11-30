import java.util.Objects;

class Person {
	private String name;
	private int id;
	private double age;

	// Constructor
	Person(String name, int id, double age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	Person(String name) {
		this.name = name;
	}

	Person(int id) {
		this.id = id;
	}

	Person(double age) {
		this.age = age;
	}

	// Methods
	String get_name() {
		return this.name;
	}

	int get_id() {
		return this.id;
	}

	public boolean equals(Object obj) {
		// used to check whether the Memory location of objects are same or not
		if (this == obj) {
			return true;
		}
		// Checks whether the obj is empty or not
		if (obj == null) {
			return false;
		}
		// Check whether the class is same or not
		if (getClass() != obj.getClass()) {
			return false;
		}
		// Casting the Object as Person
		Person p = (Person) obj;
		// Here We are returning the comaparision of two objects
		return (id == p.id) && Objects.equals(name, p.name) && (age == p.age);
	}
}

public class DotEqualMethod {
	public static void main(String[] args) {

		// The values stored in the varible is Compared with each other
		// The == Methods works only with Primitive data types
		int a = 10;
		int b = 10;
		System.out.println("int a == b : " + (a == b));

		double c = 10.0;
		double d = 10.0;
		System.out.println("\ndouble c == d : " + (c == d));

		// The .Equals method is used for comparing two objects of the Class and Returns
		// the boolean value
		// The .equals method and == both by default use to compare the Memory Address
		// of two objects and when both points at one location it return true else false
		// The .equals method can be overriden to check the Values of the Attributes or
		// Properties such that it verifies whether data is same or Not
		Person p1 = new Person("Harsha", 69, 22);
		Person p2 = new Person("Harsha", 69, 22);
		Person p3 = new Person("Vaibuu", 52, 21.5);

		// The both objects of person is stored at different memory locations/Address
		// hence This output false
		System.out.println(
				"\nComparing Two objects with same values different implementations \n(p1 == p2) : " + (p1 == p2));

		// When we assign p1 to p2 then this condition becomes true
		// p2 = p1;
		System.out.println("\nAssigning p2 with p1 ");
		System.out.println("\nComparing Two objects with assigning one object to other \n(p1==p2) : " + (p1 == p2));

		// using .equals method to compare two objects
		System.out.println("\nComparing Using obj1.equals(obj2) method");
		System.out.println("Comparing p1.equals(p2) : " + (p1.equals(p2)));
		System.out.println("Comparing p1.equals(p3) : " + (p1.equals(p3)));
		// After Overriding the Method the Output will be changed as it compares the
		// Values of the objects rather than the Memory reference

		String Harsha = "Harsha";
		String harsha = "Harsha";
		String HaRsha = "harsha";
		String Sirisha = new String("Sirisha");
		String sirisha = new String("Sirisha");

		System.out.println("Comparing Two Strings : " + (Harsha.equals(HaRsha)));
		System.out.println("Comparing Two Strings : " + (Harsha.equals(harsha)));

		System.out.println("Comparing Two New Strings : " + (Sirisha.equals(sirisha)));

	}
}
