package com.studentReport.pojo;

public class Subjects {

	String subjectName;
	int marks;

	public Subjects() {

	}

	public Subjects(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
