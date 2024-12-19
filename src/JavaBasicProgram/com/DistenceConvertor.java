package JavaBasicProgram.com;

import java.util.Scanner;

public class DistenceConvertor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the distance in feet: ");
		double distanceInFeet = scanner.nextDouble();

		double distanceInYards = distanceInFeet / 3;

		double distanceInMiles = distanceInYards / 1760;

		System.out.println("distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards
				+ "and inches is " + distanceInMiles);
	}

}
