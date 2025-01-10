package com.studentReport.pojo;

import java.util.ArrayList;

public class Student {

	String name;
	int rollNumber;
	int age;
	String gender;
	String grade;
	ArrayList<Subjects> subjects; // List of subjects

	public Student() {

	}

	public Student(String name, int rollNumber, int age, String gender, String grade, ArrayList<Subjects> subjects) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ArrayList<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subjects> subjects) {
		this.subjects = subjects;
	}

}
