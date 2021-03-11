package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean morning=true;
		boolean classToday=false;
		
		//is it morning?----> Good morning
		//if there is a class: yes -----> hello classmates
        // otherwise-----> hello my family
		
		if (morning) {
			System.out.println("Let me check if I have class today");
			
			if(classToday) {
				System.out.println("Good morning my classmates");
			} else {
				System.out.println("Good morning my family");
			}
			
			}
				
				System.out.println("------end of the code----------");

				System.out.println("------exemple 2----------");
				
				boolean anyAllergy=true;
				boolean pollenAllergy=false;
				
				String allergy="pollen";
				if(anyAllergy) {
					System.out.println("Lets check witch allergies you have ");
					
					if(pollenAllergy) {
						System.out.println("dont get close to trees ");
					}else {
						System.out.println("Ok I know you dont have pollen allergy ");
					}
				}else {
					System.out.println("You are lucky not having any allergies");
					
					
				
				}
				System.out.println("---------example 3---------------");
				
				/*
				 * if it is friday -->go to the movie, otherwise stay at home and study
				 * if it is friday -->then i will chek if day is 13 --> if yes --> watch scary movie
				 *                                                   if no--> watch any movie you like
				 */
				
				boolean isFriday=true;
				int day=13; 
				
				
				  
				if(isFriday) {
					  System.out.println("It is a movie day!!!");
					  
					  if(day==13) {
						  System.out.println("I will watch a scary movie ");
						  
					  }else { 
						  System.out.println("I will watch any avaliable movie ");
						  
			 }
					  }else { 
					System.out.println("I will stay at home and study Java");
					
				}

				
					
				}
			}
	
	
	



