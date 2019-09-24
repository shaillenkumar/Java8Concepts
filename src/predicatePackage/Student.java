package predicatePackage;

import java.util.List;

public class Student {
	String name;
	String branch;
	String year;
	int grade;
	int marks;
	List activities;
	
	public Student() {
		super();
		
	}
	
	
	public Student(String name, String branch, String year, int grade,int marks, List activities) {
		super();
		this.name = name;
		this.branch = branch;
		this.year = year;
		this.grade = grade;
		this.marks = marks;
		this.activities=activities;
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


	public List getActivities() {
		return activities;
	}


	public void setActivities(List activities) {
		this.activities = activities;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", year=" + year + ", grade=" + grade + ", marks= "+marks+"]";
	}

}
