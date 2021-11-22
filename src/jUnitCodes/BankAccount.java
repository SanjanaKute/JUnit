package jUnitCodes;

public class BankAccount 
{
	int balance;
	
	public BankAccount(int balance) 
	{
		super();
		this.balance = balance;
	}
	void withdraw(int withdraw) throws InsufficientBalanceException
	{
		if(withdraw>balance)
		{
			throw new InsufficientBalanceException("InsufficientBalanceException");
		}
		balance=balance-withdraw;
		System.out.println("Remaining balance in your acount is: "+balance);
	}

	public static void main(String[] args) 
	{
		BankAccount b1=new BankAccount(20000);
		try
		{
			b1.withdraw(20000);
		}
		catch(InsufficientBalanceException i)
		{
			i.printStackTrace();
		
	}

}
class InsufficientBalanceException extends Exception
{

		public InsufficientBalanceException(String display)
		{
			super();
		}
	}
	
}