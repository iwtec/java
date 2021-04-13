package Diagram;

import java.util.Scanner;

public class Driver {

	public static Customer customer = null;
	public static CheckingAccount c = null;
	public static SavingAccount s = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chioce = menu();
		while (chioce != 8) {
			switch (chioce) {
			case 1:
				create();
				break;
			case 2:
				if (s == null) {
					System.out.println("请先开户拥有存储卡！谢谢");
					break;
				}
				save();
				break;
			case 3:
				if (s == null) {
					System.out.println("请先开户拥有存储卡！谢谢");
					break;
				}
				withdraw();
				break;
			case 4:
				if (c == null) {
					System.out.println("请先开户拥有信用卡！谢谢");
					break;
				}
				comsume();
				break;
			case 5:
				if (c == null) {
					System.out.println("请先开户拥有信用卡！谢谢");
					break;
				}
				repay();
				break;
			case 6:
				if (customer==null) {
					System.out.println("请先开户！谢谢");
					break;
				}
				settle();
				break;
			case 7:
				if (customer==null) {
					System.out.println("请先开户！谢谢");
					break;
				}
				balance();
				break;
			default:
				System.out.println("输入错误！请重新输入");
			}
			chioce = menu();
		}
		System.out.println("谢谢使用！退出程序");
	}
	public static int menu() {
		int chioce;
		System.out.println("==========Customer-Bank==========");
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8.退出");
		System.out.println("==========Customer-Bank==========");
		System.out.print("请选择：");
		Scanner scan = new Scanner(System.in);
		chioce = scan.nextInt();
		return chioce;
	}
	public static int submenu() {
		int chioce;
		System.out.println("=======Create=======");
		System.out.println("1.信用卡");
		System.out.println("2.存储卡");
		System.out.println("3.返回");
		System.out.println("=======Create=======");
		System.out.println("请选择：");
		Scanner scan = new Scanner(System.in);
		chioce = scan.nextInt();
		return chioce;
	}
	public static void create() {
		int chioce = submenu();
		while (chioce != 3) {
			switch (chioce) {
			case 1:
				if (c != null) {
					System.out.println("请不要重复开信用卡！");
					break;
				}
				createCheckingAccount();
				break;
			case 2:
				if (s != null) {
					System.out.println("请不要重复开存储卡！");
					break;
				}
				createSavingAccount();
				break;
			default:
				System.out.println("输入错误！请重新输入");
			}
			chioce = submenu();
		}
		System.out.println("谢谢使用！退出开户");
	}
	public static void createCheckingAccount() {
		String name;
		String ssn;
		if (s == null) {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入持卡人姓名：");
			name = scan.next();
			System.out.println("请输入持卡人身份证号码：");
			ssn = scan.next();
		}else
		{
			name=customer.getName();
			ssn=customer.getSsn();
		}
		System.out.println("请输入卡号：");
		Scanner scan1 = new Scanner(System.in);
		String accountNum = scan1.next();
		System.out.println("请输入信用卡服务费:");
		double serviceCharge = scan1.nextDouble();
		c = new CheckingAccount(accountNum, 0, serviceCharge);
		customer = new Customer(ssn, name, c, s);
		if (customer.getSavingAccount() != null)
			System.out.println(customer.toString());
		else
			System.out.println( customer.toStringChecking());

	}
	public static void createSavingAccount() {
		String name;
		String ssn;
		Scanner scan = new Scanner(System.in);
		if (c == null) {
			System.out.println("请输入持卡人姓名：");
			name = scan.next();
			System.out.println("请输入持卡人身份证号码：");
			ssn = scan.next();
		}else
		{
			name=customer.getName();
			ssn=customer.getSsn();
		}
		System.out.println("请输入卡号：");
		String accountNum = scan.next();
		System.out.println("请输入存储卡利息:");
		double interestRate = scan.nextDouble();
		s = new SavingAccount(accountNum, 0, interestRate);
		customer = new Customer(ssn, name, c, s);
		if (customer.getCheckingAccount() != null)
			System.out.println(customer.toString());
		else
			System.out.println(customer.toStringSaving());
	}
	public static void save() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入存款金额：");
		double num = scan.nextDouble();
		s.setBalance(num + s.getBalance());
		customer.setSavingAccount(s);
		if(c!=null)
			System.out.println(customer.toString());
		else
			System.out.println(customer.toStringSaving());
	}
	public static void withdraw() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入取款金额：");
		double num = scan.nextDouble();
		if (num < 0)
			System.out.println("输入错误！");
		else if (num > s.getBalance())
			System.out.println("余额不足！");
		else {
			s.setBalance(s.getBalance() - num);
			customer.setSavingAccount(s);
		}
		if(c!=null)
			System.out.println(customer.toString());
		else
			System.out.println(customer.toStringSaving());
	}
	public static void comsume() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入消费额：");
		double num = scan.nextDouble();
		if (num < 0)
			System.out.println("输入错误！");
		else if (num > c.getBalance())
			System.out.println("余额不足！");
		else {
			c.setBalance(c.getBalance() - num);
			customer.setCheckingAccount(c);
		}
		if(s!=null)
			System.out.println(customer.toString());
		else
			System.out.println(customer.toStringChecking());
	}
	public static void repay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入还款金额：");
		double num = scan.nextDouble();
		c.setBalance(num + c.getBalance());
		customer.setCheckingAccount(c);
		if(s!=null)
			System.out.println(customer.toString());
		else
			System.out.println(customer.toStringChecking());
	}
	public static void settle() {
		if(s!=null&&c!=null)
		{
			
			s.payInterest();
			c.assessServiceCharge();
			customer.setCheckingAccount(c);
			customer.setSavingAccount(s);
			System.out.println(customer.toString());
		}
		else
			if(s==null)
			{
				c.assessServiceCharge();
				customer.setCheckingAccount(c);
				System.out.println(customer.toStringChecking());
			}
			else
			{
				s.payInterest();
				customer.setSavingAccount(s);
				System.out.println(customer.toStringSaving());
			}
	}
	public static void balance() {
		if(s!=null&&c!=null)
		{
			System.out.println("存储卡的余额：" + s.getBalance());
			System.out.println("信用卡的余额：" + c.getBalance());
		}
		else
			if(s==null)
				System.out.println("信用卡的余额：" + c.getBalance());
			else
				System.out.println("存储卡的余额：" + s.getBalance());

	}
}
