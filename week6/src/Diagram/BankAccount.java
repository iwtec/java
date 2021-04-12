package Diagram;

public class BankAccount {

	private String accountNum;//ø®∫≈
	private double balance;//”‡∂Ó
	
	public BankAccount() {
		super();
	}

	public BankAccount(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString()
	{
		String b="";
		b="\nø®∫≈£∫"+this.accountNum;
		b+="\n”‡∂Ó£∫"+this.balance;
		return b;
	}
	
}
