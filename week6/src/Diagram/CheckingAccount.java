package Diagram;

public class CheckingAccount extends BankAccount{

	private double serviceCharge;

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
		c="\n信用卡：";
		c+=super.toString();
		c+="\n银行服务费用："+this.serviceCharge;
		return c;
	}
	public void assessServiceCharge(){
		super.setBalance(super.getBalance()-this.serviceCharge);
	}
	
}

