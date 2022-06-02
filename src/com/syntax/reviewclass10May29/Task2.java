package com.syntax.reviewclass10May29;

public class Task2 {

	public static void main(String[] args) {
		String [][] usa={
				{"New York" , "Albany" , "Buffalo"},
				{"Los Angeles" , "San Fransisco" , "San Jose" , "San Diego" , "Redding"},
				{"Miami" , "Orlando" , "Niceville" , "Tampa"},
				{"McLean" , "Richmond" , "Leesburg"}
				};
		System.out.println("Retrieve all value using for each loop");
		for (String[]state:usa) {
			for (String city:state) {
				System.out.print(city+"  ");
			}
		System.out.println();
	}

}}
