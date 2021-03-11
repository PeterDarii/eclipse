package com.class04;

public class nestedIfAnother {

	public static void main(String[] args) {
		
		boolean morning=true;
		
		boolean classToday=true;
		
		if(morning) {
			System.out.println("Im gonna work");
		}else {
			System.out.println("let me chek if i have a class today");
			
			if (classToday) {
				System.out.println("I will attend class at Syntax");
			}else {
				System.out.println("I can relax");
			}
			
		}

	}

}
