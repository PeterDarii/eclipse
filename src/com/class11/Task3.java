package com.class11;

public class Task3 {
public static void main(String[] args) {
	
	String [][] cars= {
			{"chevy", "cadillac", "Ford", "dodge", "buick", "gmc", "chrysler"},
			{"bmw", "audi", "mercedes", "vw"}, 
			{"hiundai","kia"},
			{"alfaromeo","maseratti","ferrari","fiat"}
			
	};
	
	for(String[]car:cars) {
		for(String c:car) {
			System.out.print(c+" ");
		}
		System.out.println();
			
	
		
		
}
	System.out.println("====================================================================");
	String [][] groceries= {
			{"tomato", "asparagus", "greens"},
			{"banana", "apple", "orange"}, 
			{"milk","sourcream"},
			{"candy","lollypop","chocolate"}
			
	};
	
	for(String[]producte:groceries) {
		for(String g:producte) {
			System.out.print(producte+" ");
		}
		System.out.println();
			
}
}
}