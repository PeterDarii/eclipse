package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
	double num1=10.20;
	double num2=15.20;
	
	if (num1>num2) {
		System.out.println("Double value " + num1 + " is larger than " +num2);
	} else if (num1<num2 ){
		System.out.println("Double value " + num2 + " is larger than " + num1);
	}else {
		System.out.println(num1 +" is equal to "+num2);
		
		
	}
		
//2. based on the day number define a day
	int day =7;
	
	if (day==1) {
		System.out.println("Today is monday");
	}else if (day ==2) {
		System.out.println("Today is tuesday");
	}else if (day ==3) {
		System.out.println("Today is wednsday");
	}else if (day ==4) {
		System.out.println("Today is thursday");
	}else if (day ==5) {
		System.out.println("Today is friday");
	}else if (day ==6) {
		System.out.println("Today is saturday");
	}else  if (day ==7){
		System.out.println("Today is sunday");
	}else {
		System.out.println("This date is invalid");
		//to format: ctrl+shift+f --> windows users
		//to format: cmd+ shift --> mac users
		
	}
	
	}

}
