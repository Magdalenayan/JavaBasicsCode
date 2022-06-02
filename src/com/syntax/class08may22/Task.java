package com.syntax.class08may22;

public class Task {

	public static void main(String[] args) {
//Print numbers from 1 to 100 in 1 line with space
	for(int a=1; a<=100;a++) {
		System.out.print(a+" ");
	}	
		
//Print numbers from 100 to 1
    for(int b=100; b>=1; b--)	{
	System.out.print(b+" ");
}			
//Print even numbers from 20 to 1 (2 ways)
for(int c=20;c>=1;c--) {
  if(c%2==0)
  System.out.println(c+" ");
    }
//Print odd numbers between 20 and 1 (2 ways)
    for(int d=20; d>=1; d-=2) {
 System.out.println(d+" ");
    		
 //second way  		
 for(int e=20;e>=1;e--) {
	 if(e%2==0) {
	 System.out.println(e+" ");
		 
//Print odd number between 20 and 50(2 way)
		 for(int i=20; i<50; i++) {
				if(i%2 !=0) {
				System.out.print(i+" ");
			
System.out.println("---------------");
				
	for(int k=21;k<=50; k+=2) {
System.out.println(k+" ");
		
		System.out.println("----------------------");
		
		
	}}}}}	}}}
