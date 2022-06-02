package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/*
		 * declare 2 numbers and verity which one is the largest
		 * 
		 */
     int  num1=20;
     int  num2=20;
     if (num1>num2) {
    	 System.out.println(num1+" is the larger than "+num2);
    	 
     } else if (num2>num1 ) {
    		 System.out.println(num2+" is the larger than "+num1);
    	 }else {
    		 System.out.println(num1+" is equal to "+num2);
    	 }
	System.out.println("--------------------------------");
	/*
	 * the moment Java find true condition -->
	 * it execute that block and exist entire 
	 * if statement
	 * 
	 */
	int day=4;
	
	 if (day==1) { System.out.println("Monday");
	 }else if(day==2){ System.out.println("Tuesday");
	 }else if(day==3){ System.out.println("Wednesday");
	 }else if(day==4){ System.out.println("Thursday");
	 }else if(day==5){ System.out.println("Friday");
	 }else if(day==6){ System.out.println("Saturday");
	 }else if(day==7){
	 System.out.println("Sunday"); }
	
	System.out.println("---------------------------");
	
	 int Month=7;
	  if (Month==1) {
		 System.out.println("January");
	 }else if(Month==2){
		 System.out.println("February");
	 }else if(Month==3){ 
		 System.out.println("March");
	 }else if(Month==4){ 
		 System.out.println("April");
	 }else if(Month==5){
		 System.out.println("May");
	 }else if(Month==6){
		 System.out.println("June");
	 }else if(Month==7){
		 System.out.println("July"); 
	 }else if(Month==8){
		 System.out.println("August");
	 }else if(Month==9){
		 System.out.println("September");
	 }else if(Month==10){
		 System.out.println("October");
	 }else if(Month==11){
		 System.out.println("November");
	 }else if(Month==12){ 
		 System.out.println("December");}
	 }
	
	
	
	
	
	}
	
 


