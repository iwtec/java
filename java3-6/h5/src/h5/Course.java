package h5;

public class Course {
	private String id;
	private String name;
	private double grade;
	public Course() {
		super();
	}
	public Course(String id, String name, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + grade ;
	}
	
	

}

