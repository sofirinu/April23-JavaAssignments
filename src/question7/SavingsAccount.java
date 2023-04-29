package question7;

public class SavingsAccount extends AbstractBankAccount {


	// Implementation of abstract Method (withdraw) from abstract class AbstractBankAccount 

	public void withdraw(double amount) {
		double newBal = currentBal - amount;

		if(currentBal <= 0 || newBal <=0 )
		{
			System.out.println("You will have a negative balance!So you cant withdraw");
		}

		else if (amount == 0 )
		{
			System.out.println("No withdrawal happened");
		}


		else {
			//double newBal = currentBal - amount;

			System.out.println("Amount withdrawn from your Savings account:"+amount+" CAD");

			currentBal = newBal;
		}

	}



	public void calcInterest( int n, double r)
	{

		System.out.println("No of Periods:"+n);
		System.out.println("Interest Rate:"+r);
		double interest = currentBal*n*r;
		System.out.println("Interest you earned:"+interest);

	}

















}

