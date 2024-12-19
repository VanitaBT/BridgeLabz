package ControlFlow.com;

import java.util.Scanner;

public class ComputeNatural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int n = sc.nextInt();

		int Nsum = n * (n + 1) / 2;
		int sum = 0;
		while (n >= 0) {
			sum = sum + n;
			n--;
		}
		System.out.println(sum + " " + Nsum);

		if (Nsum == sum) {
			System.out.println("from the both side sum is equal");
		}

	}

}
