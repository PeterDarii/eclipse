package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
	
		/*
		 * we play the lottery and we have a magic number witch is 17
		 * we need to keep asking a user to enter any number from 1 to 100
		 * UNTIL correct number is entered
		 */

		Scanner input;
		int number;
		int lotNumber=17;
		
		input=new Scanner(System.in);
		
		do {
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		number=input.nextInt();
		
		}while(number!=lotNumber);
		
		System.out.println("Congrats you entered "+number+" whitch is a lucky number");
	}

}
