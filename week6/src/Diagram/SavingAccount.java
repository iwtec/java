package Diagram;

public class SavingAccount extends BankAccount{

	private double interestRate;//��Ϣ

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
		s="\n�洢����";
		s+=super.toString();
		s+="\n������Ϣ��"+this.interestRate;
		return s;
	}
	public void payInterest(){
		super.setBalance(super.getBalance()+this.interestRate);
	}
}

