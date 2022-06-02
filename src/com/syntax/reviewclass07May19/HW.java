package com.syntax.reviewclass07May19;
import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Is there a sale going on");
boolean isSale=scan.nextBoolean();
if(!isSale) {
	System.out.println("you are not going for shopping");
}else {
System.out.println("Please enter which item you want to buy and also enter its price");
	String item=scan.next();
	double price=scan.nextDouble();
	if(price<20) {
		double discountedPrice=price*0.9;
//price=price*.1
		System.out.println(" After discount "+item+ " the price of the item reduce from"+price+"to"+discountedPrice+"+");{
			
		}else if(price>20 && price<100)
		
		discountedPrice=price*0.8
		//price=price*.1
				System.out.println("After discount "+item+" the price of the item reduce from"+price+" to "+discountedPrice+" + ");
		
	}
}
	}

}
