package practise2;

public class Constructor {
	int x,y;
	String s;
/*	Constructor() //Default constructor
	{
		x=10;
		y=20;
		s="xxxx";
	}*/
	
	Constructor (int a,int b,String st)//parameterized constructor
	{
		x=a;
		y=b;
		s=st;
		
	}
	
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);

}
//mainmethod

public static void main(String args[]) {
	//Constructor con =new Constructor();
	Constructor con =new Constructor(100,200,"yyyy");
	con.display();
	
	
}}
