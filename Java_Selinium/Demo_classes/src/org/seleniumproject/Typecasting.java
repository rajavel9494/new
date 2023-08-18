package org.seleniumproject;

class parent { 

	int id;
     void idnum() {
		System.out.println("id is printed");
}
}
class child extends parent {

	String name;
       void idname() {
           System.out.println("name is printed");
}
	}

public class Typecasting {
           public static void main(String[] args) {

		parent p = new child();              // down casting 
		p.id = 101;                            //trying to downcast child class is not possible
		p.idnum();
		System.out.println(p.id);
		
	
        child c = new child();             // up casting
		c.name = "rajavel";
		System.out.println(c.name);
		c.idname();
		c.idnum();

	}
}