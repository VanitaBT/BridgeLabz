package ProgramingElements.com;

import java.util.Scanner;

public class Athletic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distanses");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		int perimeter = side1 + side2 + side3;

		int totalDistance = 5000;
		// converted km to m

		int rounds = totalDistance / perimeter;

		System.out.println("total round he need to cover is" + rounds);
	}

}
