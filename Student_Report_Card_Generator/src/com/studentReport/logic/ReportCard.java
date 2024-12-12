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

		System.out.println("   _Students Details_   ");
		System.out.println();
		System.out.print(" Enter the Student_id :- ");
		student.setStudent_Id(sc.nextInt());
		System.out.println();
		System.out.print(" Enter the Student_Name :- ");
		student.setStudent_Name(sc.next());
		System.out.println();
		System.out.print(" Enter the Student_Age :- ");
		student.setStudent_age(sc.nextInt());
		System.out.println();
		System.out.println("  _Subjects Marks_  ");
		System.out.println();
		System.out.print(" Markes Of Marathi :-");
		subjects.setMarathi(sc.nextInt());
		System.out.println();
		System.out.print(" Markes Of English :-");
		subjects.setEnglish(sc.nextInt());
		System.out.println();
		System.out.print(" Markes Of Biology :-");
		subjects.setBiology(sc.nextInt());
		System.out.println();
		System.out.print(" Markes Of Chemistry :-");
		subjects.setChemistry(sc.nextInt());
		System.out.println();
		System.out.print(" Markes Of Physics :-");
		subjects.setPhysics(sc.nextInt());
		System.out.println();
		System.out.print(" Markes Of Maths :-");
		subjects.setMaths(sc.nextInt());
		System.out.println();

	}

	public void calculate() {

		TotalMarks = (long) subjects.getMarathi() + subjects.getEnglish() + subjects.getBiology()
				+ subjects.getChemistry() + subjects.getPhysics() + subjects.getMaths();

		percentage = (double) TotalMarks / 600 * 100;

	}

	public void display() {
		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║               _Report Card_               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.printf("║ %-15s : %-23s ║\n", "Student ID", student.getStudent_Id());
		System.out.printf("║ %-15s : %-23s ║\n", "Student Name", student.getStudent_Name());
		System.out.printf("║ %-15s : %-23s ║\n", "Student Age", student.getStudent_age());
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║               _Subject Marks_             ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.printf("║ %-15s : %-23s ║\n", "Marathi", subjects.getMarathi());
		System.out.printf("║ %-15s : %-23s ║\n", "English", subjects.getEnglish());
		System.out.printf("║ %-15s : %-23s ║\n", "Chemistry", subjects.getChemistry());
		System.out.printf("║ %-15s : %-23s ║\n", "Biology", subjects.getBiology());
		System.out.printf("║ %-15s : %-23s ║\n", "Physics", subjects.getPhysics());
		System.out.printf("║ %-15s : %-23s ║\n", "Maths", subjects.getMaths());
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.printf("║ %-15s : %-23s ║\n", "Total", TotalMarks);
		System.out.printf("║ %-15s : %-23s ║\n", "Percentage", percentage + "%");
		System.out.println("╚═══════════════════════════════════════════╝");
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
