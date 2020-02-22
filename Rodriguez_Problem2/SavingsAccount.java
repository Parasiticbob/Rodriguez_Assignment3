package Rodriguez_Problem2;
//Class that will be the accounts for the clients
public class SavingsAccount {
	
private static double annualInterestRate;
private static double savingsBalance;

	//Calculates monthly interest by multiplying savingsBalance with annualInterestRate then divides by 12
	public static double calculateMonthlyInterest(double x, double y) {
		double monthlyInterest = (x * y) / 12;
		savingsBalance += monthlyInterest;
		return savingsBalance;
	}
	//sets the annualInterestRate to a new value
	public static void modifyInterestRate(double x) {
		annualInterestRate = x;
	}
	public double getBalance() {
		return savingsBalance;
	}
	public void setBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getInterestRate() {
		return annualInterestRate;
	}
	public void setInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

}
