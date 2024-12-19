package ControlFlow.com;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.println("is the first number is smallest yes");
		} else {
			System.out.println("is the first number is smallest no");

		}

	}

}
