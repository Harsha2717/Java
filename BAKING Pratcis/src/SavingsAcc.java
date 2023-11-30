
public class SavingsAcc extends Account
{
	SavingsAcc(String name, long acc_num,double balance)
	{
		super(name,acc_num,balance);
	}
	
	SavingsAcc(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	SavingsAcc(String name)
	{
		super(name);
	}
	
	SavingsAcc(long acc_num)
	{
		super(acc_num);
	}
	
	double interest;
	//Adding bonus if Deposited amount is greater than 5000
	
	//@override
	public void Deposite(double amount) 
	{
		try 
		{
			if(amount > 0 && amount < 5000)
			{
				System.out.println("Amount Entered is : " + amount);
				super.Deposite(amount);
				System.out.println("Amount : " + amount+ " is Deposited to " + super.get_Acc_name());
			}
			
			else if(amount >= 5000) 
			{
				System.out.println("Amount Entered is : " + amount);
				interest = amount + (amount*0.05);
				super.Deposite(interest);
				System.out.println("Amount : " + amount+ " is Deposited to " + super.get_Acc_name());
				System.out.println("Intrest Deposited : " + (amount*0.05));
				
			}
			else
			{
				throw new exception("Amount Cannot be Negative");
			}
		}
		catch(exception e) 
		{
			System.err.println(e.getMessage());
		}
	}
	
	public void withdraw(double amount) 
	{
		double balance = super.get_balance();
		try {
			
			if(amount <= balance && balance - amount != 0 ) 
			{
				super.Withdraw(amount);
			}
			else if(balance - amount == 0) 
			{
				throw new exception("Amount Withdraw Must not exceed the Minimum Balance"); 
			}else 
			{
				throw new exception("Amount " + amount +"Exceeds Available Balance" + balance);
			}
		}
		catch(exception e) 
		{
			System.err.println(e.getMessage());
		}
	}
	public void set_acc_holder_name(String name) 
	{
		super.set_acc_holder_name(name);
	}
	
	public void set_acc_num(long num) 
	{
		super.set_acc_num(num);
	}
	
	public void set_acc_balance(double balance) 
	{
		super.set_acc_balance(balance);
	}
}
