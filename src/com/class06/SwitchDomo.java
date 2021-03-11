package com.class06;

public class SwitchDomo {

	public static void main(String[] args) {
		
		int day =5;
		String weekDay;
		
		
		if (day==1) {   // condition based
			weekDay="Monday";
		}else if (day ==2) {
			weekDay="Tuesday";
		}else if (day ==3) {
			weekDay="Wednsday";
		}else if (day ==4) {
			weekDay="Thursday";
		}else if (day ==5) {
			weekDay="Friday";
		}else if (day ==6) {
			weekDay="Satuday";
		}else  if (day ==7){
			weekDay="Sunday";
		}else {
			weekDay="Invalid";

	}
		if(!weekDay.equals("Invalid")) {
			
		System.out.println("Today is "+weekDay);
		
	}
		System.out.println("---------------------using switch------------------------------");
		
		String weekDay1;
		
		switch(day) {// is a value based
		       //we MUST have break in every case
		       // values MUST match a variable type
		case 1:// we CANNOT have duplicate cases(all the cases must be unique).
			weekDay1 = "Monday";
		           break;
		case 2:
			weekDay1 = "Tuesday";
		           break;
		case 3:
			weekDay1 = "Wednsday";
	               break;
		case 4:
			weekDay1 = "Thursday";  // it jumps right away to the matching case
	               break;
		case 5:
			weekDay1 = "Friday";
		           break;
		case 6:
			weekDay1 = "Saturday";
		           break;
		case 7:
			weekDay1 = "Sunday";
	               break;
			
			default:
			weekDay1= "Invalid";
		           break;
			
		}
		if(!weekDay.equals("Invalid")) {
				System.out.println("Today is "+weekDay);
		}
}

}

