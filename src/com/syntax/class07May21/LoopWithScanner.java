package com.syntax.class07May21;
import java.util.Scanner;
public class LoopWithScanner {

	public static void main(String[] args) {
//we are going to ask you if you got a job
//we will continuously asking if you get a job until you say YES!
// once you will say YES-->>Congratulations!
		
Scanner scan=new Scanner(System.in);
String job;
do {
System.out.println("Did you get a job");//Numerals of times!!!
job=scan.nextLine();

} while(!job.equalsIgnoreCase("YES"));

	System.out.println("Congratulations!!!!");
	
	
	System.out.println("--------------------------------------");
	

		
	}

}
