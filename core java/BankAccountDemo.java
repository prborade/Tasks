package Oops;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount B = new BankAccount(123456,"pooja borade");
		B.deposite(5000);
		B.deposite(1000);

		System.out.println("balance is:"+B.getBalance());
		B.withdraw(500);
		System.out.println("balance is:"+B.getBalance());
	}

}

class BankAccount{
	private  String accountName; 
	private int accountNumber;
	private double Balance;
	double deposite;
	int withdraw;
	 void deposite(double b){
		double dep_value = b;
		Balance += b;
		
	}
	 void withdraw(int a){
		 Balance -=a; 
		
	 }
	 
	
	BankAccount(int accNumber,String accName){
		
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {

		return Balance;
	}
	public void setBalance(double balance) {
		
		Balance = balance;
	}
	
	
	
}