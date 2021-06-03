package h5;


public class Student {
	private String id;
	private String name;
	private String gender;
	private double avg;
	public Student() {
		super();
	}
	public Student(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Student(String id, String name, String gender, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.avg = avg;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg1(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + gender + "\t" + String.format("%.2f",avg );
	}
	public void setAvg(double avg2) {
		// TODO 自动生成的方法存根
		
	}
	
	

}
