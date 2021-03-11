package com.class9;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Patterns2 {

	public static void main(String[] args) {
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

		
		System.out.println("--------------------------reverese numbers SQUARE-----------------");
		
		for (int r=5; r>=1; r--) {
			
			for (int c=6; c>=1; c--) {
				
				System.out.print(c+" ");
	}
			System.out.println();
		}
		
		System.out.println("---------------------------Numbers Square------------------------");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
			
	}
             System.out.println("---------------------------------------------------");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
}
}
}
