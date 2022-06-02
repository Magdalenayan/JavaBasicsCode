package com.syntax.class08may22;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		
// Print number from 1 to 50 except those that are divisible by 3
	for(int t=1; t<50; t++) {
		if(t%3==0) {
			continue;}
		System.out.println(t+" ");
		}
	}
		
		
		
//Create a program that will keep asking user
//to apply for a credit card.
//As soon you get “yes” from a user program should stop asking.	

		Scanner scan=new Scanner(System.in);
		String credit;{
		do {
		System.out.println("Did apply for credit card?");
		credit=scan.nextLine();
		}while(!credit.equalsIgnoreCase("YES"));
		System.out.println("Nice,Good job");
		}	
		
		
		
	
}