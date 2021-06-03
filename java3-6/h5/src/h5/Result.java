package h5;
public class Result {
	private String coursename;
	private double courseAvg;
	public Result() {
		super();
	}
	public Result(String coursename, double courseAvg) {
		super();
		this.coursename = coursename;
		this.courseAvg = courseAvg;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public double getCourseAvg() {
		return courseAvg;
	}
	public void setCourseAvg(double courseAvg) {
		this.courseAvg = courseAvg;
	}
	@Override
	public String toString() {
		return coursename + "\t" + String.format("%.2f",courseAvg ) ;
	}

	
}
