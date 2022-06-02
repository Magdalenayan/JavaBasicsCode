package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		boolean diploma=true;
		double gpa;
		if(diploma) {
			System.out.println("Congradulations");
			gpa=2.1;
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else if (gpa<3.5) {
			System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You should get a degree");
		}
		System.out.println("Tasks_-__________________________");
		
		double rate, price;
		rate=5.2;
		price=35216;
		if (rate>4.5) {
			System.out.println("House would not be bought");
		}else if(price>50000) {
			System.out.println("Loan will be taken from bank");
			if (price<49000) {
				System.out.println("Cash will be paid");
			}
		}

	}

}
