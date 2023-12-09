package Inheritancepack;

//Multi level- parent and its sub childs

class C{
	int a=10;//variable
	
	void show()//method block
	{
		System.out.println(a);
	}
}

class D extends C{
	int b=20;
	
	void display()
	{
		System.out.println(b);
	}
}

class E extends D{
	int c=30;
	
	void print()
	{
		System.out.println(c);
	}
}

public class Multiplelevel {
	public static void main (String args[]) {
		E cobj =new E();
//Directly printing		
		//System.out.println(cobj.a);
	    //System.out.println(	cobj.b);
		//System.out.println(cobj.c);
	       //or
//calling through methods
		// cobj.show();
		//cobj.display();
		//cobj.print();
		
//Directly assiging values in main method to a,b,c
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.show();
		cobj.display();
		cobj.print();
	}}




