package ProgramingElements.com;

import java.util.Scanner;

public class SwapNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The swapped numbers are " + num1 + " and " + num2);
	}

}