package com.syntax.reviewclass10May29;

public class Recap {

	public static void main(String[] args) {
String[] disney= {"Shrek","Elsa","Googy","Mulan","Tom&Jerry"};
System.out.println(disney[1]);//Elsa

System.out.println(" All elents using regular for loop-----");
//to get all element from an array
for (int i=0; i<disney.length; i++) {
	if(disney [i].equalsIgnoreCase("Shrek")) {
System.out.println(disney[i]+" is my favorite character");
	}else {
		
	}
	System.out.println(disney[i]);
}

}


}
}
