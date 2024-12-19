package PracticePrograms.com;

import java.util.Scanner;

public class BodyWeight {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter body weight");
		int weight=sc.nextInt();
		
		int height=sc.nextInt();
	
		int height1 =height*100;
		
		double bmi=weight/(height1*height1);
		
		if(bmi<=18.4) {
			System.out.println("Under weight");
		}else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal");
		}else if(bmi>=25.0 && bmi<=39.9) {
			System.out.println("Over Weight");
			
		}else if(bmi>=40.0) {
			System.out.println("Obese");
		}
	}

}
