package Diagram;

public class SavingAccount extends BankAccount{

	private double interestRate;//利息

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String toString() {
		String s="";
		s="\n存储卡：";
		s+=super.toString();
		s+="\n银行利息："+this.interestRate;
		return s;
	}
	public void payInterest(){
		super.setBalance(super.getBalance()+this.interestRate);
	}
}

