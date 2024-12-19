package JavaBasicProgram.com;

import java.util.Scanner;

public class HandShakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of student");
		int n = sc.nextInt();

		int combination = (n * (n - 1)) / 2;

		System.out.println("number of possible handshakes " + combination);
	}

}
