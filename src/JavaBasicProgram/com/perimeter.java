package JavaBasicProgram.com;

import java.util.Scanner;

public class perimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the side value");
		int side = sc.nextInt();

		int perimeter = 4 * side;

		System.out.println("The perimeter of sequre is" + perimeter);
	}

}
