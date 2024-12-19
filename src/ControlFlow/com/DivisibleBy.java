package ControlFlow.com;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x % 5 == 0) {
			System.out.println("is the number is divisible by 5" + x);
		}
	}

}
