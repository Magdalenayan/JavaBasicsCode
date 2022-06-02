package com.syntax.class07May21;

public class WhileLoopExamples {

public static void main(String[] args) {
  //print numbers from 1 to 10;
		
	int num=1;
 while(num<=10) {
  //num++;	 //234567891011
		 System.out.print(num+" ");  
		  num++;//12345678910
		  
//print numbers from 1 to 10;
		  int num1=0;
		  while(num1<=10) {
			  num1++;
			  System.out.println(num1+" ");
			  
	int a=10;
	while(a<=100) {
		System.out.print(a+" ");
		a++;
		
		
//print number from 10 to 1;
		System.out.println();
		int b=10;
		while(b>=10) {
		System.out.print(b+" ");
		b--;
		
		
		int c=100;
		while (c>=50) {
		System.out.print(c+" ");
		c--;
		
//print numbers from -1 to-10
		System.out.println();
		int d = -1;
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
			
//print number from 1 to 20 but only even numbers
			System.out.println();//1 way
			int e=2;
			while(e<=20) {
				System.out.print(e+" ");
				e+=2;
			}
//2 way
			int f=1;
			while(f<=20) {
				if(f%2==0)
				System.out.print(f+" ");
			}
				f++;
				int r=100;
				while(r>=1) {
					if(r%2 !=0) {
						System.out.println(r+" ");
					}
					r--;
					
					
//another way
					System.out.println();
					int y=99;
					while(y>=1) {
						System.out.print(y+" ");
						y-=2;
						
					}
				}
			}

		}}}}}}}
		
		
	
