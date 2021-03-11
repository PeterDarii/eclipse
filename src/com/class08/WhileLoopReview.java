package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		
		/*we need to make a user to pay for a soda
		 * keep asking user to pay you until it enters 
		 * 
		 * if user gives more than 3 ---> please give more money
		 * if user gives less than 3 ---> please give more money
		 * 
		 */
		int money;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for a soda");
		
		do {
			money=scan.nextInt();
			if(money<3) {
				System.out.println("Please give more money");
			}else if (money>3) {
				System.out.println("Please give less money");
				
			}
			}while(money!=3);
			
			System.out.println("Thank u for shopping");
		

	}

}
