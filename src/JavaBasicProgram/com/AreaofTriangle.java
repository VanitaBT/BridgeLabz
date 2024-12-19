package JavaBasicProgram.com;

import java.util.Scanner;

public class AreaofTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base of the triangle in inches: ");
		double baseInches = sc.nextDouble();

		System.out.print("Enter the height of the triangle in inches: ");
		double heightInches = sc.nextDouble();

		double areaInches = 0.5 * baseInches * heightInches;

		double areaCm = areaInches * Math.pow(2.54, 2);

		System.out.println("The area of the triangle is " + areaInches + " square inches.");
		System.out.println("The area of the triangle is " + areaCm + " square centimeters.");
	}

}
