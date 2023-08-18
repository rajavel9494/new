package org.seleniumproject;

public class Day3if {
	

 //if condition only one condition/9on will apply
	public static void main(String[] args) {
		
    
      int age = 45;
	if(age >=18)
      {
    	  System.out.println("eliglible for vote");
    	  System.out.println(' ');
      }   
      
      //if else condition true or false
      int ages=16;
      if(ages>=18) {
    	  System.out.println("eligible for vote");
      }
      else {
    	  System.out.println("not eligible for vote");
      }
       //else if
     int a=1000,b=5000,c=25000;
     if(a>b&&a>c) {
    	 
    	 
    	 System.out.println("a is highest value");
     }
      else if(b>a&&b>c) {
    	  System.out.println(" b is highest value");
    	  
      }
      else {
    	
    	 System.out.println("c is largest");
     }
     
     
     //switch case
     int weekno=6;
     switch(weekno) {
     case 1:System.out.println("monday");break;
     case 2:System.out.println("tuesday");break;
     case 3:System.out.println("wed");break;
     case 4:System.out.println("thu");break;
     case 5:System.out.println("fri"); 
     default:System.out.println("not a week days");
     
      }
     
     
     //given number is positive ,negative or zero
     int i=-1;
     if(i>0) {
    	 System.out.println("positive");
     }
     else if(i<0) {
    	 System.out.println("negative");
     }
     else {
     System.out.println("zero");

}

}
}