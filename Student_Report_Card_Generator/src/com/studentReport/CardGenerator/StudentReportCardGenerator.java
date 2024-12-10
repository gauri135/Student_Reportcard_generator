package com.studentReport.CardGenerator;

import com.studentReport.logic.ReportCard;

public class StudentReportCardGenerator {

	public static void main(String[] args) {

		ReportCard reportcard = new ReportCard();
		reportcard.input();
		reportcard.calculate();
		reportcard.display();

	}

}
