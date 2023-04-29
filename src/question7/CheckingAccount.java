package question7;

public class CheckingAccount implements BankAccount {

	double currentBal;

	// Implementation of inherited methods from BankAccount interface



	public void deposit(double depAmount) {

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



	public void withdraw(double withdrawAmount) {

		if(currentBal == 0)
		{
			System.out.println("No money in your account");
		}
		else if (withdrawAmount > currentBal )
		{
			System.out.println("Insufficient balance!You can not withdraw the amount");
		}
		else if (withdrawAmount == 0 )
		{
			System.out.println("No withdrawal happened");
		}
		else
		{
			double newBal = currentBal - withdrawAmount;
			currentBal = newBal;
			System.out.println("Amount withdrawn from your Checking account:"+withdrawAmount+" CAD");
		}

	}


	public void getBalance() {

		System.out.println("Account Balance:"+currentBal+" CAD");

	}



}
