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
					System.out.println("请先完成操作1");
				} else {
					avg();
				}
				break;
			case 3:
				if (score == null) {
					System.out.println("请先完成操作1");
				} else {
					hight();
				}
				break;
			case 4:
				if (score == null) {
					System.out.println("请先完成操作1");
				} else {
					low();
				}
				break;
			default:
				System.out.println("输入错误!");
			}
			choose = menu();
		}
		System.out.println("谢谢使用！退出程序");
	}

	public static int menu()// 最高
	{
		int choose;
		System.out.println("==================");
		System.out.println("1.输入五个学生成绩");
		System.out.println("2.输出平均成绩");
		System.out.println("3.输出最高分");
		System.out.println("4.输出最低分");
		System.out.println("5.退出");
		System.out.println("==================");
		System.out.println("请选择：");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void Input()// 输入学生成绩
	{
		score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生成绩(0~100)：");
			Scanner scan = new Scanner(System.in);
			score[i] = scan.nextInt();
			while (score[i] < 0 || score[i] > 100) {
				System.out.println("请重新输入第" + (i + 1) + "个学生成绩(0~100)：");
				Scanner scan1 = new Scanner(System.in);
				score[i] = scan1.nextInt();
			}
		}

	}

	public static void avg()// 求平均数
	{
		double sum = 0, avg;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println("平均分为" + avg);
	}

	public static void hight()// 最高
	{
		int max = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("最高分为" + max);
	}

	public static void low()// 最低
	{
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("最低分为" + min);
	}

}
