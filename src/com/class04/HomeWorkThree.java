package com.class04;

import java.util.Scanner;

public class HomeWorkThree {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter your City");
		String City=reader.nextLine();
		System.out.println("put the temperature");
		double temp=reader.nextDouble();
		double celsius=(temp-32)/1.8;
		System.out.println("The temperature of "+City+ " city is " + celsius);

		
	}

}
