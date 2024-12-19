package JavaBasicProgram.com;

import java.util.Scanner;

public class heightinInches {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your heigth");
		int h = sc.nextInt();

		double inches = h / 2.54;
		int feet = (int) (inches / 12);

		System.out.println(" Your Height in cm is " + h + " while in feet is " + inches + " and inches is " + feet);
	}

}
