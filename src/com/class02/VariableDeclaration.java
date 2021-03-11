package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to crate a variable
		short b=200; //crate a variable and assign value
		             //declare a variable and initialized

		//2way
		int sum; //declaration happens ONCE ONLY
		sum=20;
		sum=30; //reassign the value
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		
		int x,y,z;
		x=10;
		y=20;
		//z=30.09; Error: Type mismatch, since variable can store only int type of values
		
		//I would like to change the value of x
		x=70;
		
		System.out.println(x);
		
		int num=33;
		//we are using value of different variable to initialize the variable
		int num2=num;//33
		
		System.out.println(num2);
		
	
		
	}

}
