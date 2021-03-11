package com.class9;

public class CarExample {

	public static void main(String[] args) {
		
	
		for(int i=0; i<10; i++) {
			for(int j=0; j<=9; j++) {
				for(int b=0; b<10; b++) {
					for(int m=0; m<=9; m++) {
				System.out.println(i+" "+j+" "+ b +" "+m);

	}
		}
}
}
		System.out.println("----------------------------clock------------------------------------");
		
		for(int a=0;a<23;a++) {
			for(int b=0;b<6;b++) {
				for(int c=0;c<=9;c++) {
					System.out.println(a+":"+b+""+c);
	}
}
			System.out.println("----------------------------clock with if------------------------------------");
					
					for(int h=0;h<24;h++) {
				for(int m=0;m<60;m++) {
					if (h<10 && m<10) {
						System.out.println("0"+h+":0"+m);
					}else if (h<10 && m>=10) {
						System.out.println("0"+h+":"+m);
					}else if(h>=10 && m<10) {
						System.out.println(h+":0"+m);
					}else {
						System.out.println(h+":"+m);
					}
					}
				
				}
					System.out.println("----------------------------clock with nested if------------------------------------");
					
					for(int h=0;h<24;h++) {
						for(int m=0;m<60;m++) {
							if(h<10) {
								
								if(m<10) {
									System.out.println("0"+h+":0"+m);
								}else {
									System.out.println("0"+h+":"+m);
									
								}
							}else {
								if(m<10) {
									System.out.println(h+":0"+m);
								}else {
									System.out.println(h+":"+m);
								}
							}
							
				}
			}
	
	System.out.println("--------------------------multiplication table------------------------------------");
	
	
	}
		int result;
		for (int a=1; a<=9; a++) {
		       for (int b=1; b<=9; b++) {
						result=a*b;
						System.out.println(a+" * "+b+" = "+result);
	}
}
	}
}
