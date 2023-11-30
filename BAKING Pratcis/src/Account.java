
class Account 
{
	 private long Account_Number;
	 private String Account_Holder_name;
	 private double balance;
	
	 Account(String name,long AccNum,double balance)
	 {
		 this.Account_Holder_name = name;
		 this.Account_Number = AccNum;
		 this.balance = balance;
	 }

	 Account(String name)
	 {
		 this.Account_Holder_name = name;
	 }

	 Account(long AccNum)
	 {
		 this.Account_Number = AccNum;
	 }

	 Account(double balance)
	 {
		 this.balance += balance;
	 }
	 
	public void set_acc_num(long Acc_num) 
	{
		this.Account_Number = Acc_num;
	}
	
	public void set_acc_holder_name(String Name) 
	{
		this.Account_Holder_name = Name;
	}
	
	public void set_acc_balance(double balance) 
	{
		this.balance += balance;
	}
	
	
	public void Deposite(double amount) 
	{
		try 
		{
			if(amount > 0) 
			{
				this.balance += amount;
			}
			else if(amount == 0) 
			{
				throw new exception("Amount cannot be Negative");
			}
			else 
			{
				throw new exception("Balance Cannot be Negative");
			}
		}
		catch(exception e) 
		{
			System.err.println(e.getMessage());
		}
	}
	public void Withdraw(double amount) 
	{
		try 
		{
			if(balance>=amount) 
			{
				System.out.println("Withdraw Successful");
				System.out.println("Withdrawed Amount	: " + amount + " \nFrom Account		: " + get_Acc_name() + "\nAvailable Balance	: " + get_balance());
			
			}else 
			{
				System.out.println("Available Balance : " + get_balance());
				throw new exception("Amount Cannot exceed the Available balance");
			}
		}catch(exception e) 
		{
			System.err.println(e.getMessage());
		}
	}
	
	public String get_Acc_name() 
		{
			return this.Account_Holder_name;
		}
	public long get_acc_num() 
		{
			return this.Account_Number;
		}
		public double get_balance() 
		{
			return this.balance;
		}
}
class exception extends Exception
{
	private static final long serialVersionUID = 1L;
	public exception(String Message) 
	{
		super(Message);
	}
}