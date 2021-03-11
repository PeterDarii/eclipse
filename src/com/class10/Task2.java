package com.class10;

public class Task2 {

	public static void main(String[] args) {
		
		
		String[] names=new String[5];
		names[0]="Alina";
		names[1]="Ozoda";
		names[2]="MJ";
		names[3]="Peter";
		names[4]="Ali";
		
System.out.println(names[3]);
System.out.println("============================= using Loop ===============================================");

        String[] name= {"Alina","Ozoda","MJ","Peter","Ali"};
        
        System.out.println(name[3]);
        
        //how to get all elements from an array?
        
        for(int i=0; i<names.length; i++) {
        	System.out.println(names[i]);
        }
        System.out.println("=====================================================================================");
        System.out.println(name.length);
        System.out.println("=====================================================================================");
        
        String[] words=new String[5];
        words[0]="Java";
        words[1]="Saturday";
        words[2]="Day";
        words[3]="Coding";
        words[4]="is";
        
        System.out.println(words[1]+ " " +words[4]+ " " +words[0]+ " " +words[3]+ " " +words[2]);
        }
	
	
	}


