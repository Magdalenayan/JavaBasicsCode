package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=100;
       num=num+100;//100+100=200
       
       System.out.println(num);//200
		
       num=num+50;
       System.out.println(num);//250
       
       num+=100;// num=num+100//350
       
       num-=10; //num=num-10//350-10
       
       System.out.println(num);//340
       
       num/=10;//34
       
	num*=2;//34*2=68
		
		System.out.println(num);
		
		num%=2;
		System.out.println(num);//0
		
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;//a=a+b
		//30
		System.out.println(a);
		
      a+=b+c;//a=a+b+c
      //30+50(b+c=50)=>80
    System.out.println(a);
      
    
    a*=10;
    System.out.println(a);//800
    
   
    
   
      
       
       
	}

}
