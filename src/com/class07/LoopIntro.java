package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		
	System.out.println("Hello");
	
	int time=17;
	if (time <12){
	   System.out.println("Hello");
	   

		   
	}
	System.out.println("--------------------------------------------------------------------------------------");
	   while (time<12) {
		   System.out.println("Hello");//code runs forever and only if its true
		   time--; // 

}
	   
	   System.out.println("------------------------------numbers 1 to 10---------------------------------------");
	   
	   int num=1;
	   
	   while(num<11) {
		   System.out.println(num);
		   num++;
	   }
	   System.out.println("------------------------------numbers 20 to 40---------------------------------------");
	   num=20;
	   while(num<=40) {
		   System.out.print(num+ " ");
		   num++;
	   }
	   System.out.println();
	   System.out.println("------------------------------numbers 10 to 1---------------------------------------");
	   int a=10;
	   while(a>=1) {
		   System.out.print(a+ " ");
		   a--;
	}
	
	}
}