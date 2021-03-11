package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		
		/*check assignment and based on true score we display a message
		 * 
		 */
		
		boolean complited=true;
		int score=88;
		
		if(complited) {
			
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but lets try to do better");
			}else  {
				System.out.println("Good for trying, but study more!!!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assigments on time");

	}
	}
}
