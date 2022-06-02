package com.syntax.reviewclass05;
import java.util.Scanner;
public class TaskCreditCard {
public static void main(String[] args, Scanner input) {
		
Scanner scan = new Scanner(System.in);
System.out.println("Do you have a credit card ?yes ot no");
		
String answer=input.next();
		
if (answer.equalsIgnoreCase("no")) {
System.out.println("We will offer you a credit card");
}else {
System.out.println("What is your balance");
int balance=scan.nextInt();
	
if (balance>1000) {
System.out.println("You have to pay off immediately");
}else {
System.out.println("You can spend more");
}}
}}