package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		
		String[][] Usa={
				{"Alexandria", "Oakton", "Arlington", "Virginai Beach", "Fairfax"},
				{"Philly", "OakStrassburg", "Pittsburg"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahasee"},
				
		
	};
		System.out.println(Usa.length);//5 total single arrays / 5 rows total
		System.out.println(Usa[0].length);// 5 elements inside 1 array/ 5 columns in 1 row
		System.out.println(Usa[1].length);// 3 elements inside 2 array/ 3 columns in 2 row
		System.out.println(Usa[2].length);// 4 elements inside 3 array/ 4 columns in 3 row
		System.out.println("======================================================================");
		
		
		for(int r=0; r<Usa.length; r++) {//iterates over rows
			for (int c=0; c<Usa[r].length; c++) {
				System.out.print(Usa[r][c]+" ");
				
			}
			System.out.println();
		}
		System.out.println("=====using nested for each loop=========");
		
		for(String[] cities:Usa) {
			for(String city:cities) {
				System.out.println(city+" ");
			}
			System.out.println();
		}
	}
}


