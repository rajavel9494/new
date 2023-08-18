package oops;

public class employee {
	int id;
	String name;
	double salary;
	 long num;
	
	 //1st approach
	void data() {
		System.out.println(id+" "+name+" "+salary+" "+num);  
	
		
		
		
	}
	
	//2nd approach
		void setdata(int eid,String ename,double esalary,long enumb) {	
		 
			id=eid;
			name=ename;
			salary=esalary;
			num=enumb;
			
			}
		//3d approach
		
		employee(int eid,String ename,double esalary,long enumb) {	
			 
				id=eid;
				name=ename;
				salary=esalary;
				num=enumb;
				
		
}
}
