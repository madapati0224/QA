package Inheritancepack;
//Single Inheritance -1parent -1 child class

class A{
		int a ;//int a=10; //Directly can assign values to variable in mainmethod if needed
		void display() //method
		{
			System.out.println(a);
		}
	}
	 
class B extends A{
	    int b;//int b=20;//Directly can assign values in mainmethod if needed
	void show()
	{
		System.out.println(b);
	}
	}

public class Single {
	
		public static void main(String args[]) {
		B bobj=new B();
		
	//Directly by statements
		//System.out.println(bobj.a);//10
		//System.out.println(bobj.b);//20
		     //or
	// calling with method
		//bobj.display();
		//bobj.show();
		    //or
	//Directly assigning values to a and b	
		bobj.a=100;
		bobj.b=200;
		bobj.display();
		bobj.show();
		}} 



