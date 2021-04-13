package Diagram;

public class Customer {

	private String ssn;
	private String name;
	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;
	
	public Customer() {
		super();
	}

	public Customer(String ssn, String name, CheckingAccount checkingAccount, SavingAccount savingAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	public String toString() {
		String s="用户信息：";
		s+="\n身份证号码："+ssn;
		s+="\n姓名："+name;
		s+=this.checkingAccount.toString();
		s+=this.savingAccount.toString();
		return s;
	}
	public String toStringChecking()
	{
		String s="用户信息：";
		s+="\n身份证号码："+ssn;
		s+="\n姓名："+name;
		s+=this.checkingAccount.toString();
		s+="\n没有开通存储卡";
		return s;
	}
	public String toStringSaving()
	{
		String s="用户信息：";
		s+="\n身份证号码："+ssn;
		s+="\n姓名："+name;
		s+=this.savingAccount.toString();
		s+="\n没有开通信用卡";
		return s;
	}
	
}

