package com.syntax.class08may22;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		//when to use While
		
//declare a secret number;
//you want to ask user to guess your secret number
//you code should keep asking to guess until
//user gets your secret number
//Once user gets the secret number-->you got it!!
		
		int secretNum=700;
		int guessedNum;
Scanner scan=new Scanner(System.in);
do {
System.out.println("Please guess the secret number");		
guessedNum=scan.nextInt();
} while(guessedNum !=secretNum);

System.out.println("You got it");
	}
}
