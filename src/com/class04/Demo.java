package com.class04;

import java.util.Scanner;
//short cut to import for windows : ctrl+shift+o

public class Demo {

	public static void main(String[] args) {
		
	int i=10;
	String str="Hello";
	//captures entire text
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any text");
	
	String text=scan.nextLine();//scan.nextLine(); --> capture your input from console,
	                            //once you enter text you must HIT ENTER
	
	System.out.println("Text that i entered is " +text);
	
	System.out.println("Please eneter your name");
	
	String name=scan.next();// captures one word till spase
	
	System.out.println("Nice to meet you " +name);
	
	System.out.println("Please enter your age ");
	
	int age=scan.nextInt();
	
	System.out.println("My name is " +name+ " and I am " +age+ " years old ");
	
	

	}

}
