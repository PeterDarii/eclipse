package com.class02;

public class StringExemple {

	public static void main(String[] args) {
		
		String name;
		name="Peter";
		
		String greeting="Good Morningh!";
		String phoneNumber="123-456-7890";

		String StringNumber="12";
		String worfWithSpace="";
		String letter="A";
		char oneLetter='A';
		
		//Hello my name is Peter
		System.out.println("Hello my name is "+ name);
		
        //How are you Peter?
		
		System.out.println("How are you " + name);
		
		int age=25;
		//I am 25
		System.out.println("I am "+age);
		
		char grade='A';
		//Peter is a student
		
		System.out.println(name+" is "+grade+" student");
		
	    String car="Tesla";
	    int year=2021;
	    
	    // I drive 2021 Tesla
	    
	    System.out.println("I drive "+year+" "+ car);
	    
	    String computer="Mcbook";
	    int memory=250;
	    
	    System.out.println(name+" has "+computer+" with "+ memory+ " Gb memory");
	    
	    String combinedValue = year+ " " + car;//2021 Tesla
	    
	    System.out.println(combinedValue);
	    
	    byte day=7;
	    String month="February ";
	    String date=month+day;
	    
	    System.out.println(date);
	    
	    
		
	}

}
