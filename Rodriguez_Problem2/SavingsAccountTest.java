package Rodriguez_Problem2;
//This will create two SavingsAccount objects (saver1 and saver2)
//saver1 balance = $2000.00
//saver2 balance = $3000.00
//annualInterestRate = 4% or 0.04
//Calculate monthly interest for each of the 12 months
//Print the monthly balance for both savers (For loop for 12 cycles probably)
//Set annualInterestRate to 5% or 0.05
//Calculate 1 more month's interest and print both savers' balances.
public class SavingsAccountTest {

	public static void main(String[] args) {
		double saver1FinalBalance;
		double saver2FinalBalance;
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setBalance(2000.00);
		saver1.setInterestRate(0.04);
		
		
		for(int i = 0; i < 12; i++) {
			SavingsAccount.calculateMonthlyInterest(saver1.getBalance(), saver1.getInterestRate());
			System.out.printf("%nsaver1 balance is at: %.2f%n",saver1.getBalance());
		}
		saver1.setInterestRate(0.05);
		saver1FinalBalance = SavingsAccount.calculateMonthlyInterest(saver1.getBalance(), saver1.getInterestRate());
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.setBalance(3000.00);
		saver2.setInterestRate(0.04);
		
		for(int i = 0; i < 12; i++) {
			SavingsAccount.calculateMonthlyInterest(saver2.getBalance(), saver2.getInterestRate());
			System.out.printf("%nsaver1 balance is at: %.2f%n",saver2.getBalance());
		}
		saver2.setInterestRate(0.05);
		saver2FinalBalance = SavingsAccount.calculateMonthlyInterest(saver2.getBalance(), saver2.getInterestRate());
		
		
		System.out.printf("%nsaver1 extra month balance is: %.2f%n",saver1FinalBalance);
		System.out.printf("%nsaver2 extra month balance is: %.2f%n",saver2FinalBalance);
	}

}
