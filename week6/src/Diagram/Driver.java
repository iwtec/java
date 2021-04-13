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
					System.out.println("���ȿ���ӵ�д洢����лл");
					break;
				}
				save();
				break;
			case 3:
				if (s == null) {
					System.out.println("���ȿ���ӵ�д洢����лл");
					break;
				}
				withdraw();
				break;
			case 4:
				if (c == null) {
					System.out.println("���ȿ���ӵ�����ÿ���лл");
					break;
				}
				comsume();
				break;
			case 5:
				if (c == null) {
					System.out.println("���ȿ���ӵ�����ÿ���лл");
					break;
				}
				repay();
				break;
			case 6:
				if (customer==null) {
					System.out.println("���ȿ�����лл");
					break;
				}
				settle();
				break;
			case 7:
				if (customer==null) {
					System.out.println("���ȿ�����лл");
					break;
				}
				balance();
				break;
			default:
				System.out.println("�����������������");
			}
			chioce = menu();
		}
		System.out.println("ллʹ�ã��˳�����");
	}
	public static int menu() {
		int chioce;
		System.out.println("==========Customer-Bank==========");
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8.�˳�");
		System.out.println("==========Customer-Bank==========");
		System.out.print("��ѡ��");
		Scanner scan = new Scanner(System.in);
		chioce = scan.nextInt();
		return chioce;
	}
	public static int submenu() {
		int chioce;
		System.out.println("=======Create=======");
		System.out.println("1.���ÿ�");
		System.out.println("2.�洢��");
		System.out.println("3.����");
		System.out.println("=======Create=======");
		System.out.println("��ѡ��");
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
					System.out.println("�벻Ҫ�ظ������ÿ���");
					break;
				}
				createCheckingAccount();
				break;
			case 2:
				if (s != null) {
					System.out.println("�벻Ҫ�ظ����洢����");
					break;
				}
				createSavingAccount();
				break;
			default:
				System.out.println("�����������������");
			}
			chioce = submenu();
		}
		System.out.println("ллʹ�ã��˳�����");
	}
	public static void createCheckingAccount() {
		String name;
		String ssn;
		if (s == null) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������ֿ���������");
			name = scan.next();
			System.out.println("������ֿ������֤���룺");
			ssn = scan.next();
		}else
		{
			name=customer.getName();
			ssn=customer.getSsn();
		}
		System.out.println("�����뿨�ţ�");
		Scanner scan1 = new Scanner(System.in);
		String accountNum = scan1.next();
		System.out.println("���������ÿ������:");
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
			System.out.println("������ֿ���������");
			name = scan.next();
			System.out.println("������ֿ������֤���룺");
			ssn = scan.next();
		}else
		{
			name=customer.getName();
			ssn=customer.getSsn();
		}
		System.out.println("�����뿨�ţ�");
		String accountNum = scan.next();
		System.out.println("������洢����Ϣ:");
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
		System.out.println("���������");
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
		System.out.println("������ȡ���");
		double num = scan.nextDouble();
		if (num < 0)
			System.out.println("�������");
		else if (num > s.getBalance())
			System.out.println("���㣡");
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
		System.out.println("���������Ѷ");
		double num = scan.nextDouble();
		if (num < 0)
			System.out.println("�������");
		else if (num > c.getBalance())
			System.out.println("���㣡");
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
		System.out.println("�����뻹���");
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
			System.out.println("�洢������" + s.getBalance());
			System.out.println("���ÿ�����" + c.getBalance());
		}
		else
			if(s==null)
				System.out.println("���ÿ�����" + c.getBalance());
			else
				System.out.println("�洢������" + s.getBalance());

	}
}
