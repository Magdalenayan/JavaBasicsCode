package com.syntax.reviewclass07May19;

public class IfElse5 {

	public static void main(String[] args) {
	String coutry="Turkey";
	
if("Turkey".equals(coutry))	{
	System.out.println("Ankara");
}else if("USA".equals(coutry)) {
	System.out.println("Washington");
}else if ("Serbia".equals(coutry)) {
	System.out.println("Belgrad");
}else if ("Albania".equals(coutry)) {
	System.out.println("Tirana");
}else if ("Afghanistan".equals(coutry)) {
	System.out.println("Kabul");
}else if ("Pakistan".equals(coutry)) {
	System.out.println("Islamabad");
}
//When multiple if else if condition result in same 
//output than we can replace if else in condition with
//logical||operator
	}
}

