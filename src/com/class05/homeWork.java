package com.class05;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan= new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		creditCard=scan.nextLine();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the cc?");
			
			 balance=scan.nextDouble();
			 
			 if (balance>1000) {
				 System.out.println("pay off immediatly");
				 
			 }else {
				 System.out.println("spend more");
			 }
		}else {
			System.out.println("Would you like a credit card?");
			
		}

	}

}
