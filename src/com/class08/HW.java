package com.class08;

public class HW {

	public static void main(String[] args) {
		System.out.println("---------------------------One Way------------------------------");
		int SumEven=0;
		for(int i=0;i<=50;i+=2) {
			SumEven+=i;
			
		}
   System.out.println("The sum of Even numbers is " + SumEven);
   
   int sumOdd=0;
		   for (int i=1;i<=50; i +=2) {
			   sumOdd += i;
			   
		   }
		   System.out.println("The sum of Odd numbers is " +sumOdd);
			System.out.println("---------------------------Another Way------------------------------");
			
			int odd=0;
			int even=0;
			
			for (int i =0; i <= 50; i++) {
				
				if(i%2==0) {
					even+=i;
				}else {
					odd+=i; 
					
				
				}
			}
			  System.out.println("The sum of Odd numbers is " +odd);
			  System.out.println("The sum of Even numbers is " + even);
			
	}

}


