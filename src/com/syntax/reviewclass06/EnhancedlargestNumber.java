package com.syntax.reviewclass06;

public class EnhancedlargestNumber {

	public static void main(String[] args) {
		
int num1=20;
int num2=20;
int num3=20;

/* compiler can initialize variables to it's default value
 * int ->0
 * double->0.0
 * boolean->false
 * String->null
 * 
 */

int largest;

if(num1>num2 && num1>num3) {
	largest=num1;
	
} else if(num3>num1 && num3>num2) {
	largest=num3;
	
} else if (num2> num1 && num2>num3) {
	largest=num2;
}
System.out.println("The largest number is "+largest);
//the veriable largest may not have been initialized
	}

}