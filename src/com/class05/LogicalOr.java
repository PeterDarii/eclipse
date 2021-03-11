package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day
		 * if day is tuesday or wednsday--> manual class
		 * if day is monday or friday--> no class
		 * if day is saturday or sunday --> JAVA class
		 * if day is thursday --> review class
		 */

		String day="Saturday";
		
		if (day.equals("Monday") ||  day.equals("Friday")) {
			System.out.println("Today I have no class");
		}else if (day.equals("Tuesday") || day .equals("Wednseday")) {
			System.out.println("Today I have manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Today I have manual class");
		}else if (day.equals("Saturday") || day .equals("Wednseday")) {
			System.out.println("Today I have JAVA class");
		}else {
			System.out.println(day + " is invalid" );
		}
		
	}

}
