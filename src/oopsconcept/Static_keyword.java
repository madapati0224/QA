package oopsconcept;

public class Static_keyword {
	//STATIC is a keyword ,it is used when we find common data across all the object
		//Static can be used for methods also.
		//we use static to overcome duplications and updations
		
		static int a=10; //Static variable
		int b=20;       //non static variable
		
		static void m1() //Static method
		{
			System.out.println("m1 is static method");
		}
		void m2() //non static method
		{
			System.out.println("m2 is non static");
		}
	/*3)Non static method inside the class can access non-static & static methods & variables */
		
		void m3() //non-static method
		{
			System.out.println(a);//static
			System.out.println(b);//non-static
			m1();//static
			m2();//non-static
		}
		
		
	//main method
	public static void main (String args[]) {
		
	/*1)Static variables can access directly in static method without creating objects.*/
		
		System.out.println(a);//a is static we can access directly in static method//10
//		System.out.println(b);//b is non-static so we can't access directly have to access throught object
		
		m1();// m1 is static we can access directly in static method //static
//		m2();//m2 is non-static so we can't access directly have to access throught object
		
	/*2)non-static variables can be accessed in static method only through object creation.*/
		
	Static_keyword sk=new Static_keyword();
		
		System.out.println(sk.b);//20
		sk.m2(); //m2 non-static
		
	/*4)If MAIN method is in Another class then we can access the STATIC variables & METHODS
	 * by classname.variable eg:s.o.pln(Static_keyword.a);a static variable
	 *    classname.method eg:s.o.pln(Static_keyword.m1);m1 static variable.
	 */
		
		
		
		
		

	}}



