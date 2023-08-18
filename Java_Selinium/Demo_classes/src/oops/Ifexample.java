package oops;

public class Ifexample {
	public static void main(String[] args) {

		//odd num  
		
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i= i+2;
//		}
//		System.out.println(" ");
//		

//	 reverse string
		
//		String s1 ="rajavel";
//		String s2  ="";
//		  
//		for( int i= s1.length()-1;i>=0 ; i--) {
//			s2=s2+s1.charAt(i);
//		System.out.println(s2);
//			
//		}
//		System.out.println(s2);
//		
//		
//	 String	s3="kandasamy";
//	  StringBuilder s =new StringBuilder(s3).reverse(); //   StringBuilder s =new StringBuilder("rajavel").reverse();
//	  System.out.println(s);
//		

		
		
// fifinoseries number
		
		int s1 = 0, s2 = 1,s3;

		System.out.println(s1+""+s2);

		for (int i = 0; i < 20; i++) {

			s3 = s1 + s2;
			System.out.println(s3);

			s1 = s2;
			s2 = s3;

		}

	}
}