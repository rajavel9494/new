package org.seleniumproject;

public class Day4Looping {
	public static void main(String[] args) {
		
		//while looping example
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println(" ");
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		System.out.println(" ");
		//odd numbers
		int k=1;
		while(k<=100) {
			System.out.println(k);
			k=k+2;
		}
	  
		//even numbers
		int m=0;
		while(m<=100) {
			System.out.println(m);
			m=m+2;
		}
		System.out.println(" ");
		
		//do while statement
		
		int n=1;
		do {
			System.out.println(n);
			n++;
		}
		while(n<=10);
	}

}
