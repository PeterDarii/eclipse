package com.class02;

public class NamingConvension {

	public static void main(String[] args) {
		//keywords a special word hat reserved in a java memory: class,public,static,final, for 
		//identifiers - name that we give to classes, variable and methods
		
		/*
		 * RULE!!!
		 * DO NIT USE KEYWORD AS INDETIFIRES
		 * IDENTIFIRES CAN NOT CONTAIN SPACE
		 */
         
		//1. int final=10; error: INVALID IDENTIFIRES
		//2. byte variable one=12
		//3. short 1b=12;
		short b1=12;
		//4 long *l=2000;
		//long l*=2000;
		
		long _l=2000;
		long long_=29990;
		
		double $price=12.99;
		double price=10.99;
		
		//NamingConventions
		// 1. we use camel casing
		// 2. classes starts with Upper cases and will follow camel cases.
		// 3. variable start with lower case and will follow camel casing.
		// 4. packages we use lower case and use name as  reverse way of url.
		// 5. use meaningful name for your variables.
		
		int Number=12; // try not to use upper case names
		int number=12; // more preferable
		
		int numberOne=12;
		int numberTwo=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		
	}

}
