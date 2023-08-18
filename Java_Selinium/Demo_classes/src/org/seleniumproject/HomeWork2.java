package org.seleniumproject;

public class HomeWork2 {

	public static void main(String[] args) {
	// find the largest two number
		
		int a=1000,b=200;
		
		if(a>b) { 
System.out.println("a is largest");
		}
     else  {
	System.out.println("b is largest");
     }
		
		
		
		//print the week numbers in switch case using
		
		String weekname="satdx";
		
		switch(weekname) {
		case "monday":System.out.println(1);break;
		case "tuesday":System.out.println(2);break;
		case "wed":System.out.println(3);break;
		case "thu":System.out.println(4);break;
		case "fri":System.out.println(5);break;
		case "sat":System.out.println(6);break;
		case "sun":System.out.println(7);break;
		default:System.out.println("not a week number");
		
		}
		
	}

}
