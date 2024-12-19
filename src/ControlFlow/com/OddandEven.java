package ControlFlow.com;

import java.util.Scanner;

public class OddandEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers");
		int x = sc.nextInt();

		for (int i = 1; i < x; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			} else
				System.out.println(i + " ");

		}
	}

}
