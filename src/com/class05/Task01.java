package com.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height =scan.nextInt();
		
		
		 if (height<=60) {
			 System.out.println("short");
		 
		 }else if (height>=60 && height<=72){
			 System.out.println(height+ " midium");
			 
		 }else {
			 System.out.println(height +" tall");
			 
			 System.out.println("Enter your day");
				int day = scan.nextInt();
				
				if(day == 1 || day == 2 || day == 3 || day == 4 ||day == 5) {
					System.out.println("It is week day");
				}else if(day == 6 || day == 7) {
					System.out.println("It is weekend");
				}else {
					System.out.println("Invalid day");
		
		 }
	}
	
}
}

