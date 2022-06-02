package com.syntax.class07May21;
import java.util.Scanner;
public class LoopAndScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String offer;
		System.out.println("Did you get a job");
		
		while (!offer.equalsIgnoreCase("YES")) {
			System.out.println("Did you get a job");
			offer=input.nextLine();
		}
		System.out.println("Congratilations");

		
		
	}

}
