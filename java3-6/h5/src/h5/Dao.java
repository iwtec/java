package h5;


import java.util.ArrayList;
import java.util.Scanner;

public class Dao {

	public ArrayList<Student> InputStudentFromKeyboard() {
		ArrayList<Student> listStudent = new ArrayList<Student>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��������Ϣ����ÿ��ѧ��һ�У������ʽΪ��ѧ�ţ��������Ա𡱣��硰001���� �����С��������롰end��ʱ�������룩");
		String arr = "";
		while (!(arr = scan.nextLine()).equals("end")) {
			String a[] = arr.split(",|��");
			Student student = new Student(a[0], a[1], a[2],0);
			listStudent.add(student);
		}
		return listStudent;
	}

	public ArrayList<Course> InputCourseFromKeyboard() {
		ArrayList<Course> listCourse = new ArrayList<Course>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�����ÿ���ɼ�һ�У������ʽΪ��ѧ�ţ��γ����ƣ��ɼ������硰001��Java�� 90���������롰end��ʱ�������룩");
		String arr = "";
		while (!(arr = scan.nextLine()).equals("end")) {
			String a[] = arr.split(",|��");
			Course course = new Course(a[0], a[1],Double.parseDouble(a[2]));
			listCourse.add(course);
		}
		return listCourse;
	}


	public ArrayList<Student> processStudent(ArrayList<Student> student, ArrayList<Course> course) {
		int count;
		double avg,sum;
		System.out.println(student.size());
		for(Student stu:student) {
			count=0;
			avg=0;
			sum=0;
			for(Course cor:course) {
				if(stu.getId().equals(cor.getId())) {
					sum+=cor.getGrade();
					count++;
				}
			}
			avg=sum/count;
			stu.setAvg(avg);
		}
		return student;
	}

	public ArrayList<Result> processCourse(ArrayList<Course> course) {
		ArrayList<Result> result=new ArrayList<Result>();
		int count;
		double avg,sum;
		System.out.println("==========");
		for(Course cor:course) {
			count=0;
			avg=0;
			sum=0;
			for(Course cor1:course) {
				if(cor.getName().equals(cor1.getName())) {
					sum+=cor1.getGrade();
					count++;
				}
			}
			avg=sum/count;
			Result res = new Result(cor.getName(), avg);
			int i;
			for (i = 0; i < result.size(); i++) {
				if (res.getCoursename().equals(result.get(i).getCoursename())) {
					break;
				}
			}
			if (i >= result.size()) {
				result.add(res);
			}
		}
		return result;
	}

	public void print(ArrayList<Student> studentList, ArrayList<Result> resultList) {
		System.out.println("��ѧ��ͳ�ƣ�");
		System.out.println("ѧ��\t����\t�Ա�\tƽ����");
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		System.out.println("���γ�ͳ�ƣ�");
		System.out.println("�γ�\tƽ����");
		for (Result result : resultList) {
			System.out.println(result.toString());
		}

	}

}

