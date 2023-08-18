package org.seleniumproject;

public class Day5string {

	public static void main(String[] args) {
	    String name="   rajavel    ";
	    System.out.println(name);
	    String s="he is my kandasamy ";
	    System.out.println(s);
	    System.out.println(name.length());
	    
	    System.out.println(name+s);
	    System.out.println(s.length());//length of total string
	   
	    System.out.println(name.trim());// trim means blank space remove
	    System.out.println(name.charAt(5));// index concept
	    System.out.println(s.contains("Kanda"));//contains means correct string value
	    System.out.println(s.contains("kanda"));//contains means correct string value
	    System.out.println(s.equals("kandasamy"));
	    System.out.println(s.equals("Kandasamy"));
	    System.out.println(s.equalsIgnoreCase("KANDASAMY"));// s value capital or small contains true value
                                                            //otherwise wrong value it will false
	    
	    System.out.println(name.replace('a', 'x'));   // a value replace x from rajavel
	    System.out.println(s.replace("kandasamy", "hero")); //kandasamy replace hero
	    System.out.println(s.substring(0, 7));  // 1 value  starting index  0,1,2,3,4,
	                                              //last value is index is start 1,2,3,4,5
	    
	    System.out.println(s.toUpperCase());
	    
	    
	   String arr[]=s.split(" ");
	   System.out.println(arr[0]);
	   

	    
	 

	    
	 

	}

}
