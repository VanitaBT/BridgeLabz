package ProgramingElements.com;

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Salary ");
		int sal = sc.nextInt();

		int bonus = sc.nextInt();

		int totalSal = sal + bonus;

		System.out.println("The total sal of emp" + totalSal);
	}

}
