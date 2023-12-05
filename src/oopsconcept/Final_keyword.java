package oopsconcept;

/*Final keyword is used for varibles,methods and for classes also.
 * once we make variable or method or class as final we can't change further.
 * Final is used for security purpose.
 */

//Final variable
/*class Test{
	final int x=100; //Final variable
}

public class Final_keyword {
	public static void main (String args[]) {
		Test t=new Test();
		
		//t.x=200;//x cannot be assign the new value because it is final
		
		System.out.println(t.x);//100
	}}*/

//Final method
/*class Test{
	final void m() //final method
	{
	System.out.println("m is from test class");	
	}
}
class test1 extends Test{
	void m()  //Cannot override  because  method in Test is final 
	 from Test
	{
		System.out.println("m is from test1 class");
	}
}*/

//Final class
/*final class Test{
	final void m() //final method
	{
	System.out.println("m is from test class");	
	}
}
class test1 extends Test{ //The type test1 cannot be subclass to the final class
	 class Test
	void m()  //Cannot override  because  method in Test is final 
	 from Test
	{
		System.out.println("m is from test1 class");
	}
	
}*/


		
		
	
	


