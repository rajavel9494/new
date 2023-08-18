package oops;

public class Empdata {

	public static void main(String[] args) {
	    // employee emp= new employee();
	    
	     /* 1 st approach
	     emp.id=101;
	     emp.name="raja";
	     emp.salary=15000;
	     emp.num=9842517020L;
	     emp.data();*/
	 
	     
	     /*2nd approach
	     
	     emp.setdata(101, "raja", 15000, 9842517020l);
         emp.data();*/
		
		employee emp=new employee(101,"raja",15000,9842517020l);
		emp.data();
	     
	     
	     
	}

}
