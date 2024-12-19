package JavaBasicProgram.com;

import java.util.Scanner;

public class CalculatePrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter unit price");
		int unitprice = sc.nextInt();

		System.out.println("enter the quqntity");
		int quqntity = sc.nextInt();

		int total = unitprice + quqntity;

		System.out.println("Total price is " + total);
	}

}
