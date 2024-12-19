package ControlFlow.com;

import java.util.Scanner;

public class Largest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num2) {
			System.out.println("is the first number is largest? yes");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("is the second number is largest? yes");
		} else {
			System.out.println("is the third number is largest? yes");

		}

	}
}
