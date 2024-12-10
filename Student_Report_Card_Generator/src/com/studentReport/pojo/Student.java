package com.studentReport.pojo;

public class Student {

	private int student_Id;
	private String student_Name;
	private int student_age;

	public Student() {

	}

	public Student(int student_Id, String student_Name, int student_age) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_age = student_age;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

}
