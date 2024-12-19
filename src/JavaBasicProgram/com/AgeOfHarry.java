package JavaBasicProgram.com;

import java.util.Scanner;

public class AgeOfHarry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Harsys birth year");
		int birth_y = sc.nextInt();

		System.out.println("Enter Current Year");
		int currenty = sc.nextInt();

		int age = currenty - birth_y;

		System.out.println("age of Harsys is" + age);

	}

}
