package polymorphism;
//Constructor and Method overloading in polymorphism

//Constructor overloading in polymorphism

public class ConstructorOverloading {
	//variables 
	int x,y;
	double d;
	
//no parameters	
	ConstructorOverloading()  //con1
	{
	x=100;
	y=200;
System.out.println(x+y); //300
	}
	
//constructor with 2 parameters
	ConstructorOverloading(int a ,int b) //con2
	{
		x=a;
		y=b;
	}
	
//constructor with 2 parameters and different data types
	ConstructorOverloading(int a,double b) //con3
	{
		x=a;
		d=b;
	}
	
//constructor with 2 parameters and same data types but order different
	ConstructorOverloading(double b,int a) //con4
	{
	    d=b;
		x=a;
	}
	
//method
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
//Main method
	public static void main (String args[]) {
	//ConstructorOverloading co=new ConstructorOverloading(); //Invoke directly call con1
	// ConstructorOverloading co=new ConstructorOverloading(100,200);//call con2
	//ConstructorOverloading co=new ConstructorOverloading(100,10.5);//call con3
		ConstructorOverloading co=new ConstructorOverloading(20.5,10);//call con4
		
	co.display(); //call method with object reference explicitly
		
	}}

