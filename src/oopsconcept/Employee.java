//Class and object
package oopsconcept;


public class Employee {

	
		//class and object creation
		
//Declared the variables	
	   int eid;
	   String ename;
	   String job;
	   int esal;
	   
//method
	  void display()
	   {
		 System.out.println("eid:"+eid);
		 System.out.println("ename:"+ename);
		 System.out.println("job:"+job);
		 System.out.println("esal:"+esal);
		// System.out.println();
	   }
	  
//Main method 
	public static void main(String[] args) { 
	 
//Object creation
	  Employee emp=new Employee();
	  emp.eid=1234;
	  emp.ename="xxxx";
	  emp.job="s/w";
	  emp.esal=20000;
	  emp.display();
	  
	 Employee emp1=new Employee();
	 emp1.eid=5678;
	 emp1.ename="yyyy";
	 emp1.job="Tester";
	 emp1.esal=30000;
	 emp1.display();
	  
	
	   
	   

	}}


