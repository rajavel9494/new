package org.seleniumproject;

import java.util.Scanner;

public class Takeinputfromkeyboard {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println(num);
		
		System.out.println("enter a decimal number");
		double num1=sc.nextDouble();
		System.out.println(num1);
		
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println(s);
		
		
		
	}

}
