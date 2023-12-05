package oopsconcept;

//default and parameterized constructor

public class ConstructorDemo {
	//Declaring variables and methods
	
	int x;
	int y;
	String s;
	
	/*ConstructorDemo() //Default constructor
	{
		x=10;
		y=20;
		s="Girija";
	}*/
	
	ConstructorDemo(int a,int b,String st)//parameterized constructor
	{
		x=a;
		y=b;
		s=st;
	}
	
	
	void display() //method
	{
		System.out.println(x);//100
		System.out.println(y);//200
		System.out.println(s);//Girija
	}
	
//main  method
	public static void main(String args[])
	{
		//ConstructorDemo cd=new ConstructorDemo();//created constructor object ,it will directly invoke the variables from default constructor
		ConstructorDemo cd=new ConstructorDemo(100, 200, "Girija");//it will invoke data from the parameterised constructor
		cd.display();
	}
	
	
	

}
