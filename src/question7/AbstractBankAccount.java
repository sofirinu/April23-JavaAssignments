package question7;

public abstract class AbstractBankAccount implements BankAccount {

	double currentBal;

	public void deposit(double depAmount)
	{
		if (depAmount == 0 )
		{
			System.out.println("No money deposited");
		}
		else
		{
			System.out.println("Amount deposited to your Checking account:"+depAmount+" CAD");
			double newBal = currentBal + depAmount;
			currentBal = newBal;
		}

	}

	public void getBalance() 
	{
		System.out.println("Account Balance:"+currentBal+" CAD");

	}

	public abstract void withdraw(double amount);


}
