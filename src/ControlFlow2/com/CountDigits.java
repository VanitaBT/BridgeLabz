package ControlFlow2.com;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 0;
		while (num > 0) {
			int d = num % 10;
			count++;
			num = num / 10;

		}
		System.out.println("The num of digits" + count);
	}

}
