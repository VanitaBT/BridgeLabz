package ControlFlow.com;

import java.util.Scanner;

public class Spring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for month and date");
		int month = sc.nextInt();
		int day = sc.nextInt();

		if (month == 3 && day >= 20 || month > 3 && month < 6 || month == 6 && day <= 20) {
			System.out.println("It's a spring season");
		} else {
			System.out.println("not a spring seasons");
		}
	}

}
