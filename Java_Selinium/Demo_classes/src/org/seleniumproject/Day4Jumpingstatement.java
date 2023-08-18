package org.seleniumproject;

public class Day4Jumpingstatement {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println(" ");
		
		
		for(int j=1;j<=10;j++) {
			if(j==5||j==8) {
				continue;
				
			}
			System.out.println(j);
		}

	}

}
