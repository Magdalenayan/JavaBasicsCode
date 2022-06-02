package com.syntax.reviewclass06;

import java.util.Scanner;

public class TaskHomeWork {

	public static void main(String[] args) {
//Write a program to ask user to enter numbers 
//of worked years and annual salary.If user worked for more of equals to 5 years
//than user is eligible for the bonus.otherwise he is not.Once user is eligible 
//and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
Scanner input = new Scanner(System.in);
	
System.out.println(" Enter number of years ");
	int years=input.nextInt();
System.out.println(" Enter annual salary");
	int salary=input.nextInt();
	
if(years>=5) {
	System.out.println(" You are eligible for bonus");
	if(salary>50000) {
System.out.println(" You are eligible for 5000 bonus");{
	} 
}else {
System.out.println(" You are eligible for 3000 bonus");
}
}else {
System.out.println(" Sorry you are not eligible for bonus");
	}
}}

