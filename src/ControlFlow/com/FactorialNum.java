package ControlFlow.com;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();

		int t = 1;
		while (x > 0) {
			t = t * x;
			x--;

		}
		System.out.println("Factorial of num while loop" + t);

		int t1 = 1;
		for (int i = 1; i < x; i++) {
			t1 = t1 * i;

		}
		System.out.println("Factorial of number using for loop " + t1);
	}

}
