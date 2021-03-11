package com.class04;

public class taskNumOne {

	public static void main(String[] args) {
		
		boolean diploma = true;
		double GPA = 3.5;
		if (diploma) {
			System.out.println("Congratilations");
			
			if (GPA >= 3.5) {
				System.out.println("You are eligible for scholarship");
				
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Get a degree");
		}
	}
}
