package ControlFlow.com;

import java.util.Scanner;

public class Multification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();

		for (int j = 6; j <= 9; j++) {
			int z = num * j;
			System.out.println(num + "*" + j + "=" + z);
		}

	}
}
