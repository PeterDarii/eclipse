package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {

      /*
       * store gender inside M or F
       * based on the gender we will specify
       * if M--> Male
       * if M--> Female
       * otherwise--> not sure
       */
		/*
		 * LIMITATIONS
		 * No comparing or test multiple condition(it simply checks the value)
		 * switch CANNOT be used with boolean,float,double, long
		 * 
		 * BYTE,SHORT,CHAR,INT,STRING(can work)
		 */ 
		char gender='M';
		String description;
		
		switch(gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
			break;
			
		}
		System.out.println(description);
		boolean sunny=true;
		if(sunny) {
			System.out.println("Im happy");
		}
		
		double price=10.99;
		if (price>10) {
			System.out.println("to expensive");
			
		}
		
		
		}
	}


