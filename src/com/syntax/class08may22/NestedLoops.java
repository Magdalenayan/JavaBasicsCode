package com.syntax.class08may22;

public class NestedLoops {

	public static void main(String[] args) {
for(int i=1; i<3; i++) {//outer loops
	System.out.println("Hello");
	
	for(int y=1; y<=2; y++) {//nested loop
		System.out.println("Bye");
	}
	
}


System.out.println("------------------------------");
for (int i=1;i<=3;i++) {//outer loop control inner loop
	System.out.println(i);
	for (int y=1; y<=2; y++) {//inner loop depends on the outer loop
		System.out.println(y);
	}
}
System.out.println("---------------------------");

for(int i=1; i<=3; i++) {
	for(int y=1;y<=2;y++) {
		System.out.print(i+" "+y);
	}
}
System.out.println("-----------------------------");

 for (int d=1;d<=3; d++) {
	 System.out.println("Hello");
	 for (int y=1;y>=2;y++) {
		 System.out.println("Bye");
	 }
 }
 
 System.out.println("-----------------------");
 for(int c=1; c>3; c--) {       
	                        // this code will never enter
	 System.out.println("Hello");
	 for(int y=1; y<=2;y++) {//inner loop
		 System.out.println("Bye");
	 }
 }
	}

}
