package com.class07;

public class Task {

	public static void main(String[] args) {
		
int num=1;
		
while (num<=100) {
System.out.print(num+" ");
num++;

	}
System.out.println();
System.out.println("----------------------------------------------------------------------------------------");

int num1=100;

while (num1>=1) {
System.out.print(num1+" ");
num1--;
}
System.out.println();
System.out.println("----------------------------------------------------------------------------------------");

int num2=20;

while (num2<=100) {
System.out.print(num2+" ");
num2 += 2;
}
System.out.println();
System.out.println("----------------------------------------------------------------------------------------");

int num3=20;

while (num3<=100) {
	if(num3 % 2 == 0) {
System.out.print(num3+" ");
num3 += 2;
}
}
}
}