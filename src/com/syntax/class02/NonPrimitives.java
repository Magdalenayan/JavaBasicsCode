package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
	String name="Magdalena" ;
	
	String lastName="Yaneva";
	long phone=1234567890l;
	
	//xxx-xxx-xxxx 
	
	String phoneNumber="123-456-7890";
			
	String address="123 Washington str";
			
	int age=34;
	String city ="Oregon";
	
	
	//short cut for printing
	//syso+ctrl=space-->hit ent
	/* when we use + -->works as concatenation operator
     *                to attach String to String
	 *                to attach String to int
	 *                to attach String to double
	 *                to any other type
	  */
	
	System.out.println(name+" "+lastName);// Magdalena Yaneva
	
	//Magdalena lives in Oregon	
	
	System.out.println(name+" Lives in "+city);

	//Magdalena in 34 years old
	
    String words="years old";
	System.out.println(name+" is "+age+" "+words);
	
	
	}

}
