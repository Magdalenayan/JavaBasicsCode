package com.syntax.reviewclass05;
import java.util.Scanner;
public class task {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Please enter your height");
int height=input.nextInt();
		
if(height<60) {
System.out.println("Person is short");
}else if(height>=60 && height <=72) {
System.out.println("Person is medium");
}else if(height>72) {
System.out.println("Person is tall");
}
System.out.println("------------------------------------");
int day = 7;
if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
System.out.println("It's a weekday");
} else if (day == 6 || day == 7) {
System.out.println("It's a weekend");
} else {
System.out.println("Invalid Day");
}	}}
