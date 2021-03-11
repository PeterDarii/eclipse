package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*we need to calculate final price after the discount
		 * we check if there is a sale
		 * if no sale --> I am not going for shopping
		 * if there is a sale
		 * 	            we will ask the item
		 *              we will ask price
		 *           if price is less then 10 -->apply 5 % discount
		 *           if price is between  10 and 100 --> apply 10% discount
		 *           if price is between 100 to 500 --> apply 20% discount
		 *           if price is more than 500 --> apply 30%
		 *          witch item your purchase, what was original price, what discount applies and final price
		 */
		double price, discount = 0, finalprice = 0;
		String item;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do we have sale today");
		
		boolean sale =scan.nextBoolean();
		if (!sale) {
			System.out.println("I am not going for shopping");
		}else {
            System.out.println("Do you have the item?");
            item = scan.next();
            System.out.println("Whats the price of the item");
            price = scan.nextDouble();
            
         if (price > 0 && price < 10) {
        	 discount = price*0.05;
        	 finalprice=price-discount;
         }else if(price >= 10 && price < 100) {
        	 discount=price * 0.1;
        	 finalprice=price-discount;
         }else if(price >= 100 && price <= 500) {
        	 discount=price * 0.2;
        	 finalprice=price-discount;
         }else if(price > 500) {
        	 discount=price * 0.3;
        	 finalprice=price-discount;
        	 
         }
         //finalprice=price-discount;
         System.out.println("You are buying " +item+" with original price ="+price+" after discount "+discount+ " your final price is = $"+finalprice );
         
         if(finalprice<500) {
        	 System.out.println("I didn't do crazy shopping");
         }

	}
	}
}
