package com.syntax.class08may22;

public class ContinueKeyWord {

public static void main(String[] args) {
//continue -skips current execution/iteration
//when java executes continue-->go back to the beginning of the loop,
//so rest of the code inside the loop body
//will be skipped/ignored
		
		for(int i=1;i<=5;i++) {
			if(i==2) {
			continue;
			}
			System.out.println(i +" ");//1 3 4 5 skip 2
			System.out.println("Hello");
			System.out.println(" We are going on break soon");
			
			
//print numbers from 1 to 10	except number 5 and 7
			
for(int a=1; a<=10; a++) {
	if(a==5 || a==7) {
		continue;
	}
	System.out.print(i+" ");
}
		}
	}

}
