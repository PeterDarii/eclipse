package com.class03;

public class Casting {

	public static void main(String[] args) {
		
		//int i=10.99; type missmatch
		
		//widening or implicit casting
		double d=10;   //casting in java happens, converting data type to another
	
		
		System.out.println(d);
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		
		
		int cakePeace=11;
		cakePeace/=4;
		System.out.println(cakePeace);
		
		int number=12;
		double result=number/5; //i/i=i
		
		System.out.println(result);
		
		double NewNum=10;
		NewNum=NewNum/3;//d/i=d
		System.out.println(NewNum);
		
		//int num1=10+10.5; = mismatch
		double num1=10+(int)10.5;// no decimals
		System.out.println(num1);
		
		
		/*/
		 * 2 types
		 * 
		 * WIDENING happens automaticly/implitic casting
		 * byte,sort,int,long-float-double.
		 * 
		 * NARROWING happens manually/explitic
		 * double,float,long,int,short,byte.
		 */

	}

}
