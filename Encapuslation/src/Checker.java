

class Checker extends Customer{
	public static void main(String [] args) {
		Customer New1 = new Customer();
		New1.set_lastname("NEW_1");
		System.out.println("SubClass Customer : " + New1.get_lastname());
		//New1.Privatemethod();	//Private Method cannot be Accessed
	}

}
