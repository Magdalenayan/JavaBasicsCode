package com.syntax.class07May21;
import java.util.Scanner;
public class HWCalculator {

	public static void main(String[] args) {
/* HW: Using scanner class create calculator.
* Allow user to enter 2 numbers and operator(+,-,*,/).
 * Based on operator provide the result to user.
           Please complete this assignment in 2 ways: using if statement and switch case.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre the numbers");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char opp = scan.next().charAt(0);
		double result = 0;
		switch (opp) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result=x*y;
			break;
			
	System.out.println("Invalid Operatoy");
	}if(result!=0);{
System.out.println(x+" "+opp+" "+y+"="+result);}
scan.close();
	}}}
