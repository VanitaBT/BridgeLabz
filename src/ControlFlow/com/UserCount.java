package ControlFlow.com;

import java.util.Scanner;

public class UserCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int x;
		while(true) {
			System.out.println("Enter a number");
		    x=sc.nextInt();
		  
		    
		    if(x<=0) 
		    	break;
		    
		    
		    sum=sum+x;
		    
		    
		}
		
		System.out.println("total sum "+sum);
	}
	

}
