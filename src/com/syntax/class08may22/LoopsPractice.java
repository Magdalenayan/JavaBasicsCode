package com.syntax.class08may22;
public class LoopsPractice {
public static void main(String[] args) {
		
int sum=0;		
for(int i=1;i<6;i++) {
	sum+=i;
	
System.out.print(sum+" ");// 1 3 6 10 15
System.out.println(sum);//15
}
System.out.println("-------------------------");
//Write a program to find sum of all even and all odd numbers
//from 1 to 70
	
int sum1=0;
for(int a=1;a<=70;a++) {
if(a%2==0) {
sum1+=a;
}
System.out.println("Sum of all even="+ sum1);
int sum2=0;
for(int b=1;b<=70; b++) {
if(b%2 !=0) {
sum2+=b;
}}
System.out.println("Sum of all odds="+ sum2);
//Another way
int sumEven=0;
int sumOdd=0;
for(int c=1;c<=70;c++) {
if(c%2==0) {
sumEven+=c;
}else {
sumOdd+=c;
}}
System.out.println("Sum even numbers is "+ sumEven);
System.out.println("sum odd number is"+ sumOdd);





	}	}}		
	


