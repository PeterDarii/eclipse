package com.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
	
		int num1, num2, num3, largest;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers");
num1=input.nextInt();//-->10
num2=input.nextInt();//-->11
num3=input.nextInt();//-->12

if (num1==num2 &&  num2==num3) {
	System.out.println("Numbers are equal");
}else {
	


if (num1>num2) { // we assume that number 1 is bigger than number 2
	
	if(num1>num3) {
		largest=num1;
		
	}else {
		largest=num3; }
	
	}else { //assuming number 2 is bigger than number 1
	    
		if (num2>num3) {
			largest=num2;
		}else {
			largest=num3;
			
			System.out.println("The largest number among "+num1+ ", "+num2+", "+num3+" , is "+largest);
		}
	
	}
System.out.println("----------------------------------------------I am done---------------------------------------------------------");
}
	}
}

	


		
	




