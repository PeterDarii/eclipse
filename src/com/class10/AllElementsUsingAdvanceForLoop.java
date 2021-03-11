package com.class10;

public class AllElementsUsingAdvanceForLoop {

	public static void main(String[] args) {
		
		int[] numbers= {10, 14, 78, 5, 90};
		
		//for each, enhanced for loop, advanced for loop
		
		for(int num:numbers) {
			
			System.out.print(num+" ");
		}
           System.out.println();
		System.out.println("=======================================================================");
		
		String[] name= {"Alina","Ozoda","MJ","Peter","Ali"};
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		  System.out.println();
			System.out.println("====================== Advanced for loop ===========================");
			
			for(String n: name) {
				
				System.out.print(n+" ");
			}
			
			 System.out.println();
				System.out.println("======================  ===========================");
				
				char[] grade= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
				
				for(char grades:grade) {
					System.out.print(grades+" ");
					
				}
				System.out.println();
				System.out.println("======================  ===========================");
				
				boolean [] boo= {true,false,false,false,true};
				
				for(boolean b:boo) {
					System.out.print(b+" ");
				}
	}

			

}
