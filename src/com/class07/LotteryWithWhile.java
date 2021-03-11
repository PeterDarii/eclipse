package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {

		Scanner input;
		int number;
		int lotNumber=17;
		
		input=new Scanner(System.in);
		

		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		number=input.nextInt();
		
		while(number!=lotNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			number=input.nextInt();
		}
		
		System.out.println("Congrats you entered "+number+" whitch is a lucky number");
	}
}
