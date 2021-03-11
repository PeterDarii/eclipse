package com.class06;

import java.util.Scanner;

public class replIt {

	public static void main(String[] args) {

		String DayOfTheWeek;

	    Scanner input=new Scanner(System.in);
	    System.out.println("Input a number between 1-7");
	int day;
	day=input.nextInt();
	 
	    switch (day) {
	     case 1:
	    	 DayOfTheWeek="Monday";
					break;
		case  2:
			DayOfTheWeek="Tuesday";
					break;
		case  3:
			DayOfTheWeek="Wednesday";
					break;
		case  4:
			DayOfTheWeek= "Thursday";
			        break;
		case 5:
			DayOfTheWeek="Friday";
					break;
		case  6:
			DayOfTheWeek="Saturday";
					break;
		case  7:
			DayOfTheWeek="Sunday";
					break;
	    default:
		    DayOfTheWeek="Invalid";
	    }
	System.out.println(DayOfTheWeek);
	}

}


