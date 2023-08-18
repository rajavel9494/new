package org.seleniumproject;

public class Day6classobject {
	int id;
	String name;
	double salary;
	
	void employee()
	{
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
	}
public static void main(String[] args) {
	
	Day6classobject data=new Day6classobject(); 
		data.id=101;
		data.name="raja";
		data.salary=10000.76888798767898765 ;
		data.employee();
		
		
	}
	
}


