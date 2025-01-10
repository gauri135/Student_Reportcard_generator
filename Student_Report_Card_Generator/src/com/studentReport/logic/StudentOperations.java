package com.studentReport.logic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.studentReport.pojo.Student;
import com.studentReport.pojo.Subjects;

public class StudentOperations {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> students = new ArrayList<>();

	// Add a new student
	public void addNewStudent() {
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Roll Number: ");
		int rollNumber = sc.nextInt();

		System.out.print("Enter Age: ");
		int age = validInput();

		System.out.print("Enter Gender (M/F): ");
		String gender = sc.nextLine();

		System.out.print("Enter Grade: ");
		String grade = sc.nextLine();

		System.out.print("Enter Number of Subjects: ");
		int subjectCount = validInput();

		ArrayList<Subjects> subjects = new ArrayList<>();
		for (int i = 0; i < subjectCount; i++) {
			System.out.print("Enter Subject Name: ");
			String subjectName = sc.nextLine();

			System.out.print("Enter Marks for " + subjectName + " (0-100): ");
			int marks = validInput();

			subjects.add(new Subjects(subjectName, marks));
		}

		Student student = new Student(name, rollNumber, age, gender, grade, subjects);
		students.add(student);
		System.out.println("Student added successfully!\n");
	}

	// Generate report card for a specific student
	public void generateReportCard() {
		if (students.isEmpty()) {
			System.out.println("No students available to generate report cards.\n");
			return;
		}

		System.out.print("Enter Roll Number of the Student: ");
		int rollNumber =sc.nextInt();

		for (Student student : students) {
			if (student.getRollNumber() == rollNumber) {
				displayReportCard(student);
				return;
			}
		}
		System.out.println("Student with Roll Number " + rollNumber + " not found.\n");
	}

	// Display all report cards
	public void displayAllReportCards() {
		if (students.isEmpty()) {
			System.out.println("No students found!\n");
			return;
		}

		System.out.println("\n=== All Report Cards ===");
		for (Student student : students) {
			displayReportCard(student);
			System.out.println("----------------------");
		}
	}

	// Display details for a specific student
	private void displayReportCard(Student student) {
		ArrayList<Subjects> subjects = student.getSubjects();
		if (subjects.isEmpty()) {
			System.out.println("No subjects found for the student.\n");
			return;
		}

		int totalMarks = 0;
		for (Subjects subject : subjects) {
			totalMarks += subject.getMarks();
		}

		double percentage = (double) totalMarks / subjects.size();

		System.out.println("╔════════════════════════════════════════════╗");
		System.out.println("║                _Report Card_               ║");
		System.out.println("╠════════════════════════════════════════════╣");
		System.out.printf("║ %-15s : %-25s ║\n", "Roll Number", student.getRollNumber());
		System.out.printf("║ %-15s : %-25s ║\n", "Name", student.getName());
		System.out.printf("║ %-15s : %-25s ║\n", "Age", student.getAge());
		System.out.printf("║ %-15s : %-25s ║\n", "Gender", student.getGender());
		System.out.printf("║ %-15s : %-25s ║\n", "Grade", student.getGrade());
		System.out.println("╠════════════════════════════════════════════╣");
		System.out.println("║               _Subject Marks_              ║");
		System.out.println("╠════════════════════════════════════════════╣");

		for (Subjects subject : subjects) {
			System.out.printf("║ %-15s : %-25s ║\n", subject.getSubjectName(), subject.getMarks());
		}

		System.out.println("╠════════════════════════════════════════════╣");
		System.out.printf("║ %-15s : %-25s ║\n", "Total Marks", totalMarks);
		System.out.printf("║ %-15s : %-25.2f ║\n", "Percentage", percentage);
		System.out.println("╚════════════════════════════════════════════╝");

		determineGrade(percentage);
	}

	// Determine grade based on percentage
	private void determineGrade(double percentage) {
		if (percentage >= 60) {
			System.out.println("Congratulations! Grade: A+");
		} else if (percentage >= 50) {
			System.out.println("Congratulations! Grade: B+");
		} else if (percentage >= 35) {
			System.out.println("Congratulations! Grade: C+");
		} else {
			System.out.println("Fail");
		}
		System.out.println();
	}

	// Validate input for marks or numeric fields
	private int validInput() {
		int value = 0;
		boolean isValid = false;

		while (!isValid) {
			try {
				value = sc.nextInt();
				sc.nextLine(); // Clear the buffer
				if (value < 0 || value > 100) {
					throw new IllegalArgumentException("Value must be between 0 and 100.");
				}
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter a numeric value.");
				sc.next(); // Clear the invalid input
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			if (!isValid) {
				System.out.print("Please enter a valid value: ");
			}
		}
		return value;
	}
}
