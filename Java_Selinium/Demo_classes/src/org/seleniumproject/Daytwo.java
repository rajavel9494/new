package org.seleniumproject;

public class Daytwo {

	public static void main(String[] args) {
		//arithmetic operator
		
		int a=25,b=35,c=45;
		System.out.println(a+b);
		System.out.println(c-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
	//relational operator
		int a1=50,a2=60,a3=50;
		System.out.println(a1>a2);
		System.out.println(a1<a2);
		System.out.println(a1>=a2);
		System.out.println(a1<=a2);
		System.out.println(a1!=a2);
		System.out.println(a1==a3);
		System.out.println('-');
		

	
		
	//logical operator
		
          boolean t=true ,t1=false;
          System.out.println(t&&t1);
          System.out.println(t||t1); 
          System.out.println(!t&&t1);
          System.out.println(t&&!t1);
          System.out.println(!t);
          System.out.println(!t1);
          System.out.println('-');
          
          //increament operator
          
          int r= 44;
          r++;
          ++r;
          System.out.println(r);
          
//decreament operator
          int s=132;
          --s;
          s--;
          System.out.println(s);
	}

}
