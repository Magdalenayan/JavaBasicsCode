package com.syntax.reviewclass07May19;

public class SwitchDemo1 {

	public static void main(String[] args) {
String country="USA";
switch(country) {

case"Turkey":
	System.out.println("Ankara");
	break;
case "USA":
System.out.println("DC");
break;
case "Serbia":
System.out.println("Belgrad");
break;
case "Albania":
	System.out.println("Tirana");
break;
case "Afganistan":
	System.out.println("Kabul");
break;
case "Pakistan":
	System.out.println("Islamabad");
break;
default:
	System.out.println("Not a valid country");
	
}
	}

}
