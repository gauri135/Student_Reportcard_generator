package com.studentReport.CardGenerator;

import java.util.Scanner;
import com.studentReport.logic.StudentOperations;

public class StudentReportCardGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentOperations operations = new StudentOperations();

		int choice;
		do {
			// Menu
			System.out.println("\n==== Student Report Card System ====");
			System.out.println("1. Add a New Student");
			System.out.println("2. Generate Report Card");
			System.out.println("3. Display All Report Cards");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				operations.addNewStudent();
				break;
			case 2:
				operations.generateReportCard();
				break;
			case 3:
				operations.displayAllReportCards();
				break;
			case 4:
				System.out.println("Exiting the program. Thank you!");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 4);

		sc.close();
	}

}
