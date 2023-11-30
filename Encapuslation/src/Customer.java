
/*Encapsulation : Basically It is USed to Hide the Variables and can only be accessed by methods
 * Variables are declared Private and Methods are defined to Access Them
 * An Object need to be Created In order to Access the Methods
 * private methods cannot be accessed Directly in any class.
*/
public class Customer {
	private String Last_name;
//	public static final String name = "Harsha";	//Class Method and no need of Object to call
	//Constructor - NoArgs
/*	Customer()
	{b
		this.Last_name = "Null";
	}
	//Constructor-SingleArg
	Customer(String name)
	{
		this.Last_name = name;
	}
	*/
	//Getter - To Get last Name
	public String get_lastname() 
	{
		return Last_name;
	}
	//Setter - To Set Last Name
	public void set_lastname(String name) 
	{
		this.Last_name = name;
	}
	
	private void Privatemethod() {		//The private method can be USed in this class but when cannot be used in Another Class
		System.out.println("This is A Private method ");
	}
	
	public static void main(String[] args) 
	{
		//System.out.println(Customer.name);	//Static variable no object required to call		
		Customer customer_1 = new Customer();
		customer_1.set_lastname("Chary");		
		System.out.println("Customer Last name : " + customer_1.get_lastname());
		
		Customer customer_2 = new Customer();
		System.out.println("Customer Last name : " + customer_2.get_lastname());
		
		Customer customer_3 = new Customer();
		customer_3.set_lastname("Bhatu");
		System.out.println("Customer Last name : " + customer_3.get_lastname());
		
		customer_1.Privatemethod();
	}
}
