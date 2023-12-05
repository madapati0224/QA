package oopsconcept;

//This_keyword using CONSTRUCTOR and METHOD

//using THIS keyword by using constructor

//using different variables in instance and method 

public class This_keyword {
	/*	int x;  //x,y instance/class variable
	    int y;

	This_keyword(int a,int b ) //parameterized constructor
	{
		x=a;  //a,b local/method variable
		y=b;
	}
	
	void display()
	{
		System.out.println(x);//100
		System.out.println(y);//200
		System.out.println(x+y);//300
	}
	
//main method
	public static void main(String args[]) {
		This_keyword tk=new This_keyword (100,200);//invoke directly no need to create object
		
		tk.display();
	}}	*/


	
//THIS key word is used when we want to declare same variables in class and method 
//By using THIS we can reduce the memory
	
//THIS variable represents/indicates the class variables and method
	
	/*int x;
	int y;
	
		This_keyword(int x ,int y )
		{
			//x=x;
			//y=y;
		
			this.x=x;
			this.y=y;
		}
		
		void display()
		{
		    //System.out.println(x);//0
			//System.out.println(y);//0
			//System.out.println(x+y);//0
			
			System.out.println(x);//10
			System.out.println(y);//20
			System.out.println(x+y);//30
		}
		
	//main method
		public static void main(String args[]) {
			This_keyword tk=new This_keyword(10,20);
			
			tk.display();
			
		}} */

//Using THIS keyword in METHODS
	int x, y;
	
	//void setdata(int a,int b)
	  void setdata(int x,int y)
	{
		//x=a;
		//y=b;
		  
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		//System.out.println(x); //10
		//System.out.println(y);//20
		//System.out.println(x+y);//30
		
		System.out.println(x); //10
		System.out.println(y);//20
		System.out.println(x+y);//30
	}
	
//main method
	public static void main (String args[]) {
		This_keyword tk=new This_keyword();
		tk.setdata(10, 20); //calling method with the object reference
		
		tk.display();
		
	}
	
	
	


			
		
}
		
	
	


