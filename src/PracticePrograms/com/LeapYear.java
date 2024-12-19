package PracticePrograms.com;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year (>= 1582): ");
		int year = scanner.nextInt();

		System.out.println("\n--- Part 1: Multiple if-else Statements ---");
		if (year < 1582) {
			System.out.println("Year must be 1582 or later (Gregorian calendar).");
		} else {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println(year + " is a Leap Year.");
					} else {
						System.out.println(year + " is not a Leap Year.");
					}
				} else {
					System.out.println(year + " is a Leap Year.");
				}
			} else {
				System.out.println(year + " is not a Leap Year.");
			}
		}

		System.out.println("\n--- Part 2: Single if statement with multiple conditions ---");
		if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
			System.out.println(year + " is a Leap Year.");
		} else if (year >= 1582) {
			System.out.println(year + " is not a Leap Year.");
		} else {
			System.out.println("Year must be 1582 or later (Gregorian calendar).");
		}
    }
}







