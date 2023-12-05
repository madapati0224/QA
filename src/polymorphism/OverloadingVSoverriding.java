package polymorphism;

//overloading -Same method but parameters are different.
//overriding-same method and parameters but body is different.

class ABC{

	void m1( int a)//parameterized method
	{
		System.out.println(a);//body
	}

	void m2(int b)
	{
		System.out.println(b);//20
	}
}

class XYZ extends ABC { 
	
	 void m1(int a) //same method&order
	 {
		 System.out.println(a*a);//100  //body different  //overriding
	 }
	 void m2(int a, int b) //same method and order different
	 {
		 System.out.println(a+b);//30  //overloading
	 }
}
	 
//main class
public class OverloadingVSoverriding {
	public static void main(String args[]) {
		XYZ xyz =new XYZ();
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(10,20);
	}
}
//m1 is overrided so m1 is replaced with m2 variable.



