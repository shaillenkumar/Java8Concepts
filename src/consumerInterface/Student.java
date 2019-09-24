package consumerInterface;

public class Student {
	String name;
	String branch;
	String year;
	int grade;
	
	public Student() {
		super();
		
	}
	
	
	public Student(String name, String branch, String year, int grade) {
		super();
		this.name = name;
		this.branch = branch;
		this.year = year;
		this.grade = grade;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", year=" + year + ", grade=" + grade + "]";
	}

}
