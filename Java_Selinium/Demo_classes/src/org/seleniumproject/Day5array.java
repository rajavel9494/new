package org.seleniumproject;

public class Day5array {

	public static void main(String[] args) {
		//   1 approach single dimension array
		
		/*int a[]= new int[5]; // 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		
		int [] a ={20, 30, 40, 50,60};
		
		System.out.println(a[4]);
		System.out.println(a.length);
		System.out.println("");
		
       //2 approach
		
		int b[]= {10,30,50,70,90};
		System.out.println(b[3]);
		System.out.println("");
		
		
		// for loop
		
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
		System.out.println(""); 
		
		//enchanced for loop
		
		for(int num:b)
		{System.out.println(num);
		}
		System.out.println("");
		
		
		
		// two dimensional array
		
		int c[][]=new int[3][2];   //int [][] a ={{20,25,30,35,40},{45,50,55,60,65}};
		 c[0][0]=5;
		 c[0][1]=10;
		 c[1][0]=15;
		 c[1][1]=20;
		 c[2][0]=25;
		 c[2][1]=30;
		 System.out.println(c[1][1]);
		 System.out.println(c.length);
		 System.out.println(c[0].length);
		 System.out.println("");
		 
		 
		 // approach 2two dimensional array
		 
		 int d[][]= {{1,3,},{7,9,},{11,13}};
		 System.out.println(d.length);
		 System.out.println(d[1].length);
		 System.out.println("");
		 
		 // enchanced foor loop
		 
		 for(int f[]:d) //f value any name assign single dimensional array
			             //d is 2 dime array
			             //dvalue is print value
			             //f value 1 single array
		 {
			 for(int dvalue:f) {
				 System.out.print(dvalue);
				 
			 }
			 System.out.println();
			 
				 
		 }
		 
		 
		 
		 
		 
		
		
	}

}
