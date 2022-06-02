package com.syntax.class07May21;

public class DoWhile {

	public static void main(String[] args) {
int num=10;
while(num<=3) {
	System.out.print(num+" ");
	num++;
}
System.out.println("  ---------------------------------   ");
//do while first executes the code 
//and only then check the condition
int num1=10;
	do {
		System.out.print(num1+" ");
		num1++;
		
		}while(num1<=3);
// print numbers  1to 30 using do while
	
	int num3 = 1;
	do {
		System.out.println(num3 + " ");
		num3++;
	} while (num3 <= 30);
	
	//print even numbers from 70 to 30//70 68 66 64
	int g= 70;
	  do {
		  System.out.print(g+" ");
		
		  	g-=2;		
	  } while (g >= 30);
	
	
	  }

}
