package com.syntax.reviewclass06;

public class SwitchDemo {

public static void main(String[] args) {

 char choice='Y';
 String meaning;
 //variable and matching cases MUST BE of same type
 //Switch does not allow to have duplicated cases
 switch(choice) {
 case 'Y':
	 meaning="Yes";
	 break;
 case'M':
	 meaning="Maybe";
	 break;
 case 'N':
	 meaning="No";
	 break;
	 default:
		 meaning="UnKnow";
		  }
 System.out.println(meaning);
	}

}
