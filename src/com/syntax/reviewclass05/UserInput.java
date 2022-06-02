package com.syntax.reviewclass05;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args) {
		
Scanner scanner=new Scanner(System.in);

System.out.println("Please enter name");
String name=scanner.nextLine();//capture String
System.out.println(name);

System.out.println("Please enter age");
int age=scanner.nextInt();//capture int
System.out.println(age);

System.out.println("Please enter price");
double price=scanner.nextDouble();//capture double
System.out.println(price);

System.out.println("Please enter boolean");
boolean boo=scanner.nextBoolean();//capture boolean
System.out.println(boo);

System.out.println("Please enter any character");
char character=scanner.next().charAt(0);//capture 1 character
System.out.println(character);




	}

}
