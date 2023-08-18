package oops;

public class Arraystring {

	public static void main(String[] args) {
	
		int[]arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++){
	
System.out.println(i);
		}
		
		
		
		
		String[]names=new String[5];
		names[0]="raja";
		names[1]="vel";
		names[2]="arun";
		names[3]="kumar";
		names[4]="senthil";
		
		System.out.println(names.length);
		
		for(String name:names) {
			
			System.out.println(name);
		}
		
		
		
		int[]num= {100,200,300,400,500};
		System.out.println(num.length);
		System.out.println(num[1]);
		
		
		

	}
}
