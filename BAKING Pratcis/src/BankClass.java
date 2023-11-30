
public class BankClass 
{
	public static void main(String[] args) 
	{
		Account acc = new SavingsAcc("Harsha",1420100,1000);
		acc.set_acc_holder_name("Harsha");
		acc.Deposite(1000);
		System.out.println(acc.get_balance());
		acc.Deposite(5000);
		System.out.println(acc.get_balance());
		acc.Withdraw(1000);
	}
}
