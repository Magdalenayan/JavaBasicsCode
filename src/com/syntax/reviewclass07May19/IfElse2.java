package com.syntax.reviewclass07May19;

public class IfElse2 {

	public static void main(String[] args) {
//When code executes but does not produce
		//expected results we call these mistakes Logical errors
//When code does not even executes we call these mistakes Syntax errors
String day="Friday";
//=null; in non-primitive type 
//variables we can store null which means Nothing
String day="Monday";
if(day.equals("Monday")) {
	System.out.println("weekday");
}

if("Tuesday".equals(day)) {
	System.out.println("weekday");
}
if("Wednesday".equals(day)) {
	System.out.println("weekday");
}
if("Thursday".equals(day)) {
	System.out.println("weekday");
}
if("Friday".equals(day)) {
	System.out.println("weekday");
}

if("Saturday".equals(day)) {
	System.out.println("Weekend");
}

if("Sunday".equals(day)) {
	System.out.println("Weekend");
}
}

//If we have to test multiple conditions we go with if else if condition	
	
}

	


