package com.syntax.class07May21;

public class WhileLoop {

	public static void main(String[] args) {
	int time=1;
	if(time<12) {
		System.out.println("Morning");//1
	}
	System.out.println("...........................");
	//while(time<12){
	//}		System.out.println("Morning");//infinite

	while(time<12) {
		System.out.println("Good Morning");//infinite
	time++;
	
	}
	System.out.println("Hello");
	}

}
