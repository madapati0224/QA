package Inheritancepack;

//Hierarchy :Single parent and multiple child classes and every child class is independent to each other.

class Parent{
	int a;
	void show()//or void display(int a)
	{
		System.out.println(a);
	}
}

class child1 extends Parent{
	int b;
	void display()
	{
		System.out.println(b);
	}
}

class child2 extends Parent{
  int c;
  void print()
{
	System.out.println(c);
}
}

public class Hierarchy{
	public static void main (String args[]) {
		child1 c1=new child1();
		
		c1.a=10;
		c1.b=20;
		c1.show();
		c1.display();
		
//System.out.println();	
		
		child2 c2=new child2();
				
		c2.a=10;
		c2.c=40;
		c2.show();
		c2.print();
	}}




