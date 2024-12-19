package ProgramingElements.com;

import java.util.Scanner;

public class TotalDistence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter the starting city: ");
		String fromCity = scanner.nextLine();

		System.out.print("Enter the via city: ");
		String viaCity = scanner.nextLine();

		System.out.print("Enter the destination city: ");
		String toCity = scanner.nextLine();

		System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
		double fromToVia = scanner.nextDouble();

		System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
		double viaToFinalCity = scanner.nextDouble();

		System.out.print("Enter the time taken to travel from " + fromCity + " to " + toCity + " (in hours): ");
		double timeTaken = scanner.nextDouble();

		double totalDistance = fromToVia + viaToFinalCity;

		double averageSpeed = totalDistance / timeTaken;

		System.out.println("\nTravel Details:");
		System.out.println("Name: " + name);
		System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
		System.out.println("Total Distance: " + totalDistance + " miles");
		System.out.println("Time Taken: " + timeTaken + " hours");
		System.out.println("Average Speed: " + averageSpeed + " miles per hour");
	}

}
