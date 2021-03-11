package com.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		boolean rain=true;
		int temperature=60;
		
		while (rain) {
			System.out.println("I will stay home");
			
			if(temperature>75) {
				System.out.println("I will walk under warm rain");
				break;
			}
			temperature+=2;
			
			//System.out.println("I am a code inside while loop");CE: unreachable code
		}
for (int i=1; i<=10; i++ ) {
	System.out.println("Hello");
	
	if(i==5) {
	
	break;
	
}
	System.out.println("I am inside the loop");
}
	}

}
