package ControlFlow.com;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int n = sc.nextInt();

		int sum = 0;
		if (n >= 0) {
			sum = n * (n + 1) / 2;
			System.out.println("The sum of natural num" + sum);

		} else {
			System.out.println("The number is not a natural number");
		}
	}

}
