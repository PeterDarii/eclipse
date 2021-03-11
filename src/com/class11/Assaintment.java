package com.class11;

public class Assaintment {

	public static void main(String[] args) {
		
	//Create 2D array of countries: north american countries, south american countries, europe countries, asian countries, african countries.
    //Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
    
		
		String[][] countries={
				{"usa,","mexico,","canada,","panama,","jamaica,","bahamas,"},
		        {"argentina,","brazil,","peru,","bolivia,","chile,","venezuela,"},
		        {"ucraine,","moldova,","turkey,","russia,","poland,","serbia,"},
		        {"kazakhstan,","japan,","china,","thailand,","philippines,","nepal,"},
		        {"ivory coast,","nigeria,","egypt,","algeria,","tunisia,","morocco,"},
		        };
		System.out.println(countries.length+ " columns");
		System.out.println(countries[0].length+ " rows");
		System.out.println(countries[1].length+ " rows");
		System.out.println(countries[2].length+ " rows");
		System.out.println(countries[3].length+ " rows");
		System.out.println(countries[4].length+ " rows");
		System.out.println("=========================================1st way========================================================");
	
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("========================================2nd way=========================================================");
		for (String[] land : countries) {
			for (String c : land) {
				System.out.print(c + " ");
			}
			System.out.println();
         }
		System.out.println();
		System.out.println("========================================calculation=====================================================");
		

		int num=countries[0].length+countries[1].length+countries[2].length+countries[3].length+countries[4].length;
		System.out.println("There has been stored a total of " + num +" countries");

	 }
 }
		
