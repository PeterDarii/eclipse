package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * we need to identify favorite food
		 * we need to capture country from a user
		 * based on the country identify favorite food
		 * 
		 */

		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
			
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="kebab";
			break;
		case "vietnam":
			food="Pho";
			break;
		case "poland":
			food="pierogi";
			break;
		case "kazakstan":
			food="horse";
			break;
		case "belarus":
			food="Dranniki";
			break;
		case "tajikistan":
		    food="Plov";
		    break;
		case "mexico":
		    food="Tacos";
		    break;
		default:
		    food="unknown";
		    	
			
		}
			System.out.println("Your favorite food is "+food);
	}

}
