package com.syntax.reviewclass10May29;

public class HW {

	public static void main(String[] args) {
//Create an array to store double values and 
//then print all elements using 2 different loops 
		
		double[] num= {2.99,3.99,4.99,5};
		for(double x : num) {
			System.out.println(x+" ");
		}
		System.out.println();
		for (int i=0;i<num.length; i++) {
			System.out.println(num[i]+" ");
		}
	System.out.println("--------------------------------");	
//Create an array on integers
		//and calculate the sum off all elements in an array
int[] numbers= {10,222,3,4,5};
int sum=0;
for (int i=0; i<numbers.length; i++) {
	sum=sum+numbers[i];
}
System.out.println("Sum of all elments="+sum);
sum=0;
for(int n:numbers) {
	sum+=n;
	
}
System.out.println("Sum off all elements="+sum);
	}

}
