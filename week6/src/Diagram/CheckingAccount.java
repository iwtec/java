package Diagram;

public class CheckingAccount extends BankAccount{

	private double serviceCharge;//�����

	public CheckingAccount() {
		super();
	}
	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String toString() {
		String c="";
		c="\n���ÿ���";
		c+=super.toString();
		c+="\n���з���ѣ�"+this.serviceCharge;
		return c;
	}
	public void assessServiceCharge(){
		super.setBalance(super.getBalance()-this.serviceCharge);
	}
	
}

