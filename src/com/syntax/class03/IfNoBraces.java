package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		String time= "Morning";
		if (time.equals("Morning")) 
			
					System.out.println("Say Good Morning");
		else 
			// without braces  java can identity only 1 statements per block
					
					System.out.println("Say Good Day");
					System.out.println("Or say good evening");
					System.out.println("Make sure to use {}with if statement");
					
				

	}

}
