package PracticePrograms.com;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter marks for Physics: ");
		double physicsMarks = scanner.nextDouble();

		System.out.print("Enter marks for Chemistry: ");
		double chemistryMarks = scanner.nextDouble();

		System.out.print("Enter marks for Maths: ");
		double mathsMarks = scanner.nextDouble();

		double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
		double percentage = (totalMarks / 300) * 100; // Total maximum marks = 300

		double averageMarks = totalMarks / 3;

		String grade = "";
		String remarks = "";

		if (percentage >= 90) {
			grade = "A+";
			remarks = "Excellent";
		} else if (percentage >= 80) {
			grade = "A";
			remarks = "Very Good";
		} else if (percentage >= 70) {
			grade = "B+";
			remarks = "Good";
		} else if (percentage >= 60) {
			grade = "B";
			remarks = "Average";
		} else if (percentage >= 50) {
			grade = "C";
			remarks = "Below Average";
		} else {
			grade = "F";
			remarks = "Fail";
		}

		System.out.println("\n--- Student Result ---");
		System.out.println("Physics Marks: " + physicsMarks);
		System.out.println("Chemistry Marks: " + chemistryMarks);
		System.out.println("Maths Marks: " + mathsMarks);
		System.out.println("Total Marks: " + totalMarks + " / 300");
		System.out.println("Average Marks: " + averageMarks);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Grade: " + grade);
		System.out.println("Remarks: " + remarks);
	}



}


