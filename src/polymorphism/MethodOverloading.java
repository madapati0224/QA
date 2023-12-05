package polymorphism;

public class MethodOverloading {
	
	//polymorphism-one thing in many forms.
	
/*4 rules are applicable in overloading
-----------
1) Method names should be same
2) number of parameters should be different
3) Data type of parameters should be different
4) Order of parameters should be different */

//variables declared
	int x,y;    
	double d;
	
//method without parameters
	void sum()  //method1
	{
		x=10;      //x,y are INSTANCE/CLASS VARIABLES
		y=20;
		System.out.println(x+y);
	}
	
//same method with parameters
	void sum(int a,int b)  //method2
	{
		x=a;     //a,b LOCAL/METHOD VARIABLES
		y=b;
	System.out.println(x+y);
		
	}
	
//same method with same parameters and 2 different data types
	
	void sum(int a,double b) //method3
		{
			x=a;
			d=b;
			System.out.println(x+d);
		}
	
//same method with same parameters and  data types and oder different
	void sum(double b,int a) ////method4
	{
		d=b;
		x=a;
		System.out.println(d+x);
	}
	
//method
	void display()
	{
		System.out.println(x);//10
		System.out.println(y);//20
		System.out.println(d);//20.5
	}

	
//main method
	public static void main (String args[]) {
		MethodOverloading mo= new MethodOverloading();
		mo.sum(); //method1 execute- 30
		mo.sum(10, 20); //method2 execute -30
		mo.sum(10, 20.5); //method3 execute -30.5
		mo.sum(20.5, 10); //method4 execute -30.5
		mo.display();
		
	}
	
	

	
	
	
	

	

}
