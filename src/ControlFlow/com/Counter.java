package ControlFlow.com;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers");
		int count = sc.nextInt();

		while (count > 0) {
			System.out.println(count + " ");
			count--;

		}
	}

}
