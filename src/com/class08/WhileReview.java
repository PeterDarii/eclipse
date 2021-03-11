package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		
		
		int money;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for a soda");
		money=scan.nextInt();
		
		while(money!=3) {
		
			if(money<3) {
				System.out.println("Please give more money");
			}else if (money>3) {
				System.out.println("Please give less money");
			 
				
			}
	         money=scan.nextInt();
		}
			System.out.println("Thank u for shopping");
		

	}

}
