package hw3;

import java.util.Scanner;

public class hw5 {

	public static int score[] = null;

	public static void main(String[] a) {

		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				Input();
				break;
			case 2:
				if (score == null) {
					System.out.println("������ɲ���1");
				} else {
					avg();
				}
				break;
			case 3:
				if (score == null) {
					System.out.println("������ɲ���1");
				} else {
					hight();
				}
				break;
			case 4:
				if (score == null) {
					System.out.println("������ɲ���1");
				} else {
					low();
				}
				break;
			default:
				System.out.println("�������!");
			}
			choose = menu();
		}
		System.out.println("ллʹ�ã��˳�����");
	}

	public static int menu()// ���
	{
		int choose;
		System.out.println("==================");
		System.out.println("1.�������ѧ���ɼ�");
		System.out.println("2.���ƽ���ɼ�");
		System.out.println("3.�����߷�");
		System.out.println("4.�����ͷ�");
		System.out.println("5.�˳�");
		System.out.println("==================");
		System.out.println("��ѡ��");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void Input()// ����ѧ���ɼ�
	{
		score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.println("�������" + (i + 1) + "��ѧ���ɼ�(0~100)��");
			Scanner scan = new Scanner(System.in);
			score[i] = scan.nextInt();
			while (score[i] < 0 || score[i] > 100) {
				System.out.println("�����������" + (i + 1) + "��ѧ���ɼ�(0~100)��");
				Scanner scan1 = new Scanner(System.in);
				score[i] = scan1.nextInt();
			}
		}

	}

	public static void avg()// ��ƽ����
	{
		double sum = 0, avg;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println("ƽ����Ϊ" + avg);
	}

	public static void hight()// ���
	{
		int max = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("��߷�Ϊ" + max);
	}

	public static void low()// ���
	{
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("��ͷ�Ϊ" + min);
	}

}
