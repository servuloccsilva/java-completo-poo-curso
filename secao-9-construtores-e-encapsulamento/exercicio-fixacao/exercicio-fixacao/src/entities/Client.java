package entities;

public class Client {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdrawValue) {
		balance = balance - withdrawValue - 5.00;
	}

	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
	
	
	

}
