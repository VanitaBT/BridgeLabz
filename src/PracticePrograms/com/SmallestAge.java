package PracticePrograms.com;

import java.util.Scanner;

public class SmallestAge {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter Amar's age ");
		int amarAge = scanner.nextInt();
		System.out.print("Enter Amar's height ");
		int amarHeight = scanner.nextInt();

		System.out.print("Enter Akbar's age ");
		int akbarAge = scanner.nextInt();
		System.out.print("Enter Akbar's height ");
		int akbarHeight = scanner.nextInt();

		System.out.print("Enter Anthony's age ");
		int anthonyAge = scanner.nextInt();
		System.out.print("Enter Anthony's height ");
		int anthonyHeight = scanner.nextInt();

		
		String youngestFriend = "Amar";
		int youngestAge = amarAge;

		if (akbarAge < youngestAge) {
			youngestFriend = "Akbar";
			youngestAge = akbarAge;
		}
		if (anthonyAge < youngestAge) {
			youngestFriend = "Anthony";
			youngestAge = anthonyAge;
		}

		System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");

		
		String tallestFriend = "Amar";
		int tallestHeight = amarHeight;

		if (akbarHeight > tallestHeight) {
			tallestFriend = "Akbar";
			tallestHeight = akbarHeight;
		}
		if (anthonyHeight > tallestHeight) {
			tallestFriend = "Anthony";
			tallestHeight = anthonyHeight;
		}

		System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + ".");
	}


}


