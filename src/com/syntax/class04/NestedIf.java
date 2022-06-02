package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
				// if is false no working;
		int dose=1;
		if(vaccine) {
			System.out.println("Let me check doses you have");
			if (dose==1) {
				System.out.println("You neeed 1 more shot");
			}else {
				System.out.println("You are fully vacinated");
			}
			
			System.out.println("---------------------");
			
			String month="June";
			int day=19;
			if(month.equals("May")) {
				System.out.println("Let me check day in May");
				
				if (day==8) {
					System.out.println("today is a Mother's Day");
				
			}
			
		}	else if (month.equals("June"))	{	
			System.out.println("Let me check day in June");
		if (day==19) {
			System.out.println("Today is a Father's Day");
		}	
		}
	}
	}
	}
