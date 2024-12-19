package ControlFlow.com;

import java.util.Scanner;

public class BonusSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person sal");
		int sal = sc.nextInt();

		System.out.println("Enter year of service");
		int yearOfservice = sc.nextInt();

		double bonus = 0;
		if (yearOfservice > 5) {
			bonus = sal * 0.05;
			System.out.println(bonus + " ");
		}

	}

}
