package banking;

public class Bank {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Bank() {
	}
	public Bank(int accountNumber,String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public Bank(int accountNumber,String name,double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		cashDeposit(initialDeposit);
	}
	public void cashDeposit(double deposit) {
		this.balance += deposit;
	}
	public void withdrawMoney(double remove) {
		this.balance = this.balance - remove + 5.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String toString() {
		return "Acoount "
				+ accountNumber 
				+  "Holder: " 
				+ name 
				+ "Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
}
