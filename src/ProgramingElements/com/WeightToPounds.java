package ProgramingElements.com;

import java.util.Scanner;

public class WeightToPounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in ponds");
		int p = sc.nextInt();

		int k = (int) (p * 2.2);

		System.out.println(k + " ");
	}

}
