package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
		int height;
		System.out.println("Please enter your height in inches");
		height = scan.nextInt();
		
		String definition;
		
		
		 if (height<=60) {
			 definition="short";
		 
		 }else if (height>=60 && height<=72){
			 definition="midium";
			 
		 }else {
			 definition="tall";
			 

	}
	}
}
