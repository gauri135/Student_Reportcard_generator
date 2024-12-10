package com.studentReport.logic;

import java.util.Scanner;

import com.studentReport.pojo.Student;
import com.studentReport.pojo.Subjects;

public class ReportCard {

	Scanner sc = new Scanner(System.in);

	Student student = new Student();
	Subjects subjects = new Subjects();

	Long TotalMarks;
	Long average;
	Double percentage;

	public void input() {

		System.out.println("**Students Details**");
		System.out.println("________________________________");
        System.out.println();
		System.out.println("Enter the Student_id :- ");
		student.setStudent_Id(sc.nextInt());
		System.out.println("Enter the Student_Name :- ");
		student.setStudent_Name(sc.next());
		System.out.println("Enter the Student_Age :- ");
		student.setStudent_age(sc.nextInt());
		System.out.println();
		System.out.println("**Subjects Marks**");
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Markes Of Marathi :-");
		subjects.setMarathi(sc.nextInt());
		System.out.println("Markes Of English :-");
		subjects.setEnglish(sc.nextInt());
		System.out.println("Markes Of Biology :-");
		subjects.setBiology(sc.nextInt());
		System.out.println("Markes Of Chemistry :-");
		subjects.setChemistry(sc.nextInt());
		System.out.println("Markes Of Physics :-");
		subjects.setPhysics(sc.nextInt());
		System.out.println("Markes Of Maths :-");
		subjects.setMaths(sc.nextInt());
		System.out.println();

	}

	public void calculate() {

		TotalMarks = (long) subjects.getMarathi() + subjects.getEnglish() + subjects.getBiology()
				+ subjects.getChemistry() + subjects.getPhysics() + subjects.getMaths();

		average = TotalMarks / 2;

		percentage = (double) TotalMarks / 600 * 100;

	}

	public void display() {
		System.out.println("### _Report Card_ ####");
		System.out.println("Student ID :- " + student.getStudent_Id());
		System.out.println("Student Name :- " + student.getStudent_Name());
		System.out.println("Student Age :- " + student.getStudent_age());
		System.out.println();
		System.out.println("_Subject Marks_");
		System.out.println(" Marathi " + subjects.getMarathi());
		System.out.println(" English " + subjects.getEnglish());
		System.out.println(" Chemistry " + subjects.getChemistry());
		System.out.println(" Biology " + subjects.getBiology());
		System.out.println(" Physics " + subjects.getPhysics());
		System.out.println(" Maths " + subjects.getMaths());
		System.out.println("__________________________________________");
		System.out.println(" Total :- " + TotalMarks);
		System.out.println(" Average :- " + average);
		System.out.println(" Percentage :- " + percentage + "%");
		grade();

	}

	public void grade() {
		if (percentage >= 60) {
			System.out.println(" Congratulations! Pass ");
			System.out.println(" Grade:- A+");
		} else if (percentage < 60 && percentage >= 50) {
			System.out.println("Congratulations! Pass");
			System.out.println(" Grade:- B+ ");
		} else if (percentage < 50 && percentage >= 35) {
			System.out.println(" Pass ");
			System.out.println(" Grade:- C+ ");
		} else {
			System.out.println(" Fail ");

		}
	}

}
