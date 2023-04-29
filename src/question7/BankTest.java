package question7;

public class BankTest {

	public static void main(String[] args) {
		
		System.out.println("Question 7 - OUTPUT");
		System.out.println("***************************");
		
		
		SavingsAccount save = new SavingsAccount();
		
		System.out.println("Accessing AbstractBankAccount data with Savings Account object:");
		System.out.println("===============================");
		
		// Access abstract class data
		
		save.currentBal = 3500.50;
		//System.out.print("Initial Balance:");
		save.getBalance();
		save.deposit(0);
		save.deposit(4550);
		save.getBalance();
		System.out.println();
		
		System.out.println("Accessing SavingsAccount data with Savings Account object:");
		System.out.println("===============================");
		
		
		save.currentBal = 1000;
		save.getBalance();
		save.withdraw(4000.5);
		
		
		save.currentBal = 5075;
		save.getBalance();
		save.withdraw(4000.5);
		save.getBalance();
		
		
		save.calcInterest(1, 0.02);
		
		
		
		System.out.println();
		
		CheckingAccount check = new CheckingAccount();
		System.out.println("Accessing Checking Account data with Checking Account object:");
		System.out.println("===============================");
		
		check.currentBal = 0;
		check.getBalance();
		check.withdraw(100);
		
		check.currentBal = 5000;
		check.getBalance();
		check.withdraw(0);
		check.withdraw(6000);
		check.getBalance();
		check.deposit(4550);
		check.getBalance();
		check.withdraw(2000);
		check.getBalance();
		
		

	}

}
