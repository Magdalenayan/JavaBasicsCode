package com.syntax.reviewclass06;
import java.util.Scanner;
public class HomeWorkTask3 {
public static void main(String[] args) {
//Write a program for user to enter his/hers birth month.
//Based on the month define the season.
//Example:If user is born in March,April,May-->season="Spring"
//If user is born in June,July,August-->season="Summer"
//If user is born in September ,October,November-->season="Autumn"
//If user is born in December,January,February-->season ="Winter"
	
Scanner scan = new Scanner(System.in);
System.out.println("Please enter your birth month");
String m = scan.nextLine();
if (m.equalsIgnoreCase("December") || m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February")) {
	m = "Winter";
} else if (m.equalsIgnoreCase("March") || m.equalsIgnoreCase("April") || m.equalsIgnoreCase("May")) {
	m = "Spring";
} else if (m.equalsIgnoreCase("June") || m.equalsIgnoreCase("July") || m.equalsIgnoreCase("August")) {
	m = "Summer";
} else if (m.equalsIgnoreCase("September") || m.equalsIgnoreCase("October") || m.equalsIgnoreCase("November")) {
	m = "Autumn";
} else {
System.out.println("Invalid input");
}
System.out.println("You were born in season " + m);
	}

	}


