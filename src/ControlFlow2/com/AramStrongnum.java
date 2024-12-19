package ControlFlow2.com;

import java.util.Scanner;

public class AramStrongnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;

		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + d * d * d;
			num = num / 10;

		}
		if (temp == num) {
			System.out.println("Aram Strong Number");
		} else {
			System.out.println("Not a aram strong number");
		}
	}

}
