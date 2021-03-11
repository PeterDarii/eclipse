package com.class04;

public class nestedLastTask {

	public static void main(String[] args) {
		/*to donate:
		 * you must be 18 and older, otherwise you can not
		 * your weight must be more than 110 lbs, otherwise you can note donate
		 * 
		 */
		
		int age=18;
        double weight=120;
                if (age>18) {
                    System.out.println("lets check weight");
                    if (weight>110) {
                        System.out.println("you can donate");
                    }else {
                        System.out.println(" you can not donate");
                    }
                }else {
                    System.out.println("you can not donate");
                }
	
	
}

	}


